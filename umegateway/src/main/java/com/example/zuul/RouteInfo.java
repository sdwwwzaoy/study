package com.example.zuul;

import org.springframework.cloud.netflix.zuul.filters.Route;

import java.util.Set;

public class RouteInfo extends Route {

    public RouteInfo(String id, String path, String location, String prefix, Boolean retryable, Set<String> ignoredHeaders) {
        super(id, path, location, prefix, retryable, ignoredHeaders);
    }

}
