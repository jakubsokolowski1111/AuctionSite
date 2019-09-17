package com.js.AuctionSite.model;

import javax.persistence.*;

@Entity
@Table(name = "authority")
public class Authority {
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_login")
    private User user;
    @Id
    private String login;
    private String authority;

    public Authority() {
    }

    public Authority(User user, String login, String authority) {
        this.user = user;
        this.login = login;
        this.authority = authority;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
