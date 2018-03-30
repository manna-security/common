package org.mannasecurity.editor;

import java.io.IOException;
import java.nio.file.Path;
import org.mannasecurity.domain.FileDiff;
import org.mannasecurity.domain.ProjectDiff;

public class ProjectEditor {

    FileEditor editor = new FileEditor();

    public void edit(ProjectDiff projectDiff, Path rootPath) throws IOException {
        for(FileDiff diff : projectDiff.getFileDiffs()) {
            editor.edit(diff, rootPath);
        }
    }

}
