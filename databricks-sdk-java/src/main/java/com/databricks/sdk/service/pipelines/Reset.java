// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Reset a pipeline
 */
@Generated("databricks-sdk-generator")
public class Reset {
    /**
     
     */
    
    private String pipelineId;
    
    public Reset setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    public String getPipelineId() {
        return pipelineId;
    }
    
}
