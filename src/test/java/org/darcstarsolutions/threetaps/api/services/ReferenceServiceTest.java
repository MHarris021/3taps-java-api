package org.darcstarsolutions.threetaps.api.services;

import org.darcstarsolutions.threetaps.api.configuration.ThreeTapsConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

/**
 * Created by mharris on 5/27/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ThreeTapsConfiguration.class})
public class ReferenceServiceTest {

    @Autowired
    private ReferenceService referenceService;

    @Test
    public void testReferenceServiceExistence() throws Exception {
        assertThat(referenceService, notNullValue());
    }

    @Test
    public void testDataSourcesRetrieved() throws Exception {


    }
}
