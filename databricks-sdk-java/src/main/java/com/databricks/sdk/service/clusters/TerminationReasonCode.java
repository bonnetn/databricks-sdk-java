// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.clusters;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * status code indicating why the cluster was terminated
 */
public enum TerminationReasonCode{
    ABUSE_DETECTED,
    ATTACH_PROJECT_FAILURE,
    AWS_AUTHORIZATION_FAILURE,
    AWS_INSUFFICIENT_FREE_ADDRESSES_IN_SUBNET_FAILURE,
    AWS_INSUFFICIENT_INSTANCE_CAPACITY_FAILURE,
    AWS_MAX_SPOT_INSTANCE_COUNT_EXCEEDED_FAILURE,
    AWS_REQUEST_LIMIT_EXCEEDED,
    AWS_UNSUPPORTED_FAILURE,
    AZURE_BYOK_KEY_PERMISSION_FAILURE,
    AZURE_EPHEMERAL_DISK_FAILURE,
    AZURE_INVALID_DEPLOYMENT_TEMPLATE,
    AZURE_OPERATION_NOT_ALLOWED_EXCEPTION,
    AZURE_QUOTA_EXCEEDED_EXCEPTION,
    AZURE_RESOURCE_MANAGER_THROTTLING,
    AZURE_RESOURCE_PROVIDER_THROTTLING,
    AZURE_UNEXPECTED_DEPLOYMENT_TEMPLATE_FAILURE,
    AZURE_VM_EXTENSION_FAILURE,
    AZURE_VNET_CONFIGURATION_FAILURE,
    BOOTSTRAP_TIMEOUT,
    BOOTSTRAP_TIMEOUT_CLOUD_PROVIDER_EXCEPTION,
    CLOUD_PROVIDER_DISK_SETUP_FAILURE,
    CLOUD_PROVIDER_LAUNCH_FAILURE,
    CLOUD_PROVIDER_RESOURCE_STOCKOUT,
    CLOUD_PROVIDER_SHUTDOWN,
    COMMUNICATION_LOST,
    CONTAINER_LAUNCH_FAILURE,
    CONTROL_PLANE_REQUEST_FAILURE,
    DATABASE_CONNECTION_FAILURE,
    DBFS_COMPONENT_UNHEALTHY,
    DOCKER_IMAGE_PULL_FAILURE,
    DRIVER_UNREACHABLE,
    DRIVER_UNRESPONSIVE,
    EXECUTION_COMPONENT_UNHEALTHY,
    GCP_QUOTA_EXCEEDED,
    GCP_SERVICE_ACCOUNT_DELETED,
    GLOBAL_INIT_SCRIPT_FAILURE,
    HIVE_METASTORE_PROVISIONING_FAILURE,
    IMAGE_PULL_PERMISSION_DENIED,
    INACTIVITY,
    INIT_SCRIPT_FAILURE,
    INSTANCE_POOL_CLUSTER_FAILURE,
    INSTANCE_UNREACHABLE,
    INTERNAL_ERROR,
    INVALID_ARGUMENT,
    INVALID_SPARK_IMAGE,
    IP_EXHAUSTION_FAILURE,
    JOB_FINISHED,
    K8S_AUTOSCALING_FAILURE,
    K8S_DBR_CLUSTER_LAUNCH_TIMEOUT,
    METASTORE_COMPONENT_UNHEALTHY,
    NEPHOS_RESOURCE_MANAGEMENT,
    NETWORK_CONFIGURATION_FAILURE,
    NFS_MOUNT_FAILURE,
    NPIP_TUNNEL_SETUP_FAILURE,
    NPIP_TUNNEL_TOKEN_FAILURE,
    REQUEST_REJECTED,
    REQUEST_THROTTLED,
    SECRET_RESOLUTION_ERROR,
    SECURITY_DAEMON_REGISTRATION_EXCEPTION,
    SELF_BOOTSTRAP_FAILURE,
    SKIPPED_SLOW_NODES,
    SLOW_IMAGE_DOWNLOAD,
    SPARK_ERROR,
    SPARK_IMAGE_DOWNLOAD_FAILURE,
    SPARK_STARTUP_FAILURE,
    SPOT_INSTANCE_TERMINATION,
    STORAGE_DOWNLOAD_FAILURE,
    STS_CLIENT_SETUP_FAILURE,
    SUBNET_EXHAUSTED_FAILURE,
    TEMPORARILY_UNAVAILABLE,
    TRIAL_EXPIRED,
    UNEXPECTED_LAUNCH_FAILURE,
    UNKNOWN,
    UNSUPPORTED_INSTANCE_TYPE,
    UPDATE_INSTANCE_PROFILE_FAILURE,
    USER_REQUEST,
    WORKER_SETUP_FAILURE,
    WORKSPACE_CANCELLED_ERROR,
    WORKSPACE_CONFIGURATION_ERROR,
    
}