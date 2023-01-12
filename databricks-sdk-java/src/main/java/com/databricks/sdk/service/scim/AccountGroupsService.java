// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.scim;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * Groups simplify identity management, making it easier to assign access to
 * Databricks Account, data, and other securable objects.
 * 
 * It is best practice to assign access to workspaces and access-control
 * policies in Unity Catalog to groups, instead of to users individually. All
 * Databricks Account identities can be assigned as members of groups, and
 * members inherit permissions that are assigned to their group.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface AccountGroupsService {
	/**
     * Create a new group.
     * 
     * Creates a group in the Databricks Account with a unique name, using the
     * supplied group details.
     */
    Group create(Group group);
    
	/**
     * Delete a group.
     * 
     * Deletes a group from the Databricks Account.
     */
    void delete(DeleteGroupRequest deleteGroupRequest);
    
	/**
     * Get group details.
     * 
     * Gets the information for a specific group in the Databricks Account.
     */
    Group get(GetGroupRequest getGroupRequest);
    
	/**
     * List group details.
     * 
     * Gets all details of the groups associated with the Databricks Account.
     */
    ListGroupsResponse list(ListGroupsRequest listGroupsRequest);
    
	/**
     * Update group details.
     * 
     * Partially updates the details of a group.
     */
    void patch(PartialUpdate partialUpdate);
    
	/**
     * Replace a group.
     * 
     * Updates the details of a group by replacing the entire group entity.
     */
    void update(Group group);
    
}