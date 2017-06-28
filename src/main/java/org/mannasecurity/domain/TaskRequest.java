package org.mannasecurity.domain;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by jtmelton on 6/21/17.
 */
public class TaskRequest implements Serializable {

    private ProjectMetadata projectMetadata;
    private byte[] content;

    public ProjectMetadata getProjectMetadata() {
        return projectMetadata;
    }

    public void setProjectMetadata(ProjectMetadata projectMetadata) {
        this.projectMetadata = projectMetadata;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TaskRequest{");
        sb.append("projectMetadata=").append(projectMetadata);
        sb.append(", content=").append(Arrays.toString(content));
        sb.append('}');
        return sb.toString();
    }

}
