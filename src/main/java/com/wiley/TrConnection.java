package com.wiley;

import com.codepine.api.testrail.TestRail;

/**
 * Entry point to TR api
 */
public final class TrConnection implements ConnectableTr {

    private final String url;
    private final String login;
    private final String password;
    private final String appName;

    public TrConnection(String url, String login, String password, String appName) {
        this.url = url;
        this.login = login;
        this.password = password;
        this.appName = appName;
    }

    public TestRail connect() {
        return TestRail.builder(this.url, this.login, this.password)
                .applicationName(this.appName)
                .build();
    }

    public String getUrl() {
        return this.url;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }
}
