package org.darcstarsolutions.threetaps.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

/**
 * Created by mharris on 5/27/15.
 */
public class ReferenceService {

    @Autowired
    private RestTemplate restTemplate;
}
