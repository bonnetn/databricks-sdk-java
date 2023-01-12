// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Availability type used for all subsequent nodes past the `first_on_demand`
 * ones.
 * 
 * Note: If `first_on_demand` is zero, this availability type will be used for
 * the entire cluster.
 */
public enum AwsAvailability{
    ON_DEMAND,
    SPOT,
    SPOT_WITH_FALLBACK,
    
}