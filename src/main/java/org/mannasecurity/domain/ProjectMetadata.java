package org.mannasecurity.domain;

import java.io.Serializable;
import java.time.Instant;

/**
 * Created by jtmelton on 4/19/17.
 */
public class ProjectMetadata implements Serializable {

    private String guid;
    private String gitRepoUrl;
    private String ownerName;
    private String projectName;
    private String projectFullName;
    private Instant timestamp;

    public ProjectMetadata() {}

    public String getGuid() {
        return guid;
    }

    public ProjectMetadata setGuid(String guid) {
        this.guid = guid;
        return this;
    }

    public String getGitRepoUrl() {
        return gitRepoUrl;
    }

    public ProjectMetadata setGitRepoUrl(String gitRepoUrl) {
        this.gitRepoUrl = gitRepoUrl;
        return this;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public ProjectMetadata setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public ProjectMetadata setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public ProjectMetadata setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getProjectFullName() {
        return projectFullName;
    }

    public ProjectMetadata setProjectFullName(String projectFullName) {
        this.projectFullName = projectFullName;
        return this;
    }

    public static ProjectMetadata renew(ProjectMetadata original) {
        return new ProjectMetadata()
            .setGuid(original.getGuid())
            .setGitRepoUrl(original.getGitRepoUrl())
            .setOwnerName(original.getOwnerName())
            .setProjectName(original.getProjectName())
            .setProjectFullName(original.getProjectFullName())
            .setTimestamp(Instant.now());
    }

    public String generateName() {
        return getOwnerName() + " / " + getProjectName();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProjectMetadata{");
        sb.append("guid='").append(guid).append('\'');
        sb.append(", gitRepoUrl='").append(gitRepoUrl).append('\'');
        sb.append(", ownerName='").append(ownerName).append('\'');
        sb.append(", projectName='").append(projectName).append('\'');
        sb.append(", projectFullName='").append(projectFullName).append('\'');
        sb.append(", timestamp=").append(timestamp);
        sb.append('}');
        return sb.toString();
    }
}
