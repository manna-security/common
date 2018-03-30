package org.mannasecurity.domain;

import java.io.Serializable;

/**
 * Created by jtmelton on 6/21/17.
 */
public class TaskRequest implements Serializable {

    private ProjectMetadata projectMetadata;
    private byte[] content;

    public TaskRequest() {}

    public ProjectMetadata getProjectMetadata() {
        return projectMetadata;
    }

    public TaskRequest setProjectMetadata(ProjectMetadata projectMetadata) {
        this.projectMetadata = projectMetadata;
        return this;
    }

    public byte[] getContent() {
        return content;
    }

    public TaskRequest setContent(byte[] content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TaskRequest{");
        sb.append("projectMetadata=").append(projectMetadata);
        sb.append(", content(length)=").append(content.length);
        sb.append('}');
        return sb.toString();
    }

}
