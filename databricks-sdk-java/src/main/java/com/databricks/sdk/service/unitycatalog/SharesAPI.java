// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * Databricks Delta Sharing: Shares REST API
 */
@Generated("databricks-sdk-generator")
public class SharesAPI implements SharesService {
    private final ApiClient apiClient;

    public SharesAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a share.
     * 
     * Creates a new share for data objects. Data objects can be added at this
     * time or after creation with **update**. The caller must be a Metastore
     * admin or have the CREATE_SHARE privilege on the Metastore.
     */
    @Override
    public ShareInfo create(CreateShare request) {
        String path = "/api/2.1/unity-catalog/shares";
        return apiClient.POST(path, request, ShareInfo.class);
    }
    
	/**
     * Delete a share.
     * 
     * Deletes a data object share from the Metastore. The caller must be an
     * owner of the share.
     */
    @Override
    public void delete(DeleteShareRequest request) {
        String path = String.format("/api/2.1/unity-catalog/shares/%s", request.getName());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a share.
     * 
     * Gets a data object share from the Metastore. The caller must be a
     * Metastore admin or the owner of the share.
     */
    @Override
    public ShareInfo get(GetShareRequest request) {
        String path = String.format("/api/2.1/unity-catalog/shares/%s", request.getName());
        return apiClient.GET(path, request, ShareInfo.class);
    }
    
	/**
     * List shares.
     * 
     * Gets an array of data object shares from the Metastore. The caller must
     * be a Metastore admin or the owner of the share.
     */
    @Override
    public ListSharesResponse list() {
        String path = "/api/2.1/unity-catalog/shares";
        return apiClient.GET(path, ListSharesResponse.class);
    }
    
	/**
     * Get permissions.
     * 
     * Gets the permissions for a data share from the Metastore. The caller must
     * be a Metastore admin or the owner of the share.
     */
    @Override
    public GetSharePermissionsResponse sharePermissions(SharePermissionsRequest request) {
        String path = String.format("/api/2.1/unity-catalog/shares/%s/permissions", request.getName());
        return apiClient.GET(path, request, GetSharePermissionsResponse.class);
    }
    
	/**
     * Update a share.
     * 
     * Updates the share with the changes and data objects in the request. The
     * caller must be the owner of the share or a Metastore admin.
     * 
     * When the caller is a Metastore admin, only the __owner__ field can be
     * updated.
     * 
     * In the case that the Share name is changed, **updateShare** requires that
     * the caller is both the share owner and a Metastore admin.
     * 
     * For each table that is added through this method, the share owner must
     * also have SELECT privilege on the table. This privilege must be
     * maintained indefinitely for recipients to be able to access the table.
     * Typically, you should use a group as the share owner.
     * 
     * Table removals through **update** do not require additional privileges.
     */
    @Override
    public ShareInfo update(UpdateShare request) {
        String path = String.format("/api/2.1/unity-catalog/shares/%s", request.getName());
        return apiClient.PATCH(path, request, ShareInfo.class);
    }
    
	/**
     * Update permissions.
     * 
     * Updates the permissions for a data share in the Metastore. The caller
     * must be a Metastore admin or an owner of the share.
     * 
     * For new recipient grants, the user must also be the owner of the
     * recipients. recipient revocations do not require additional privileges.
     */
    @Override
    public void updatePermissions(UpdateSharePermissions request) {
        String path = String.format("/api/2.1/unity-catalog/shares/%s/permissions", request.getName());
        apiClient.PATCH(path, request, Void.class);
    }
    
}