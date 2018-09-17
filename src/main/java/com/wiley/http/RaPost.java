package com.wiley.http;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/**
 * RestAssured Post request
 */
public final class RaPost {

    private final String url;
    private final Object body;

    public RaPost(String url, Object body) {
        this.url = url;
        this.body = body;
    }

    public RaPost(String url) {
        this.url = url;
        this.body = new Object();
    }

    public Response send() {
        return given()
                .body(body)
                .when()
                .post(this.url);
    }
}
