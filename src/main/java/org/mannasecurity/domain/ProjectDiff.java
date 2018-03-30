package org.mannasecurity.domain;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by jtmelton on 7/2/17.
 */
public class ProjectDiff {

    private Collection<FileDiff> fileDiffs = new HashSet<>();

    public ProjectDiff() {}

    public ProjectDiff(Collection<FileDiff> fileDiffs) {
        setFileDiffs(fileDiffs);
    }

    public Collection<FileDiff> getFileDiffs() {
        return fileDiffs;
    }

    public void setFileDiffs(Collection<FileDiff> fileDiffs) {
        this.fileDiffs = fileDiffs;
    }

    public ProjectDiff addFileDiff(FileDiff fileDiff) {
        fileDiffs.add(fileDiff);
        return this;
    }

    public ProjectDiff merge(ProjectDiff other) {
        return other;
//        TODO: actually do this merge .. needed when several scanners run
//        throw new IllegalStateException("method incomplete");
    }

    // only true if we have existing block diffs in the project
    public boolean requiresChanges() {
        for(FileDiff fileDiff : fileDiffs) {
            if(fileDiff.getBlockDiffs().size() > 0) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProjectDiff{");
        sb.append("fileDiffs=").append(fileDiffs);
        sb.append('}');
        return sb.toString();
    }
}
