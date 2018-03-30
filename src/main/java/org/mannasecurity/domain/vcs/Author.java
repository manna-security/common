package org.mannasecurity.domain.vcs;

public class Author {

    public String name;
    public String email;
    public String username;

    public Author() {}

    public String getName() {
        return name;
    }

    public Author setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Author setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public Author setUsername(String username) {
        this.username = username;
        return this;
    }
}