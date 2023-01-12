// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ExperimentTag {
    /**
     * The tag key.
     */
    @JsonProperty("key")
    private String key;
    
    /**
     * The tag value.
     */
    @JsonProperty("value")
    private String value;
    
    public ExperimentTag setKey(String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return key;
    }
    
    public ExperimentTag setValue(String value) {
        this.value = value;
        return this;
    }

    public String getValue() {
        return value;
    }
    
}
