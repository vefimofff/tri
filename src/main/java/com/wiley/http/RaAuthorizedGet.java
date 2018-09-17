package com.wiley.http;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/**
 * RestAssured Get request
 */
public final class RaAuthorizedGet {

    private final String url;
    private final String user;
    private final String password;

    public RaAuthorizedGet(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public Response send() {
        return given()
                .auth()
                .preemptive()
                .basic(this.user, this.password)
                .contentType("application/json")
                .get(this.url);
    }
}
