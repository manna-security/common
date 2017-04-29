package org.mannasecurity.domain;

import java.io.Serializable;
import java.time.Instant;

/**
 * Created by jtmelton on 4/19/17.
 */
public class ProjectMetadata implements Serializable {

    private String guid;
    private String gitRepoUrl;
    private Instant timestamp;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getGitRepoUrl() {
        return gitRepoUrl;
    }

    public void setGitRepoUrl(String gitRepoUrl) {
        this.gitRepoUrl = gitRepoUrl;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "guid: " + guid + ", gitRepoUrl: " + gitRepoUrl + ", timestamp: " + timestamp;
    }

}
