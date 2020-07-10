package com.Ideabytes.jsonpojo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "pageCommonStaticDetails",
        "tableInfo",
        "additionalDocs",
        "pageCommonDynamicDetails",
        "productDocs"
})
public class ShippingDoc implements Serializable
{

    @JsonProperty("pageCommonStaticDetails")
    private PageCommonStaticDetails pageCommonStaticDetails;
    @JsonProperty("tableInfo")
    private List<TableInfo> tableInfo = new ArrayList<TableInfo>();
    @JsonProperty("additionalDocs")
    private List<AdditionalDoc> additionalDocs = new ArrayList<AdditionalDoc>();
    @JsonProperty("pageCommonDynamicDetails")
    private PageCommonDynamicDetails pageCommonDynamicDetails;
    @JsonProperty("productDocs")
    private List<Object> productDocs = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8635517810946836228L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ShippingDoc() {
    }

    /**
     *
     * @param pageCommonStaticDetails
     * @param tableInfo
     * @param additionalDocs
     * @param pageCommonDynamicDetails
     * @param productDocs
     */
    public ShippingDoc(PageCommonStaticDetails pageCommonStaticDetails, List<TableInfo> tableInfo, List<AdditionalDoc> additionalDocs, PageCommonDynamicDetails pageCommonDynamicDetails, List<Object> productDocs) {
        super();
        this.pageCommonStaticDetails = pageCommonStaticDetails;
        this.tableInfo = tableInfo;
        this.additionalDocs = additionalDocs;
        this.pageCommonDynamicDetails = pageCommonDynamicDetails;
        this.productDocs = productDocs;
    }

    @JsonProperty("pageCommonStaticDetails")
    public PageCommonStaticDetails getPageCommonStaticDetails() {
        return pageCommonStaticDetails;
    }

    @JsonProperty("pageCommonStaticDetails")
    public void setPageCommonStaticDetails(PageCommonStaticDetails pageCommonStaticDetails) {
        this.pageCommonStaticDetails = pageCommonStaticDetails;
    }

    public ShippingDoc withPageCommonStaticDetails(PageCommonStaticDetails pageCommonStaticDetails) {
        this.pageCommonStaticDetails = pageCommonStaticDetails;
        return this;
    }

    @JsonProperty("tableInfo")
    public List<TableInfo> getTableInfo() {
        return tableInfo;
    }

    @JsonProperty("tableInfo")
    public void setTableInfo(List<TableInfo> tableInfo) {
        this.tableInfo = tableInfo;
    }

    public ShippingDoc withTableInfo(List<TableInfo> tableInfo) {
        this.tableInfo = tableInfo;
        return this;
    }

    @JsonProperty("additionalDocs")
    public List<AdditionalDoc> getAdditionalDocs() {
        return additionalDocs;
    }

    @JsonProperty("additionalDocs")
    public void setAdditionalDocs(List<AdditionalDoc> additionalDocs) {
        this.additionalDocs = additionalDocs;
    }

    public ShippingDoc withAdditionalDocs(List<AdditionalDoc> additionalDocs) {
        this.additionalDocs = additionalDocs;
        return this;
    }

    @JsonProperty("pageCommonDynamicDetails")
    public PageCommonDynamicDetails getPageCommonDynamicDetails() {
        return pageCommonDynamicDetails;
    }

    @JsonProperty("pageCommonDynamicDetails")
    public void setPageCommonDynamicDetails(PageCommonDynamicDetails pageCommonDynamicDetails) {
        this.pageCommonDynamicDetails = pageCommonDynamicDetails;
    }

    public ShippingDoc withPageCommonDynamicDetails(PageCommonDynamicDetails pageCommonDynamicDetails) {
        this.pageCommonDynamicDetails = pageCommonDynamicDetails;
        return this;
    }

    @JsonProperty("productDocs")
    public List<Object> getProductDocs() {
        return productDocs;
    }

    @JsonProperty("productDocs")
    public void setProductDocs(List<Object> productDocs) {
        this.productDocs = productDocs;
    }

    public ShippingDoc withProductDocs(List<Object> productDocs) {
        this.productDocs = productDocs;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ShippingDoc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pageCommonStaticDetails", pageCommonStaticDetails).append("tableInfo", tableInfo).append("additionalDocs", additionalDocs).append("pageCommonDynamicDetails", pageCommonDynamicDetails).append("productDocs", productDocs).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pageCommonStaticDetails).append(tableInfo).append(additionalDocs).append(pageCommonDynamicDetails).append(productDocs).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShippingDoc) == false) {
            return false;
        }
        ShippingDoc rhs = ((ShippingDoc) other);
        return new EqualsBuilder().append(pageCommonStaticDetails, rhs.pageCommonStaticDetails).append(tableInfo, rhs.tableInfo).append(additionalDocs, rhs.additionalDocs).append(pageCommonDynamicDetails, rhs.pageCommonDynamicDetails).append(productDocs, rhs.productDocs).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}