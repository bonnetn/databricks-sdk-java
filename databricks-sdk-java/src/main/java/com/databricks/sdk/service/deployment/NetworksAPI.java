// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * These APIs manage network configurations for customer-managed VPCs
 * (optional). A network configuration encapsulates the IDs for AWS VPCs,
 * subnets, and security groups. Its ID is used when creating a new workspace if
 * you use customer-managed VPCs.
 */
@Generated("databricks-sdk-generator")
public class NetworksAPI implements NetworksService {
    private final ApiClient apiClient;

    public NetworksAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create network configuration.
     * 
     * Creates a Databricks network configuration that represents an AWS VPC and
     * its resources. The VPC will be used for new Databricks clusters. This
     * requires a pre-existing VPC and subnets. For VPC requirements, see
     * [Customer-managed VPC].
     * 
     * **Important**: You can share one customer-managed VPC with multiple
     * workspaces in a single account. Therefore, you can share one VPC across
     * multiple Account API network configurations. However, you **cannot**
     * reuse subnets or Security Groups between workspaces. Because a Databricks
     * Account API network configuration encapsulates this information, you
     * cannot reuse a Databricks Account API network configuration across
     * workspaces. If you plan to share one VPC with multiple workspaces, make
     * sure you size your VPC and subnets accordingly. For information about how
     * to create a new workspace with this API, see [Create a new workspace
     * using the Account API].
     * 
     * This operation is available only if your account is on the E2 version of
     * the platform.
     * 
     * [Create a new workspace using the Account API]: http://docs.databricks.com/administration-guide/account-api/new-workspace.html
     * [Customer-managed VPC]: http://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html
     */
    @Override
    public Network create(CreateNetworkRequest request) {
        String path = String.format("/api/2.0/accounts//networks");
        return apiClient.POST(path, request, Network.class);
    }
    
	/**
     * Delete network configuration.
     * 
     * Deletes a Databricks network configuration, which represents an AWS VPC
     * and its resources. You cannot delete a network that is associated with a
     * workspace.
     * 
     * This operation is available only if your account is on the E2 version of
     * the platform.
     */
    @Override
    public void delete(DeleteNetworkRequest request) {
        String path = String.format("/api/2.0/accounts//networks/%s", request.getNetworkId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a network configuration.
     * 
     * Gets a Databricks network configuration, which represents an AWS VPC and
     * its resources. This requires a pre-existing VPC and subnets. For VPC
     * requirements, see [Customer-managed VPC].
     * 
     * This operation is available only if your account is on the E2 version of
     * the platform.
     * 
     * [Customer-managed VPC]: http://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html
     */
    @Override
    public Network get(GetNetworkRequest request) {
        String path = String.format("/api/2.0/accounts//networks/%s", request.getNetworkId());
        return apiClient.GET(path, request, Network.class);
    }
    
	/**
     * Get all network configurations.
     * 
     * Gets a list of all Databricks network configurations for an account,
     * specified by ID.
     * 
     * This operation is available only if your account is on the E2 version of
     * the platform.
     */
    @Override
    public List<Network> list() {
        String path = String.format("/api/2.0/accounts//networks");
        return apiClient.GET(path, List.class);
    }
    
}