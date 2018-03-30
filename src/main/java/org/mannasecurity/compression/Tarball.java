package org.mannasecurity.compression;

import com.google.common.base.Preconditions;
import com.google.common.io.Closeables;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream;
import org.apache.commons.compress.archivers.tar.TarArchiveOutputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream;
import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.RegexFileFilter;

/**
 * Created by jtmelton on 7/19/17.
 */
public class Tarball {

    /**
     * Extract tarball to directory
     *
     * @param tarball              source tar.gz file.
     * @param destinationDirectory destination directory.
     */
    public static void extract(byte[] tarball, File destinationDirectory) {
        Preconditions.checkArgument(tarball != null, "Tarball must be non-null");
        Preconditions.checkNotNull(
            destinationDirectory != null, "Destination directory must be non-null");

        ByteArrayInputStream bain = null;
        BufferedInputStream in = null;
        GzipCompressorInputStream gzIn = null;
        TarArchiveInputStream tarIn = null;

        try {
            bain = new ByteArrayInputStream(tarball);
            in = new BufferedInputStream(bain);
            gzIn = new GzipCompressorInputStream(in);
            tarIn = new TarArchiveInputStream(gzIn);
            TarArchiveEntry entry = null;

            while ((entry = (TarArchiveEntry) tarIn.getNextEntry()) != null) {

                File f = new File(destinationDirectory.getAbsolutePath(), entry.getName());
                if (entry.isDirectory()) {
                    // dir - create
                    f.mkdirs();
                } else {
                    // file - write
                    f.getParentFile().mkdirs();
                    final OutputStream outputFileStream = new FileOutputStream(f);
                    IOUtils.copy(tarIn, outputFileStream);
                    outputFileStream.close();
                }
            }

        } catch (IOException e) {
            throw new IllegalStateException("Failure extracting tarball.", e);
        } finally {
            Closeables.closeQuietly(tarIn);
            Closeables.closeQuietly(gzIn);
            Closeables.closeQuietly(in);
            Closeables.closeQuietly(bain);
        }
    }

    public static void compress(Path inputDirectoryPath, File outputFile) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
             GzipCompressorOutputStream gzipOutputStream = new GzipCompressorOutputStream(bufferedOutputStream);
             TarArchiveOutputStream tarArchiveOutputStream = new TarArchiveOutputStream(gzipOutputStream)) {

            tarArchiveOutputStream.setBigNumberMode(TarArchiveOutputStream.BIGNUMBER_POSIX);
            tarArchiveOutputStream.setLongFileMode(TarArchiveOutputStream.LONGFILE_GNU);

            List<File> files = new ArrayList<>(
                FileUtils.listFiles(
                    inputDirectoryPath.toFile(),
                    new RegexFileFilter("^(.*?)"),
                    DirectoryFileFilter.DIRECTORY
                )
            );

            for (int i = 0; i < files.size(); i++) {
                File currentFile = files.get(i);

                String relativeFilePath = new File(inputDirectoryPath.toUri()).toURI().relativize(
                    new File(currentFile.getAbsolutePath()).toURI()).getPath();

                TarArchiveEntry tarEntry = new TarArchiveEntry(currentFile, relativeFilePath);
                tarEntry.setSize(currentFile.length());

                tarArchiveOutputStream.putArchiveEntry(tarEntry);
                tarArchiveOutputStream.write(IOUtils.toByteArray(new FileInputStream(currentFile)));
                tarArchiveOutputStream.closeArchiveEntry();
            }
            tarArchiveOutputStream.close();
        }
    }

}
