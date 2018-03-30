package org.mannasecurity.domain;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by jtmelton on 7/2/17.
 */
public class FileDiff {

    private String absolutePath;
    private String relativePath;
    private Collection<BlockDiff> blockDiffs = new HashSet<>();

    public FileDiff() {}

    public FileDiff(String absolutePath, Collection<BlockDiff> blockDiffs) {
        setAbsolutePath(absolutePath);
        setBlockDiffs(blockDiffs);
    }

    public FileDiff(String absolutePath, String relativePath, Collection<BlockDiff> blockDiffs) {
        setAbsolutePath(absolutePath);
        setRelativePath(relativePath);
        setBlockDiffs(blockDiffs);
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public FileDiff setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
        return this;
    }

    public String getRelativePath() {
        return relativePath;
    }

    public FileDiff setRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    public Collection<BlockDiff> getBlockDiffs() {
        return blockDiffs;
    }

    public FileDiff setBlockDiffs(Collection<BlockDiff> blockDiffs) {
        this.blockDiffs = blockDiffs;
        return this;
    }

    public FileDiff addBlockDiff(BlockDiff blockDiff) {
        blockDiffs.add(blockDiff);
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FileDiff{");
        sb.append("absolutePath='").append(absolutePath).append('\'');
        sb.append("relativePath='").append(relativePath).append('\'');
        sb.append(", blockDiffs=").append(blockDiffs);
        sb.append('}');
        return sb.toString();
    }
}
