package org.darcstarsolutions.threetaps.api.utils;

import org.junit.Test;

import java.net.URI;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by mharris on 5/27/15.
 */
public class URIBuilderTest {

    public static final String HTTPS_WWW_GOOGLE_COM_ROBOTS = "https://www.google.com/robots";

    @Test
    public void testURIBuilderHTTPSTrue() throws Exception {
        URIBuilder uriBuilder = new URIBuilder(true, "www.google.com", "robots");
        URI uri = uriBuilder.build();
        assertThat(uri.toString(), is(equalTo(HTTPS_WWW_GOOGLE_COM_ROBOTS)));
    }

    @Test
    public void testURIBuilderHTTPSFalse() throws Exception {
        URIBuilder uriBuilder = new URIBuilder(false, "www.google.com", "robots");
        URI uri = uriBuilder.build();
        assertThat(uri.toString(), is(not(equalTo(HTTPS_WWW_GOOGLE_COM_ROBOTS))));
    }

    @Test
    public void testURIBuilderStringHTTPSTrue() throws Exception {
        URIBuilder uriBuilder = new URIBuilder(true, "www.google.com", "robots");
        String uri = uriBuilder.getURI();
        assertThat(uri, is(equalTo(HTTPS_WWW_GOOGLE_COM_ROBOTS)));
    }

    @Test
    public void testURIBuilderStringHTTPSFalse() throws Exception {
        URIBuilder uriBuilder = new URIBuilder(false, "www.google.com", "robots");
        String uri = uriBuilder.getURI();
        assertThat(uri, is(not(equalTo(HTTPS_WWW_GOOGLE_COM_ROBOTS))));
    }
}

