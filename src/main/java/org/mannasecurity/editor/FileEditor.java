package org.mannasecurity.editor;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import org.mannasecurity.domain.FileDiff;

public class FileEditor {

    BlockEditor editor = new BlockEditor();

    /* char based file editor */
    public Path edit(FileDiff fileDiff, Path rootPath) throws IOException {
        Path absolutePath = rootPath.resolve("code").resolve(fileDiff.getRelativePath());

        System.out.println("Writing to path: " + absolutePath);

        // read in original content from file
        String content = new String(
            Files.readAllBytes(absolutePath),StandardCharsets.UTF_8);

        content = editor.edit(content, fileDiff.getBlockDiffs());

        // have final version of what content should be, now update content
        Files.write(absolutePath, content.getBytes(StandardCharsets.UTF_8));

        return absolutePath;
    }

}
