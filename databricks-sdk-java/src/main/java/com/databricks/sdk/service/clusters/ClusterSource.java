// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Determines whether the cluster was created by a user through the UI, created
 * by the Databricks Jobs Scheduler, or through an API request. This is the same
 * as cluster_creator, but read only.
 */
public enum ClusterSource{
    API,
    JOB,
    MODELS,
    PIPELINE,
    PIPELINE_MAINTENANCE,
    SQL,
    UI,
    
}