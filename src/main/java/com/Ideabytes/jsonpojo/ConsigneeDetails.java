package com.Ideabytes.jsonpojo;

import java.io.Serializable;
import java.util.HashMap;
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
        "compContactName",
        "compAddrZip",
        "comp_addr_city",
        "comp_addr_country",
        "distributionEmails",
        "companyName",
        "comapnyInfoForDecl",
        "compAddrContactName",
        "emailID",
        "compBoxidSequenceUpdateddate",
        "comp_addr_phone_num",
        "compBoxidSequenceNoofdigits",
        "doc_type_name",
        "compBoxidSequenceLatestnumber",
        "shipperBoxIdSequence",
        "compAddrState"
})
public class ConsigneeDetails implements Serializable
{

    @JsonProperty("compContactName")
    private String compContactName;
    @JsonProperty("compAddrZip")
    private String compAddrZip;
    @JsonProperty("comp_addr_city")
    private String compAddrCity;
    @JsonProperty("comp_addr_country")
    private String compAddrCountry;
    @JsonProperty("distributionEmails")
    private String distributionEmails;
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("comapnyInfoForDecl")
    private String comapnyInfoForDecl;
    @JsonProperty("compAddrContactName")
    private String compAddrContactName;
    @JsonProperty("emailID")
    private String emailID;
    @JsonProperty("compBoxidSequenceUpdateddate")
    private String compBoxidSequenceUpdateddate;
    @JsonProperty("comp_addr_phone_num")
    private String compAddrPhoneNum;
    @JsonProperty("compBoxidSequenceNoofdigits")
    private String compBoxidSequenceNoofdigits;
    @JsonProperty("doc_type_name")
    private String docTypeName;
    @JsonProperty("compBoxidSequenceLatestnumber")
    private String compBoxidSequenceLatestnumber;
    @JsonProperty("shipperBoxIdSequence")
    private String shipperBoxIdSequence;
    @JsonProperty("compAddrState")
    private String compAddrState;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1701827050804869166L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ConsigneeDetails() {
    }

    /**
     *
     * @param compContactName
     * @param compAddrZip
     * @param distributionEmails
     * @param companyName
     * @param comapnyInfoForDecl
     * @param compAddrContactName
     * @param emailID
     * @param compBoxidSequenceUpdateddate
     * @param compAddrPhoneNum
     * @param compBoxidSequenceNoofdigits
     * @param compAddrCountry
     * @param docTypeName
     * @param compAddrCity
     * @param compBoxidSequenceLatestnumber
     * @param shipperBoxIdSequence
     * @param compAddrState
     */
    public ConsigneeDetails(String compContactName, String compAddrZip, String compAddrCity, String compAddrCountry, String distributionEmails, String companyName, String comapnyInfoForDecl, String compAddrContactName, String emailID, String compBoxidSequenceUpdateddate, String compAddrPhoneNum, String compBoxidSequenceNoofdigits, String docTypeName, String compBoxidSequenceLatestnumber, String shipperBoxIdSequence, String compAddrState) {
        super();
        this.compContactName = compContactName;
        this.compAddrZip = compAddrZip;
        this.compAddrCity = compAddrCity;
        this.compAddrCountry = compAddrCountry;
        this.distributionEmails = distributionEmails;
        this.companyName = companyName;
        this.comapnyInfoForDecl = comapnyInfoForDecl;
        this.compAddrContactName = compAddrContactName;
        this.emailID = emailID;
        this.compBoxidSequenceUpdateddate = compBoxidSequenceUpdateddate;
        this.compAddrPhoneNum = compAddrPhoneNum;
        this.compBoxidSequenceNoofdigits = compBoxidSequenceNoofdigits;
        this.docTypeName = docTypeName;
        this.compBoxidSequenceLatestnumber = compBoxidSequenceLatestnumber;
        this.shipperBoxIdSequence = shipperBoxIdSequence;
        this.compAddrState = compAddrState;
    }

    @JsonProperty("compContactName")
    public String getCompContactName() {
        return compContactName;
    }

    @JsonProperty("compContactName")
    public void setCompContactName(String compContactName) {
        this.compContactName = compContactName;
    }

    public ConsigneeDetails withCompContactName(String compContactName) {
        this.compContactName = compContactName;
        return this;
    }

    @JsonProperty("compAddrZip")
    public String getCompAddrZip() {
        return compAddrZip;
    }

    @JsonProperty("compAddrZip")
    public void setCompAddrZip(String compAddrZip) {
        this.compAddrZip = compAddrZip;
    }

