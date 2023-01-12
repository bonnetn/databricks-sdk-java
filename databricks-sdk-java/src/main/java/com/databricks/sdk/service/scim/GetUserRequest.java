// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get user details
 */
@Generated("databricks-sdk-generator")
public class GetUserRequest {
    /**
     * Unique ID for a user in the Databricks Account.
     */
    
    private String id;
    
    public GetUserRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
}
