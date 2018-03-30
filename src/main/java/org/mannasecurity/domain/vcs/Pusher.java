package org.mannasecurity.domain.vcs;

public class Pusher {

    public String name;
    public String email;

    public Pusher() {}

    public String getName() {
        return name;
    }

    public Pusher setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Pusher setEmail(String email) {
        this.email = email;
        return this;
    }
}