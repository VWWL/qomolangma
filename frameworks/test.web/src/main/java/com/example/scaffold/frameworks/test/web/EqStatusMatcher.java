package com.example.scaffold.frameworks.test.web;

import org.springframework.http.HttpStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqStatusMatcher implements ResponseStatusMatcher {
    private final HttpStatus status;

    public EqStatusMatcher(HttpStatus status) {
        this.status = status;
    }

    public static ResponseStatusMatcher eq(HttpStatus status) {
        return new EqStatusMatcher(status);
    }

    public void match(TestResponse response) {
        assertEquals(response.statusCode(), status);
    }
}