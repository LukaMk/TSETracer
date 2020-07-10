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
        "printDocsOrderDocCategoryName",
        "docsData",
        "printDocsOrderDocCategory",
        "printDocsOrderDocCategoryIsChecked"
})
public class AdditionalDoc implements Serializable
{

    @JsonProperty("printDocsOrderDocCategoryName")
    private String printDocsOrderDocCategoryName;
    @JsonProperty("docsData")
    private List<Object> docsData = new ArrayList<Object>();
    @JsonProperty("printDocsOrderDocCategory")
    private String printDocsOrderDocCategory;
    @JsonProperty("printDocsOrderDocCategoryIsChecked")
    private String printDocsOrderDocCategoryIsChecked;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2171382220207230549L;

    /**
     * No args constructor for use in serialization
     *
     */
    public AdditionalDoc() {
    }

    /**
     *
     * @param printDocsOrderDocCategoryName
     * @param docsData
     * @param printDocsOrderDocCategory
     * @param printDocsOrderDocCategoryIsChecked
     */
    public AdditionalDoc(String printDocsOrderDocCategoryName, List<Object> docsData, String printDocsOrderDocCategory, String printDocsOrderDocCategoryIsChecked) {
        super();
        this.printDocsOrderDocCategoryName = printDocsOrderDocCategoryName;
        this.docsData = docsData;
        this.printDocsOrderDocCategory = printDocsOrderDocCategory;
        this.printDocsOrderDocCategoryIsChecked = printDocsOrderDocCategoryIsChecked;
    }

    @JsonProperty("printDocsOrderDocCategoryName")
    public String getPrintDocsOrderDocCategoryName() {
        return printDocsOrderDocCategoryName;
    }

    @JsonProperty("printDocsOrderDocCategoryName")
    public void setPrintDocsOrderDocCategoryName(String printDocsOrderDocCategoryName) {
        this.printDocsOrderDocCategoryName = printDocsOrderDocCategoryName;
    }

    public AdditionalDoc withPrintDocsOrderDocCategoryName(String printDocsOrderDocCategoryName) {
        this.printDocsOrderDocCategoryName = printDocsOrderDocCategoryName;
        return this;
    }

    @JsonProperty("docsData")
    public List<Object> getDocsData() {
        return docsData;
    }

    @JsonProperty("docsData")
    public void setDocsData(List<Object> docsData) {
        this.docsData = docsData;
    }

    public AdditionalDoc withDocsData(List<Object> docsData) {
        this.docsData = docsData;
        return this;
    }

    @JsonProperty("printDocsOrderDocCategory")
    public String getPrintDocsOrderDocCategory() {
        return printDocsOrderDocCategory;
    }

    @JsonProperty("printDocsOrderDocCategory")
    public void setPrintDocsOrderDocCategory(String printDocsOrderDocCategory) {
        this.printDocsOrderDocCategory = printDocsOrderDocCategory;
    }

    public AdditionalDoc withPrintDocsOrderDocCategory(String printDocsOrderDocCategory) {
        this.printDocsOrderDocCategory = printDocsOrderDocCategory;
        return this;
    }

    @JsonProperty("printDocsOrderDocCategoryIsChecked")
    public String getPrintDocsOrderDocCategoryIsChecked() {
        return printDocsOrderDocCategoryIsChecked;
    }

    @JsonProperty("printDocsOrderDocCategoryIsChecked")
    public void setPrintDocsOrderDocCategoryIsChecked(String printDocsOrderDocCategoryIsChecked) {
        this.printDocsOrderDocCategoryIsChecked = printDocsOrderDocCategoryIsChecked;
    }

    public AdditionalDoc withPrintDocsOrderDocCategoryIsChecked(String printDocsOrderDocCategoryIsChecked) {
        this.printDocsOrderDocCategoryIsChecked = printDocsOrderDocCategoryIsChecked;
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

    public AdditionalDoc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("printDocsOrderDocCategoryName", printDocsOrderDocCategoryName).append("docsData", docsData).append("printDocsOrderDocCategory", printDocsOrderDocCategory).append("printDocsOrderDocCategoryIsChecked", printDocsOrderDocCategoryIsChecked).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(printDocsOrderDocCategoryName).append(docsData).append(printDocsOrderDocCategory).append(additionalProperties).append(printDocsOrderDocCategoryIsChecked).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AdditionalDoc) == false) {
            return false;
        }
        AdditionalDoc rhs = ((AdditionalDoc) other);
        return new EqualsBuilder().append(printDocsOrderDocCategoryName, rhs.printDocsOrderDocCategoryName).append(docsData, rhs.docsData).append(printDocsOrderDocCategory, rhs.printDocsOrderDocCategory).append(additionalProperties, rhs.additionalProperties).append(printDocsOrderDocCategoryIsChecked, rhs.printDocsOrderDocCategoryIsChecked).isEquals();
    }

}