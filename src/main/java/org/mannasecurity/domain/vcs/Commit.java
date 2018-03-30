package org.mannasecurity.domain.vcs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class Commit {

    public String id;
    @JsonProperty("tree_id")
    public String treeId;
    public boolean distinct;
    public String message;
    public String timestamp;
    public String url;
    public Author author;
    public Author committer;
    public List<Object> added = new ArrayList<>();
    public List<Object> removed = new ArrayList<>();
    public List<Object> modified = new ArrayList<>();

    public Commit() {}

    public String getId() {
        return id;
    }

    public Commit setId(String id) {
        this.id = id;
        return this;
    }

    public String getTreeId() {
        return treeId;
    }

    public Commit setTreeId(String treeId) {
        this.treeId = treeId;
        return this;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public Commit setDistinct(boolean distinct) {
        this.distinct = distinct;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Commit setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Commit setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Commit setUrl(String url) {
        this.url = url;
        return this;
    }

    public Author getAuthor() {
        return author;
    }

    public Commit setAuthor(Author author) {
        this.author = author;
        return this;
    }

    public Author getCommitter() {
        return committer;
    }

    public Commit setCommitter(Author committer) {
        this.committer = committer;
        return this;
    }

    public List<Object> getAdded() {
        return added;
    }

    public Commit setAdded(List<Object> added) {
        this.added = added;
        return this;
    }

    public List<Object> getRemoved() {
        return removed;
    }

    public Commit setRemoved(List<Object> removed) {
        this.removed = removed;
        return this;
    }

    public List<Object> getModified() {
        return modified;
    }

    public Commit setModified(List<Object> modified) {
        this.modified = modified;
        return this;
    }
}