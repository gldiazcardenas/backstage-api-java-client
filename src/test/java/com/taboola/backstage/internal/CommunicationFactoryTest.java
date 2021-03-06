package com.taboola.backstage.internal;

import java.util.Collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.taboola.backstage.BackstageTestBase;
import com.taboola.backstage.internal.config.CommunicationConfig;
import com.taboola.backstage.internal.config.SerializationConfig;
import com.taboola.backstage.internal.config.UserAgentHeader;

/**
 * Created by vladi
 * Date: 1/16/2018
 * Time: 10:24 PM
 * By Taboola
 */
public class CommunicationFactoryTest extends BackstageTestBase {

    private CommunicationFactory testInstance;

    @Before
    public void beforeTest() {
        CommunicationConfig communicationConfig = new CommunicationConfig("http://localhost", "http://localhost",
                1L, 1L, 1L, 1, 60L,
                Collections.singleton(new UserAgentHeader("Dummy-Agent")),true);
        SerializationConfig serializationConfig = new SerializationConfig();
        testInstance = new CommunicationFactory(communicationConfig, serializationConfig);
    }

    @Test
    public void testHappyFlowServices() {
        Assert.assertNotNull("Missing service instance", testInstance.createRetrofitEndpoint(BackstageAccountEndpoint.class));
        Assert.assertNotNull("Missing service instance", testInstance.createRetrofitAuthEndpoint(BackstageAuthenticationEndpoint.class));
    }
}
