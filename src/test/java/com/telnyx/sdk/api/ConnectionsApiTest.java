/*
 * Telnyx API
 * SIP trunking, SMS, MMS, Call Control and Telephony Data Services.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: support@telnyx.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telnyx.sdk.api;

import com.telnyx.sdk.*;
import com.telnyx.sdk.auth.*;
import com.telnyx.sdk.model.ConnectionResponse;
import com.telnyx.sdk.model.ListConnectionsResponse;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConnectionsApi
 */
public class ConnectionsApiTest {

    private final ConnectionsApi api = new ConnectionsApi();

    /**
     * List connections
     *
     * Returns a list of your connections irrespective of type.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listConnectionsTest() throws ApiException {
        //Integer pageNumber = null;
        //Integer pageSize = null;
        //String filterConnectionNameContains = null;
        //String filterOutboundVoiceProfileId = null;
        //String sort = null;
        //ListConnectionsResponse response = api.listConnections()
        //        .pageNumber(pageNumber)
        //        .pageSize(pageSize)
        //        .filterConnectionNameContains(filterConnectionNameContains)
        //        .filterOutboundVoiceProfileId(filterOutboundVoiceProfileId)
        //        .sort(sort)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a connection
     *
     * Retrieves the high-level details of an existing connection. To retrieve specific authentication information, use the endpoint for the specific connection type.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveConnectionTest() throws ApiException {
        //String id = null;
        //ConnectionResponse response = api.retrieveConnection(id);
        // TODO: test validations
    }

}
