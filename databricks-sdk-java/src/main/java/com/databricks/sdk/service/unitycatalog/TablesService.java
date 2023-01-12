// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * A table resides in the third layer of Unity Catalog’s three-level
 * namespace. It contains rows of data. To create a table, users must have
 * CREATE_TABLE and USE_SCHEMA permissions on the schema, and they must have the
 * USE_CATALOG permission on its parent catalog. To query a table, users must
 * have the SELECT permission on the table, and they must have the USE_CATALOG
 * permission on its parent catalog and the USE_SCHEMA permission on its parent
 * schema.
 * 
 * A table can be managed or external.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface TablesService {
	/**
     * Delete a table.
     * 
     * Deletes a table from the specified parent catalog and schema. The caller
     * must be the owner of the parent catalog, have the USE_CATALOG privilege
     * on the parent catalog and be the owner of the parent schema, or be the
     * owner of the table and have the USE_CATALOG privilege on the parent
     * catalog and the USE_SCHEMA privilege on the parent schema.
     */
    void delete(DeleteTableRequest deleteTableRequest);
    
	/**
     * Get a table.
     * 
     * Gets a table from the Metastore for a specific catalog and schema. The
     * caller must be a Metastore admin, be the owner of the table and have the
     * USE_CATALOG privilege on the parent catalog and the USE_SCHEMA privilege
     * on the parent schema, or be the owner of the table and have the SELECT
     * privilege on it as well.
     */
    TableInfo get(GetTableRequest getTableRequest);
    
	/**
     * List tables.
     * 
     * Gets an array of all tables for the current Metastore under the parent
     * catalog and schema. The caller must be a Metastore admin or an owner of
     * (or have the SELECT privilege on) the table. For the latter case, the
     * caller must also be the owner or have the USE_CATALOG privilege on the
     * parent catalog and the USE_SCHEMA privilege on the parent schema.
     */
    ListTablesResponse list(ListTablesRequest listTablesRequest);
    
	/**
     * List table summaries.
     * 
     * Gets an array of summaries for tables for a schema and catalog within the
     * Metastore. The table summaries returned are either:
     * 
     * * summaries for all tables (within the current Metastore and parent
     * catalog and schema), when the user is a Metastore admin, or: * summaries
     * for all tables and schemas (within the current Metastore and parent
     * catalog) for which the user has ownership or the SELECT privilege on the
     * Table and ownership or USE_SCHEMA privilege on the Schema, provided that
     * the user also has ownership or the USE_CATALOG privilege on the parent
     * Catalog
     */
    ListTableSummariesResponse tableSummaries(TableSummariesRequest tableSummariesRequest);
    
}