    public ConsigneeDetails withCompAddrZip(String compAddrZip) {
        this.compAddrZip = compAddrZip;
        return this;
    }

    @JsonProperty("comp_addr_city")
    public String getCompAddrCity() {
        return compAddrCity;
    }

    @JsonProperty("comp_addr_city")
    public void setCompAddrCity(String compAddrCity) {
        this.compAddrCity = compAddrCity;
    }

    public ConsigneeDetails withCompAddrCity(String compAddrCity) {
        this.compAddrCity = compAddrCity;
        return this;
    }

    @JsonProperty("comp_addr_country")
    public String getCompAddrCountry() {
        return compAddrCountry;
    }

    @JsonProperty("comp_addr_country")
    public void setCompAddrCountry(String compAddrCountry) {
        this.compAddrCountry = compAddrCountry;
    }

    public ConsigneeDetails withCompAddrCountry(String compAddrCountry) {
        this.compAddrCountry = compAddrCountry;
        return this;
    }

    @JsonProperty("distributionEmails")
    public String getDistributionEmails() {
        return distributionEmails;
    }

    @JsonProperty("distributionEmails")
    public void setDistributionEmails(String distributionEmails) {
        this.distributionEmails = distributionEmails;
    }

    public ConsigneeDetails withDistributionEmails(String distributionEmails) {
        this.distributionEmails = distributionEmails;
        return this;
    }

    @JsonProperty("companyName")
    public String getCompanyName() {
        return companyName;
    }

    @JsonProperty("companyName")
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ConsigneeDetails withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    @JsonProperty("comapnyInfoForDecl")
    public String getComapnyInfoForDecl() {
        return comapnyInfoForDecl;
    }

    @JsonProperty("comapnyInfoForDecl")
    public void setComapnyInfoForDecl(String comapnyInfoForDecl) {
        this.comapnyInfoForDecl = comapnyInfoForDecl;
    }

    public ConsigneeDetails withComapnyInfoForDecl(String comapnyInfoForDecl) {
        this.comapnyInfoForDecl = comapnyInfoForDecl;
        return this;
    }

    @JsonProperty("compAddrContactName")
    public String getCompAddrContactName() {
        return compAddrContactName;
    }

    @JsonProperty("compAddrContactName")
    public void setCompAddrContactName(String compAddrContactName) {
        this.compAddrContactName = compAddrContactName;
    }

    public ConsigneeDetails withCompAddrContactName(String compAddrContactName) {
        this.compAddrContactName = compAddrContactName;
        return this;
    }

    @JsonProperty("emailID")
    public String getEmailID() {
        return emailID;
    }

    @JsonProperty("emailID")
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public ConsigneeDetails withEmailID(String emailID) {
        this.emailID = emailID;
        return this;
    }

    @JsonProperty("compBoxidSequenceUpdateddate")
    public String getCompBoxidSequenceUpdateddate() {
        return compBoxidSequenceUpdateddate;
    }

    @JsonProperty("compBoxidSequenceUpdateddate")
    public void setCompBoxidSequenceUpdateddate(String compBoxidSequenceUpdateddate) {
        this.compBoxidSequenceUpdateddate = compBoxidSequenceUpdateddate;
    }

    public ConsigneeDetails withCompBoxidSequenceUpdateddate(String compBoxidSequenceUpdateddate) {
        this.compBoxidSequenceUpdateddate = compBoxidSequenceUpdateddate;
        return this;
    }

    @JsonProperty("comp_addr_phone_num")
    public String getCompAddrPhoneNum() {
        return compAddrPhoneNum;
    }

    @JsonProperty("comp_addr_phone_num")
    public void setCompAddrPhoneNum(String compAddrPhoneNum) {
        this.compAddrPhoneNum = compAddrPhoneNum;
    }

    public ConsigneeDetails withCompAddrPhoneNum(String compAddrPhoneNum) {
        this.compAddrPhoneNum = compAddrPhoneNum;
        return this;
    }

    @JsonProperty("compBoxidSequenceNoofdigits")
    public String getCompBoxidSequenceNoofdigits() {
        return compBoxidSequenceNoofdigits;
    }

    @JsonProperty("compBoxidSequenceNoofdigits")
    public void setCompBoxidSequenceNoofdigits(String compBoxidSequenceNoofdigits) {
        this.compBoxidSequenceNoofdigits = compBoxidSequenceNoofdigits;
    }

