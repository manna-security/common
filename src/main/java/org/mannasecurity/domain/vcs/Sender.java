package org.mannasecurity.domain.vcs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sender {

    public String login;
    public int id;
    @JsonProperty("avatar_url")
    public String avatarUrl;
    @JsonProperty("gravatarId")
    public String gravatarId;
    public String url;
    @JsonProperty("html_url")
    public String htmlUrl;
    @JsonProperty("followers_url")
    public String followersUrl;
    @JsonProperty("following_url")
    public String followingUrl;
    @JsonProperty("gists_url")
    public String gistsUrl;
    @JsonProperty("starred_url")
    public String starredUrl;
    @JsonProperty("subscriptions_url")
    public String subscriptionsUrl;
    @JsonProperty("organizations_url")
    public String organizationsUrl;
    @JsonProperty("repos_url")
    public String reposUrl;
    @JsonProperty("events_url")
    public String eventsUrl;
    @JsonProperty("receivedEvents_url")
    public String receivedEventsUrl;
    public String type;
    @JsonProperty("siteAdmin")
    public boolean siteAdmin;

    public Sender() {}

    public String getLogin() {
        return login;
    }

    public Sender setLogin(String login) {
        this.login = login;
        return this;
    }

    public int getId() {
        return id;
    }

    public Sender setId(int id) {
        this.id = id;
        return this;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public Sender setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public Sender setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Sender setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public Sender setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public Sender setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
        return this;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public Sender setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
        return this;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public Sender setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
        return this;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public Sender setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
        return this;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public Sender setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
        return this;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public Sender setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
        return this;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public Sender setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
        return this;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public Sender setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public Sender setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
        return this;
    }

    public String getType() {
        return type;
    }

    public Sender setType(String type) {
        this.type = type;
        return this;
    }

    public boolean isSiteAdmin() {
        return siteAdmin;
    }

    public Sender setSiteAdmin(boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
        return this;
    }
}