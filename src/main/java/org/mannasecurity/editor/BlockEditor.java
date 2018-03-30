package org.mannasecurity.editor;

import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.mannasecurity.domain.BlockDiff;

public class BlockEditor {

    public static final String NEWLINE = System.getProperty("line.separator");

    public String edit(String content, BlockDiff blockDiff) {

        if(Strings.isNullOrEmpty(content)) {
            return content;
        }

        if(blockDiff == null || !blockDiff.hasChanges()) {
            return content;
        }

        Iterable<String> lines = Splitter.on(NEWLINE).split(content);

        StringBuffer before = new StringBuffer();
        StringBuffer after = new StringBuffer();

        int startLine = blockDiff.getStartLine();
        int startColumn = blockDiff.getStartColumn();
        int endLine = blockDiff.getEndLine();
        int endColumn = blockDiff.getEndColumn();

        int lineNum = 0;

        for(String line : lines) {
            lineNum++;

            /*
            cases:
            - process line before section
            - process line after section
            - process line in section full
            - process line in section partial start && end
            - process line in section partial start only
            - process line in section partial end only
             */

            if(startLine > lineNum) {
                // - process line before section
                before.append(line).append(NEWLINE);
            } else if(endLine < lineNum) {
                // - process line after section
                after.append(line).append(NEWLINE);
            } else if(lineNum > startLine && lineNum < endLine) {
                // - process line in section full
                // do nothing here
            } else {
                // - process line in section partial start && end
                // - process line in section partial start only
                // - process line in section partial end only

                if(lineNum == startLine) {
                    before.append(line.substring(0, startColumn));
                }

                if(lineNum == endLine) {
                    after.append(line.substring(endColumn, line.length()));
                    after.append(NEWLINE);
                }
            }

        }

        String result = before.toString() + blockDiff.getNewContent() + after.toString();

        return result;
    }

    public String edit(String content, Collection<BlockDiff> blockDiffCollection) {

        if(Strings.isNullOrEmpty(content)) {
            return content;
        }

        if(blockDiffCollection == null || blockDiffCollection.size() == 0) {
            return content;
        }

        List<BlockDiff> blockDiffs = new ArrayList<>(blockDiffCollection);
        Collections.sort(blockDiffs);

        int numDiffs = blockDiffs.size();
        int idx = 0;
        StringBuffer sb = new StringBuffer();

        int startLine = 0;
        int startColumn = 0;
        int endLine = 0;
        int endColumn = 0;

        for(BlockDiff blockDiff : blockDiffs) {
            idx++;

            if(blockDiff == null || !blockDiff.hasChanges()) {
                continue;
            }

            endLine = blockDiff.getStartLine();
            endColumn = blockDiff.getStartColumn();

            // normal add - should run from previous block end to current block start
            sb.append(extract(content, startLine, startColumn, endLine, endColumn));

            // follow that up with the actual content
            sb.append(blockDiff.getNewContent());

            startLine = blockDiff.getEndLine();
            startColumn = blockDiff.getEndColumn();

            // cheat on last one - add the remainder of the file
            if(idx == numDiffs) {
                sb.append(
                    extract(content, startLine, startColumn, Integer.MAX_VALUE, Integer.MAX_VALUE));
            }
        }

        return sb.toString();
    }

    private String extract(String originalContent,
                           int startLine, int startColumn, int endLine, int endColumn) {
        Iterable<String> lines = Splitter.on(NEWLINE).split(originalContent);

        StringBuffer content = new StringBuffer();

        int lineNum = 0;

        for(String line : lines) {
            lineNum++;

            /*
            cases:
            - both start and end are same line (current)
            - start is current line
            - end is current line
            - between start and end lines
            - other
             */

            if(lineNum == startLine && lineNum == endLine) {
                // both start and end are same line (current)
                content.append(line.substring(startColumn, endColumn));
            } else if(lineNum == startLine) {
                // start is current line
                content.append(line.substring(startColumn, line.length())).append(NEWLINE);
            } else if(lineNum == endLine) {
                // end is current line
                content.append(line.substring(0, endColumn));
            } else if(lineNum > startLine && lineNum < endLine) {
                // between start and end lines
                content.append(line).append(NEWLINE);
            } else if(lineNum > startLine && lineNum < endLine) {
                // - process line in section full
                // do nothing here
            } else {
                // other
                // ignore
            }
        }

        return content.toString();
    }

}
