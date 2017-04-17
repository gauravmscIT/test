package com.automation.tests.helpers;


import org.apache.http.client.utils.URIBuilder;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.URISyntaxException;


@Component
public class UrlHelper {

    private static final String BASE_URL = "sports.williamhill.com/sr-admin-set-white-list-cookie.html";


    public String getUrl() throws URISyntaxException, NullPointerException {

        String host = BASE_URL;

        URIBuilder builder = new URIBuilder()
                .setScheme("http")
                .setHost(host)
                .setPath("");

        URI uri = builder.build();

        return (uri.toString());

    }


}
