package org.mannasecurity.domain.vcs;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ProjectChange {

    public String ref;
    public String before;
    public String after;
    public boolean created;
    public boolean deleted;
    public boolean forced;
    @JsonProperty("base_ref")
    public Object baseRef;
    public String compare;
    public List<Commit> commits = new ArrayList<>();
    @JsonProperty("head_commit")
    public Commit headCommit;
    public Repository repository;
    public Pusher pusher;
    public Sender sender;
    public Installation installation;

    public ProjectChange() {}

    public String getRef() {
        return ref;
    }

    public ProjectChange setRef(String ref) {
        this.ref = ref;
        return this;
    }

    public String getBefore() {
        return before;
    }

    public ProjectChange setBefore(String before) {
        this.before = before;
        return this;
    }

    public String getAfter() {
        return after;
    }

    public ProjectChange setAfter(String after) {
        this.after = after;
        return this;
    }

    public boolean isCreated() {
        return created;
    }

    public ProjectChange setCreated(boolean created) {
        this.created = created;
        return this;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public ProjectChange setDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public boolean isForced() {
        return forced;
    }

    public ProjectChange setForced(boolean forced) {
        this.forced = forced;
        return this;
    }

    public Object getBaseRef() {
        return baseRef;
    }

    public ProjectChange setBaseRef(Object baseRef) {
        this.baseRef = baseRef;
        return this;
    }

    public String getCompare() {
        return compare;
    }

    public ProjectChange setCompare(String compare) {
        this.compare = compare;
        return this;
    }

    public List<Commit> getCommits() {
        return commits;
    }

    public ProjectChange setCommits(List<Commit> commits) {
        this.commits = commits;
        return this;
    }

    public Commit getHeadCommit() {
        return headCommit;
    }

    public ProjectChange setHeadCommit(Commit headCommit) {
        this.headCommit = headCommit;
        return this;
    }

    public Repository getRepository() {
        return repository;
    }

    public ProjectChange setRepository(Repository repository) {
        this.repository = repository;
        return this;
    }

    public Pusher getPusher() {
        return pusher;
    }

    public ProjectChange setPusher(Pusher pusher) {
        this.pusher = pusher;
        return this;
    }

    public Sender getSender() {
        return sender;
    }

    public ProjectChange setSender(Sender sender) {
        this.sender = sender;
        return this;
    }

    public Installation getInstallation() {
        return installation;
    }

    public ProjectChange setInstallation(Installation installation) {
        this.installation = installation;
        return this;
    }
}