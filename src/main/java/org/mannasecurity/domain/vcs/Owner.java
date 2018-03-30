package org.mannasecurity.domain.vcs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Owner {

    public String name;
    public String email;
    public String login;
    public int id;
    @JsonProperty("avatar_url")
    public String avatarUrl;
    @JsonProperty("gravatar_id")
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
    @JsonProperty("received_events_url")
    public String receivedEventsUrl;
    public String type;
    @JsonProperty("site_admin")
    public boolean siteAdmin;

    public Owner() {}

    public String getName() {
        return name;
    }

    public Owner setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Owner setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public Owner setLogin(String login) {
        this.login = login;
        return this;
    }

    public int getId() {
        return id;
    }

    public Owner setId(int id) {
        this.id = id;
        return this;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public Owner setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public String getGravatarId() {
        return gravatarId;
    }

    public Owner setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Owner setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public Owner setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    public String getFollowersUrl() {
        return followersUrl;
    }

    public Owner setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
        return this;
    }

    public String getFollowingUrl() {
        return followingUrl;
    }

    public Owner setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
        return this;
    }

    public String getGistsUrl() {
        return gistsUrl;
    }

    public Owner setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
        return this;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public Owner setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
        return this;
    }

    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public Owner setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
        return this;
    }

    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public Owner setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
        return this;
    }

    public String getReposUrl() {
        return reposUrl;
    }

    public Owner setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
        return this;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public Owner setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public Owner setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
        return this;
    }

    public String getType() {
        return type;
    }

    public Owner setType(String type) {
        this.type = type;
        return this;
    }

    public boolean isSiteAdmin() {
        return siteAdmin;
    }

    public Owner setSiteAdmin(boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
        return this;
    }
}