// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class RecipientInfo {
    /**
     * A boolean status field showing whether the Recipient's activation URL has
     * been exercised or not.
     */
    @JsonProperty("activated")
    private Boolean activated;
    
    /**
     * Full activation url to retrieve the access token. It will be empty if the
     * token is already retrieved.
     */
    @JsonProperty("activation_url")
    private String activationUrl;
    
    /**
     * The delta sharing authentication type.
     */
    @JsonProperty("authentication_type")
    private AuthenticationType authenticationType;
    
    /**
     * Cloud vendor of the recipient's Unity Catalog Metstore. This field is
     * only present when the authentication type is `DATABRICKS`.
     */
    @JsonProperty("cloud")
    private String cloud;
    
    /**
     * Description about the recipient.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Time at which this recipient was created, in epoch milliseconds.
     */
    @JsonProperty("created_at")
    private Long createdAt;
    
    /**
     * Username of recipient creator.
     */
    @JsonProperty("created_by")
    private String createdBy;
    
    /**
     * The global Unity Catalog metastore id provided by the data recipient.\n
     * This field is only present when the authentication type is
     * `DATABRICKS`.\n The identifier is of format
     * <cloud>:<region>:<metastore-uuid>.
     */
    @JsonProperty("data_recipient_global_metastore_id")
    private Object /* MISSING TYPE */ dataRecipientGlobalMetastoreId;
    
    /**
     * IP Access List
     */
    @JsonProperty("ip_access_list")
    private IpAccessList ipAccessList;
    
    /**
     * Unique identifier of recipient's Unity Catalog Metastore. This field is
     * only present when the authentication type is `DATABRICKS`
     */
    @JsonProperty("metastore_id")
    private String metastoreId;
    
    /**
     * Name of Recipient.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Cloud region of the recipient's Unity Catalog Metstore. This field is
     * only present when the authentication type is `DATABRICKS`.
     */
    @JsonProperty("region")
    private String region;
    
    /**
     * The one-time sharing code provided by the data recipient. This field is
     * only present when the authentication type is `DATABRICKS`.
     */
    @JsonProperty("sharing_code")
    private String sharingCode;
    
    /**
     * This field is only present when the authentication type is `TOKEN`.
     */
    @JsonProperty("tokens")
    private java.util.List<RecipientTokenInfo> tokens;
    
    /**
     * Time at which the recipient was updated, in epoch milliseconds.
     */
    @JsonProperty("updated_at")
    private Long updatedAt;
    
    /**
     * Username of recipient updater.
     */
    @JsonProperty("updated_by")
    private String updatedBy;
    
    public RecipientInfo setActivated(Boolean activated) {
        this.activated = activated;
        return this;
    }

    public Boolean getActivated() {
        return activated;
    }
    
    public RecipientInfo setActivationUrl(String activationUrl) {
        this.activationUrl = activationUrl;
        return this;
    }

    public String getActivationUrl() {
        return activationUrl;
    }
    
    public RecipientInfo setAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }
    
    public RecipientInfo setCloud(String cloud) {
        this.cloud = cloud;
        return this;
    }

    public String getCloud() {
        return cloud;
    }
    
    public RecipientInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public RecipientInfo setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    
    public RecipientInfo setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    
    public RecipientInfo setDataRecipientGlobalMetastoreId(Object /* MISSING TYPE */ dataRecipientGlobalMetastoreId) {
        this.dataRecipientGlobalMetastoreId = dataRecipientGlobalMetastoreId;
        return this;
    }

    public Object /* MISSING TYPE */ getDataRecipientGlobalMetastoreId() {
        return dataRecipientGlobalMetastoreId;
    }
    
    public RecipientInfo setIpAccessList(IpAccessList ipAccessList) {
        this.ipAccessList = ipAccessList;
        return this;
    }

    public IpAccessList getIpAccessList() {
        return ipAccessList;
    }
    
    public RecipientInfo setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    public String getMetastoreId() {
        return metastoreId;
    }
    
    public RecipientInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public RecipientInfo setRegion(String region) {
        this.region = region;
        return this;
    }

    public String getRegion() {
        return region;
    }
    
    public RecipientInfo setSharingCode(String sharingCode) {
        this.sharingCode = sharingCode;
        return this;
    }

    public String getSharingCode() {
        return sharingCode;
    }
    
    public RecipientInfo setTokens(java.util.List<RecipientTokenInfo> tokens) {
        this.tokens = tokens;
        return this;
    }

    public java.util.List<RecipientTokenInfo> getTokens() {
        return tokens;
    }
    
    public RecipientInfo setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }
    
    public RecipientInfo setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }
    
}
