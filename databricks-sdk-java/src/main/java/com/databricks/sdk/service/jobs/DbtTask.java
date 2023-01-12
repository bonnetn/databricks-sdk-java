// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class DbtTask {
    /**
     * A list of dbt commands to execute. All commands must start with `dbt`.
     * This parameter must not be empty. A maximum of up to 10 commands can be
     * provided.
     */
    @JsonProperty("commands")
    private java.util.List<String> commands;
    
    /**
     * Optional (relative) path to the profiles directory. Can only be specified
     * if no warehouse_id is specified. If no warehouse_id is specified and this
     * folder is unset, the root directory is used.
     */
    @JsonProperty("profiles_directory")
    private String profilesDirectory;
    
    /**
     * Optional (relative) path to the project directory, if no value is
     * provided, the root of the git repository is used.
     */
    @JsonProperty("project_directory")
    private String projectDirectory;
    
    /**
     * Optional schema to write to. This parameter is only used when a
     * warehouse_id is also provided. If not provided, the `default` schema is
     * used.
     */
    @JsonProperty("schema")
    private String schema;
    
    /**
     * ID of the SQL warehouse to connect to. If provided, we automatically
     * generate and provide the profile and connection details to dbt. It can be
     * overridden on a per-command basis by using the `--profiles-dir` command
     * line argument.
     */
    @JsonProperty("warehouse_id")
    private String warehouseId;
    
    public DbtTask setCommands(java.util.List<String> commands) {
        this.commands = commands;
        return this;
    }

    public java.util.List<String> getCommands() {
        return commands;
    }
    
    public DbtTask setProfilesDirectory(String profilesDirectory) {
        this.profilesDirectory = profilesDirectory;
        return this;
    }

    public String getProfilesDirectory() {
        return profilesDirectory;
    }
    
    public DbtTask setProjectDirectory(String projectDirectory) {
        this.projectDirectory = projectDirectory;
        return this;
    }

    public String getProjectDirectory() {
        return projectDirectory;
    }
    
    public DbtTask setSchema(String schema) {
        this.schema = schema;
        return this;
    }

    public String getSchema() {
        return schema;
    }
    
    public DbtTask setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }

    public String getWarehouseId() {
        return warehouseId;
    }
    
}
