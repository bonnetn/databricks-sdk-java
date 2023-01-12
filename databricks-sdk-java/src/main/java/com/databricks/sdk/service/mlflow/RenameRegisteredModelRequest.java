// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class RenameRegisteredModelRequest {
    /**
     * Registered model unique name identifier.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * If provided, updates the name for this `registered_model`.
     */
    @JsonProperty("new_name")
    private String newName;
    
    public RenameRegisteredModelRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public RenameRegisteredModelRequest setNewName(String newName) {
        this.newName = newName;
        return this;
    }

    public String getNewName() {
        return newName;
    }
    
}
