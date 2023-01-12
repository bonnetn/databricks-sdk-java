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
 * An external location is an object that combines a cloud storage path with a
 * storage credential that authorizes access to the cloud storage path. Each
 * external location is subject to Unity Catalog access-control policies that
 * control which users and groups can access the credential. If a user does not
 * have access to an external location in Unity Catalog, the request fails and
 * Unity Catalog does not attempt to authenticate to your cloud tenant on the
 * user’s behalf.
 * 
 * Databricks recommends using external locations rather than using storage
 * credentials directly.
 * 
 * To create external locations, you must be a metastore admin or a user with
 * the CREATE_EXTERNAL_LOCATION privilege.
 */
@Generated("databricks-sdk-generator")
public class ExternalLocationsAPI implements ExternalLocationsService {
    private final ApiClient apiClient;

    public ExternalLocationsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create an external location.
     * 
     * Creates a new External Location entry in the Metastore. The caller must
     * be a Metastore admin or have the CREATE_EXTERNAL_LOCATION privilege on
     * both the Metastore and the associated storage credential.
     */
    @Override
    public ExternalLocationInfo create(CreateExternalLocation request) {
        String path = "/api/2.1/unity-catalog/external-locations";
        return apiClient.POST(path, request, ExternalLocationInfo.class);
    }
    
	/**
     * Delete an external location.
     * 
     * Deletes the specified external location from the Metastore. The caller
     * must be the owner of the external location.
     */
    @Override
    public void delete(DeleteExternalLocationRequest request) {
        String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get an external location.
     * 
     * Gets an external location from the Metastore. The caller must be either a
     * Metastore admin, the owner of the external location, or has some
     * privilege on the external location.
     */
    @Override
    public ExternalLocationInfo get(GetExternalLocationRequest request) {
        String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());
        return apiClient.GET(path, request, ExternalLocationInfo.class);
    }
    
	/**
     * List external locations.
     * 
     * Gets an array of External Locations (ExternalLocationInfo objects) from
     * the Metastore. The caller must be a Metastore admin, is the owner of the
     * external location, or has some privilege on the external location.
     */
    @Override
    public ListExternalLocationsResponse list() {
        String path = "/api/2.1/unity-catalog/external-locations";
        return apiClient.GET(path, ListExternalLocationsResponse.class);
    }
    
	/**
     * Update an external location.
     * 
     * Updates an external location in the Metastore. The caller must be the
     * owner of the external location, or be a Metastore admin. In the second
     * case, the admin can only update the name of the external location.
     */
    @Override
    public ExternalLocationInfo update(UpdateExternalLocation request) {
        String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());
        return apiClient.PATCH(path, request, ExternalLocationInfo.class);
    }
    
}