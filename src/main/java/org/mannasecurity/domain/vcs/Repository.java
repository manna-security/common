package org.mannasecurity.domain.vcs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Repository {

    public int id;
    public String name;
    @JsonProperty("full_name")
    public String fullName;
    public Owner owner;
    @JsonProperty("_private")
    public boolean _private;
    @JsonProperty("html_url")
    public String htmlUrl;
    public String description;
    public boolean fork;
    public String url;
    @JsonProperty("forks_url")
    public String forksUrl;
    @JsonProperty("keys_url")
    public String keysUrl;
    @JsonProperty("collaborators_url")
    public String collaboratorsUrl;
    @JsonProperty("teams_url")
    public String teamsUrl;
    @JsonProperty("hooks_url")
    public String hooksUrl;
    @JsonProperty("issueEvents_url")
    public String issueEventsUrl;
    @JsonProperty("events_url")
    public String eventsUrl;
    @JsonProperty("assignees_url")
    public String assigneesUrl;
    @JsonProperty("branches_url")
    public String branchesUrl;
    @JsonProperty("tags_url")
    public String tagsUrl;
    @JsonProperty("blobs_url")
    public String blobsUrl;
    @JsonProperty("gitTags_url")
    public String gitTagsUrl;
    @JsonProperty("gitRefs_url")
    public String gitRefsUrl;
    @JsonProperty("trees_url")
    public String treesUrl;
    @JsonProperty("statuses_url")
    public String statusesUrl;
    @JsonProperty("languages_url")
    public String languagesUrl;
    @JsonProperty("stargazers_url")
    public String stargazersUrl;
    @JsonProperty("contributors_url")
    public String contributorsUrl;
    @JsonProperty("subscribers_url")
    public String subscribersUrl;
    @JsonProperty("subscription_url")
    public String subscriptionUrl;
    @JsonProperty("commits_url")
    public String commitsUrl;
    @JsonProperty("gitCommits_url")
    public String gitCommitsUrl;
    @JsonProperty("comments_url")
    public String commentsUrl;
    @JsonProperty("issueComment_url")
    public String issueCommentUrl;
    @JsonProperty("contents_url")
    public String contentsUrl;
    @JsonProperty("compare_url")
    public String compareUrl;
    @JsonProperty("merges_url")
    public String mergesUrl;
    @JsonProperty("archive_url")
    public String archiveUrl;
    @JsonProperty("downloads_url")
    public String downloadsUrl;
    @JsonProperty("issues_url")
    public String issuesUrl;
    @JsonProperty("pulls_url")
    public String pullsUrl;
    @JsonProperty("milestones_url")
    public String milestonesUrl;
    @JsonProperty("notifications_url")
    public String notificationsUrl;
    @JsonProperty("labels_url")
    public String labelsUrl;
    @JsonProperty("releases_url")
    public String releasesUrl;
    @JsonProperty("deployments_url")
    public String deploymentsUrl;
    @JsonProperty("created_at")
    public int createdAt;
    @JsonProperty("updated_at")
    public String updatedAt;
    @JsonProperty("pushed_at")
    public int pushedAt;
    @JsonProperty("git_url")
    public String gitUrl;
    @JsonProperty("ssh_url")
    public String sshUrl;
    @JsonProperty("clone_url")
    public String cloneUrl;
    @JsonProperty("svn_url")
    public String svnUrl;
    public Object homepage;
    public int size;
    @JsonProperty("stargazers_count")
    public int stargazersCount;
    @JsonProperty("watchers_count")
    public int watchersCount;
    public String language;
    @JsonProperty("has_issues")
    public boolean hasIssues;
    @JsonProperty("has_projects")
    public boolean hasProjects;
    @JsonProperty("has_downloads")
    public boolean hasDownloads;
    @JsonProperty("has_wiki")
    public boolean hasWiki;
    @JsonProperty("has_pages")
    public boolean hasPages;
    @JsonProperty("forks_count")
    public int forksCount;
    @JsonProperty("mirror_url")
    public Object mirrorUrl;
    public boolean archived;
    @JsonProperty("open_issues_count")
    public int openIssuesCount;
    public int forks;
    @JsonProperty("open_issues")
    public int openIssues;
    public int watchers;
    @JsonProperty("default_branch")
    public String defaultBranch;
    public int stargazers;
    @JsonProperty("master_branch")
    public String masterBranch;

    public Repository() {}

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public Repository setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
        return this;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public Repository setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public Repository setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
        return this;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public Repository setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
        return this;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public Repository setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
        return this;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public Repository setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public Repository setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
        return this;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public Repository setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
        return this;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public Repository setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Repository setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public int getPushedAt() {
        return pushedAt;
    }

    public Repository setPushedAt(int pushedAt) {
        this.pushedAt = pushedAt;
        return this;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public Repository setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public Repository setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public Repository setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
        return this;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public Repository setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
        return this;
    }

    public Object getHomepage() {
        return homepage;
    }

    public Repository setHomepage(Object homepage) {
        this.homepage = homepage;
        return this;
    }

    public int getSize() {
        return size;
    }

    public Repository setSize(int size) {
        this.size = size;
        return this;
    }

    public int getStargazersCount() {
        return stargazersCount;
    }

    public Repository setStargazersCount(int stargazersCount) {
        this.stargazersCount = stargazersCount;
        return this;
    }

    public int getWatchersCount() {
        return watchersCount;
    }

    public Repository setWatchersCount(int watchersCount) {
        this.watchersCount = watchersCount;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public Repository setLanguage(String language) {
        this.language = language;
        return this;
    }

    public boolean isHasIssues() {
        return hasIssues;
    }

    public Repository setHasIssues(boolean hasIssues) {
        this.hasIssues = hasIssues;
        return this;
    }

    public boolean isHasProjects() {
        return hasProjects;
    }

    public Repository setHasProjects(boolean hasProjects) {
        this.hasProjects = hasProjects;
        return this;
    }

    public boolean isHasDownloads() {
        return hasDownloads;
    }

    public Repository setHasDownloads(boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
        return this;
    }

    public boolean isHasWiki() {
        return hasWiki;
    }

    public Repository setHasWiki(boolean hasWiki) {
        this.hasWiki = hasWiki;
        return this;
    }

    public boolean isHasPages() {
        return hasPages;
    }

    public Repository setHasPages(boolean hasPages) {
        this.hasPages = hasPages;
        return this;
    }

    public int getForksCount() {
        return forksCount;
    }

    public Repository setForksCount(int forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    public Object getMirrorUrl() {
        return mirrorUrl;
    }

    public Repository setMirrorUrl(Object mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
        return this;
    }

    public boolean isArchived() {
        return archived;
    }

    public Repository setArchived(boolean archived) {
        this.archived = archived;
        return this;
    }

    public int getOpenIssuesCount() {
        return openIssuesCount;
    }

    public Repository setOpenIssuesCount(int openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
        return this;
    }

    public int getForks() {
        return forks;
    }

    public Repository setForks(int forks) {
        this.forks = forks;
        return this;
    }

    public int getOpenIssues() {
        return openIssues;
    }

    public Repository setOpenIssues(int openIssues) {
        this.openIssues = openIssues;
        return this;
    }

    public int getWatchers() {
        return watchers;
    }

    public Repository setWatchers(int watchers) {
        this.watchers = watchers;
        return this;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public Repository setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    public int getStargazers() {
        return stargazers;
    }

    public Repository setStargazers(int stargazers) {
        this.stargazers = stargazers;
        return this;
    }

    public String getMasterBranch() {
        return masterBranch;
    }

    public Repository setMasterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
        return this;
    }

    public int getId() {
        return id;
    }

    public Repository setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Repository setName(String name) {
        this.name = name;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public Repository setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Owner getOwner() {
        return owner;
    }

    public Repository setOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    public boolean is_private() {
        return _private;
    }

    public Repository set_private(boolean _private) {
        this._private = _private;
        return this;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public Repository setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Repository setDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean isFork() {
        return fork;
    }

    public Repository setFork(boolean fork) {
        this.fork = fork;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Repository setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public Repository setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public Repository setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
        return this;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public Repository setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
        return this;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public Repository setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public Repository setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public Repository setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
        return this;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public Repository setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public Repository setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
        return this;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public Repository setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
        return this;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public Repository setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
        return this;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public Repository setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
        return this;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public Repository setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
        return this;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public Repository setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
        return this;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public Repository setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
        return this;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public Repository setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public Repository setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
        return this;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public Repository setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
        return this;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public Repository setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
        return this;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public Repository setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
        return this;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public Repository setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public Repository setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public Repository setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
        return this;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public Repository setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public Repository setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
        return this;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public Repository setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
        return this;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public Repository setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
        return this;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public Repository setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
        return this;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public Repository setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }
}