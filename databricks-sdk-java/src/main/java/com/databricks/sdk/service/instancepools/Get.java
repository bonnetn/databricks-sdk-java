// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.instancepools;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get instance pool information
 */
@Generated("databricks-sdk-generator")
public class Get {
    /**
     * The canonical unique identifier for the instance pool.
     */
    @QueryParam("instance_pool_id")
    private String instancePoolId;
    
    public Get setInstancePoolId(String instancePoolId) {
        this.instancePoolId = instancePoolId;
        return this;
    }

    public String getInstancePoolId() {
        return instancePoolId;
    }
    
}
