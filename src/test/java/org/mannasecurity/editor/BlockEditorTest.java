package org.mannasecurity.editor;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.Test;
import org.mannasecurity.domain.BlockDiff;
import org.mannasecurity.domain.Vulnerability;

public class BlockEditorTest {

    @Test
    public void tEdit() throws Exception {
        BlockEditor blockEditor = new BlockEditor();

        Path javaFile = Paths.get("src/test/resources/HelloWorld.java");

        String content = new String(
            Files.readAllBytes(javaFile), StandardCharsets.UTF_8);

        BlockDiff blockDiff = new BlockDiff()
            .setStartLine(6)
            .setStartColumn(14)
            .setEndLine(6)
            .setEndColumn(15)
            .setOldContent("=")
            .setNewContent("==")
            .setVulnerability(new Vulnerability("Assignment instead of comparison"));

        String result = blockEditor.edit(content, blockDiff);
        System.err.println(result);
    }
}
