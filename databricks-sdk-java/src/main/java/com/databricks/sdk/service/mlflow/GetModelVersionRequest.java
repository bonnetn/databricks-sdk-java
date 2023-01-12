// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a model version
 */
@Generated("databricks-sdk-generator")
public class GetModelVersionRequest {
    /**
     * Name of the registered model
     */
    @QueryParam("name")
    private String name;
    
    /**
     * Model version number
     */
    @QueryParam("version")
    private String version;
    
    public GetModelVersionRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public GetModelVersionRequest setVersion(String version) {
        this.version = version;
        return this;
    }

    public String getVersion() {
        return version;
    }
    
}
