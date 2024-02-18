package com.example.zuul;

import org.springframework.cloud.netflix.zuul.RoutesRefreshedEvent;
import org.springframework.cloud.netflix.zuul.filters.RefreshableRouteLocator;
import org.springframework.cloud.netflix.zuul.filters.Route;
import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
import org.springframework.core.Ordered;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CustomRouteLocator implements Ordered, RefreshableRouteLocator {

    private static final ConcurrentHashMap<String, RouteInfo> routes = new ConcurrentHashMap<>();

    private static final PathMatcher pathMatcher = new AntPathMatcher();

    private static final int DEFAULT_ORDER = 1;

    static {
    }

    @Override
    public void refresh() {

    }

    @Override
    public Collection<String> getIgnoredPaths() {
        return new HashSet<>();
    }

    @Override
    public List<Route> getRoutes() {
        return new ArrayList<>(routes.values());
    }

    @Override
    public Route getMatchingRoute(String path) {
        for (Map.Entry<String, RouteInfo> entry : routes.entrySet()) {
            String urlPattern = entry.getKey();
            if (pathMatcher.match(urlPattern, path)) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public int getOrder() {
        return DEFAULT_ORDER;
    }
}