    public ConsigneeDetails withCompBoxidSequenceNoofdigits(String compBoxidSequenceNoofdigits) {
        this.compBoxidSequenceNoofdigits = compBoxidSequenceNoofdigits;
        return this;
    }

    @JsonProperty("doc_type_name")
    public String getDocTypeName() {
        return docTypeName;
    }

    @JsonProperty("doc_type_name")
    public void setDocTypeName(String docTypeName) {
        this.docTypeName = docTypeName;
    }

    public ConsigneeDetails withDocTypeName(String docTypeName) {
        this.docTypeName = docTypeName;
        return this;
    }

    @JsonProperty("compBoxidSequenceLatestnumber")
    public String getCompBoxidSequenceLatestnumber() {
        return compBoxidSequenceLatestnumber;
    }

    @JsonProperty("compBoxidSequenceLatestnumber")
    public void setCompBoxidSequenceLatestnumber(String compBoxidSequenceLatestnumber) {
        this.compBoxidSequenceLatestnumber = compBoxidSequenceLatestnumber;
    }

    public ConsigneeDetails withCompBoxidSequenceLatestnumber(String compBoxidSequenceLatestnumber) {
        this.compBoxidSequenceLatestnumber = compBoxidSequenceLatestnumber;
        return this;
    }

    @JsonProperty("shipperBoxIdSequence")
    public String getShipperBoxIdSequence() {
        return shipperBoxIdSequence;
    }

    @JsonProperty("shipperBoxIdSequence")
    public void setShipperBoxIdSequence(String shipperBoxIdSequence) {
        this.shipperBoxIdSequence = shipperBoxIdSequence;
    }

    public ConsigneeDetails withShipperBoxIdSequence(String shipperBoxIdSequence) {
        this.shipperBoxIdSequence = shipperBoxIdSequence;
        return this;
    }

    @JsonProperty("compAddrState")
    public String getCompAddrState() {
        return compAddrState;
    }

    @JsonProperty("compAddrState")
    public void setCompAddrState(String compAddrState) {
        this.compAddrState = compAddrState;
    }

    public ConsigneeDetails withCompAddrState(String compAddrState) {
        this.compAddrState = compAddrState;
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

    public ConsigneeDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("compContactName", compContactName).append("compAddrZip", compAddrZip).append("compAddrCity", compAddrCity).append("compAddrCountry", compAddrCountry).append("distributionEmails", distributionEmails).append("companyName", companyName).append("comapnyInfoForDecl", comapnyInfoForDecl).append("compAddrContactName", compAddrContactName).append("emailID", emailID).append("compBoxidSequenceUpdateddate", compBoxidSequenceUpdateddate).append("compAddrPhoneNum", compAddrPhoneNum).append("compBoxidSequenceNoofdigits", compBoxidSequenceNoofdigits).append("docTypeName", docTypeName).append("compBoxidSequenceLatestnumber", compBoxidSequenceLatestnumber).append("shipperBoxIdSequence", shipperBoxIdSequence).append("compAddrState", compAddrState).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(compContactName).append(compAddrZip).append(distributionEmails).append(companyName).append(comapnyInfoForDecl).append(compAddrContactName).append(emailID).append(compBoxidSequenceUpdateddate).append(compAddrPhoneNum).append(compBoxidSequenceNoofdigits).append(compAddrCountry).append(docTypeName).append(compAddrCity).append(compBoxidSequenceLatestnumber).append(shipperBoxIdSequence).append(compAddrState).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConsigneeDetails) == false) {
            return false;
        }
        ConsigneeDetails rhs = ((ConsigneeDetails) other);
        return new EqualsBuilder().append(compContactName, rhs.compContactName).append(compAddrZip, rhs.compAddrZip).append(distributionEmails, rhs.distributionEmails).append(companyName, rhs.companyName).append(comapnyInfoForDecl, rhs.comapnyInfoForDecl).append(compAddrContactName, rhs.compAddrContactName).append(emailID, rhs.emailID).append(compBoxidSequenceUpdateddate, rhs.compBoxidSequenceUpdateddate).append(compAddrPhoneNum, rhs.compAddrPhoneNum).append(compBoxidSequenceNoofdigits, rhs.compBoxidSequenceNoofdigits).append(compAddrCountry, rhs.compAddrCountry).append(docTypeName, rhs.docTypeName).append(compAddrCity, rhs.compAddrCity).append(compBoxidSequenceLatestnumber, rhs.compBoxidSequenceLatestnumber).append(shipperBoxIdSequence, rhs.shipperBoxIdSequence).append(compAddrState, rhs.compAddrState).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}