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
import com.telnyx.sdk.model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


import java.util.*;

import static org.junit.Assert.*;

/**
 * API tests for NumberOrderRegulatoryRequirementsApi
 */
public class NumberOrderRegulatoryRequirementsApiTest {

    private final NumberOrderRegulatoryRequirementsApi api = new NumberOrderRegulatoryRequirementsApi();
    private final NumberSearchApi numberSearchApi = new NumberSearchApi();
    private final NumberOrdersApi numberOrdersApi = new NumberOrdersApi();

    @Before
    public void setup() {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath(TestConfiguration.MOCK_SERVER_URL);

        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken(TestConfiguration.API_KEY);
    }

    /**
     * List number order regulatory requirements
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listNumberOrderRegulatoryRequirements_whenNoFilterCriteria_returnsAllRegulatoryRequirements() throws ApiException {
        ListNumberOrderRegulatoryRequirementsResponse response = api.listNumberOrderRegulatoryRequirements()
                .execute();

        assertNotNull(response);
        assertFalse(response.getData().isEmpty());
    }

    /**
     * List regulatory requirements for a Spanish number
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    @Ignore
    public void listPhoneNumberRegulatoryRequirements_whenFilteringBySpanishPhoneNumber_returnsRegulatoryRequirements() throws ApiException {
        String countryCode = "ES";
        String phoneNumber = null;

        try {
            phoneNumber = Objects.requireNonNull(numberSearchApi.listAvailablePhoneNumbers()
                    .filterCountryCode(countryCode)
                    .filterLimit(1)
                    .execute()
                    .getData())
                    .get(0)
                    .getPhoneNumber();

            numberOrdersApi.createNumberOrder(
                    new CreateNumberOrderRequest()
                            .phoneNumbers(Collections.singletonList(new PhoneNumber().phoneNumber(phoneNumber))));
        } catch (Exception e) {
            fail("Test Setup Failure - Unable to create Spanish number order: " + e.getMessage());
        }

        ListPhoneNumberRegulatoryRequirementsResponse actualResponse = api.listPhoneNumberRegulatoryRequirements()
                .filterPhoneNumber(Collections.singletonList(phoneNumber))
                .execute();

        assertNotNull(actualResponse);
        assertFalse(actualResponse.getData().isEmpty());
    }

    /**
     * Retrieve a number order regulatory requirement
     * <p>
     * Gets a single number order regulatory requirement.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void retrieveNumberOrderRegulatoryRequirementTest() throws ApiException {
        //String requirementId = null;
        //NumberOrderRegulatoryRequirementResponse response = api.retrieveNumberOrderRegulatoryRequirement(requirementId);
        // TODO: test validations
    }

}
