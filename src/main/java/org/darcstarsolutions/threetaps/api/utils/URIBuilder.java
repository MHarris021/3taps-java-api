package org.darcstarsolutions.threetaps.api.utils;

import javax.annotation.Nonnull;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by mharris on 5/27/15.
 */
public class URIBuilder {

    public static final String HTTPS = "https://";
    public static final String HTTP = "http://";

    private boolean useHttps;
    private String baseURL;
    private String endPoint;

    public URIBuilder(boolean useHttps, @Nonnull String baseURL, @Nonnull String endPoint) {
        this.useHttps = useHttps;
        this.baseURL = baseURL;
        this.endPoint = endPoint;
    }

    public URI build() throws URISyntaxException {
        StringBuilder stringBuilder = new StringBuilder();
        if (useHttps) {
            stringBuilder.append(HTTPS);
        } else {
            stringBuilder.append(HTTP);
        }
        stringBuilder.append(baseURL);
        stringBuilder.append("/");
        stringBuilder.append(endPoint);
        URI uri = new URI(stringBuilder.toString());
        return uri;
    }

    public String getURI() throws URISyntaxException {
        return build().toString();
    }
}
