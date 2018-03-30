package org.mannasecurity.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Created by jtmelton on 7/2/17.
 */
public class BlockDiff implements Comparable<BlockDiff> {

    private final int INVALID = -1;

    private Vulnerability vulnerability;
    private int startLine = INVALID;
    private int endLine = INVALID;
    private int startColumn = INVALID;
    private int endColumn = INVALID;
    private String oldContent;
    private String newContent;

    public BlockDiff() {}

    public Vulnerability getVulnerability() {
        return vulnerability;
    }

    public BlockDiff setVulnerability(Vulnerability vulnerability) {
        this.vulnerability = vulnerability;
        return this;
    }

    public int getStartLine() {
        return startLine;
    }

    public BlockDiff setStartLine(int startLine) {
        this.startLine = startLine;
        return this;
    }

    public int getEndLine() {
        return endLine;
    }

    public BlockDiff setEndLine(int endLine) {
        this.endLine = endLine;
        return this;
    }

    public int getStartColumn() {
        return startColumn;
    }

    public BlockDiff setStartColumn(int startColumn) {
        this.startColumn = startColumn;
        return this;
    }

    public int getEndColumn() {
        return endColumn;
    }

    public BlockDiff setEndColumn(int endColumn) {
        this.endColumn = endColumn;
        return this;
    }

    public String getOldContent() {
        return oldContent;
    }

    public BlockDiff setOldContent(String oldContent) {
        this.oldContent = oldContent;
        return this;
    }

    public String getNewContent() {
        return newContent;
    }

    public BlockDiff setNewContent(String newContent) {
        this.newContent = newContent;
        return this;
    }

    public boolean hasChanges() {
        return startLine != INVALID &&
               startColumn != INVALID &&
               endLine != INVALID &&
               endColumn != INVALID;
    }

    @JsonIgnore
    public String getDescription() {
        return "Resolving vulnerability (" +
               vulnerability.getName() + ") " +
               " occurring between " +
               startLine + "/" + startColumn +
               " (line/col start) and " +
               endLine + "/" + endColumn +
               " (line/col end)";
    }

    @Override
    public int compareTo(BlockDiff other) {
        //TODO: make this more complex
        return Integer.valueOf(startLine).compareTo(Integer.valueOf(other.getStartLine()));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BlockDiff{");
        sb.append("vulnerability=").append(vulnerability);
        sb.append(", startLine=").append(startLine);
        sb.append(", endLine=").append(endLine);
        sb.append(", startColumn=").append(startColumn);
        sb.append(", endColumn=").append(endColumn);
        sb.append(", oldContent='").append(oldContent).append('\'');
        sb.append(", newContent='").append(newContent).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
