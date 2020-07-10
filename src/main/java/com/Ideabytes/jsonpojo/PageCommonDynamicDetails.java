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
        "shipperDetails",
        "shipmentMetaDataUniqueid",
        "radioactiveCrossStripe",
        "shipmentMetaDataDeclarationType",
        "consigneeDetails",
        "sourceOfCountyAndPortWithIso",
        "customerReturn",
        "carrierInforesult",
        "docTypeBsedOnAddres",
        "consigneeInformationWaybill",
        "destOfCountyAndPortWithIso",
        "shipmentMetaDataEnableGrossWeight",
        "shipmentMetaDataDeclarationStripesEnable",
        "noOfPages",
        "shipmentMetaDataNoOfDgds",
        "additionalInfo",
        "shipmentMetaDataNoOfWayBills",
        "shipmentMetaDataPartialDeliveryStatus",
        "userInfoDetails"
})
public class PageCommonDynamicDetails implements Serializable
{

    @JsonProperty("shipperDetails")
    private ShipperDetails shipperDetails;
    @JsonProperty("shipmentMetaDataUniqueid")
    private String shipmentMetaDataUniqueid;
    @JsonProperty("radioactiveCrossStripe")
    private String radioactiveCrossStripe;
    @JsonProperty("shipmentMetaDataDeclarationType")
    private String shipmentMetaDataDeclarationType;
    @JsonProperty("consigneeDetails")
    private ConsigneeDetails consigneeDetails;
    @JsonProperty("sourceOfCountyAndPortWithIso")
    private String sourceOfCountyAndPortWithIso;
    @JsonProperty("customerReturn")
    private String customerReturn;
    @JsonProperty("carrierInforesult")
    private List<Object> carrierInforesult = new ArrayList<Object>();
    @JsonProperty("docTypeBsedOnAddres")
    private String docTypeBsedOnAddres;
    @JsonProperty("consigneeInformationWaybill")
    private String consigneeInformationWaybill;
    @JsonProperty("destOfCountyAndPortWithIso")
    private String destOfCountyAndPortWithIso;
    @JsonProperty("shipmentMetaDataEnableGrossWeight")
    private String shipmentMetaDataEnableGrossWeight;
    @JsonProperty("shipmentMetaDataDeclarationStripesEnable")
    private String shipmentMetaDataDeclarationStripesEnable;
    @JsonProperty("noOfPages")
    private String noOfPages;
    @JsonProperty("shipmentMetaDataNoOfDgds")
    private String shipmentMetaDataNoOfDgds;
    @JsonProperty("additionalInfo")
    private String additionalInfo;
    @JsonProperty("shipmentMetaDataNoOfWayBills")
    private String shipmentMetaDataNoOfWayBills;
    @JsonProperty("shipmentMetaDataPartialDeliveryStatus")
    private String shipmentMetaDataPartialDeliveryStatus;
    @JsonProperty("userInfoDetails")
    private UserInfoDetails userInfoDetails;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1767249449250197932L;

    /**
     * No args constructor for use in serialization
     *
     */
    public PageCommonDynamicDetails() {
    }

    /**
     *
     * @param shipperDetails
     * @param shipmentMetaDataUniqueid
     * @param radioactiveCrossStripe
     * @param shipmentMetaDataDeclarationType
     * @param consigneeDetails
     * @param sourceOfCountyAndPortWithIso
     * @param customerReturn
     * @param carrierInforesult
     * @param docTypeBsedOnAddres
     * @param consigneeInformationWaybill
     * @param destOfCountyAndPortWithIso
     * @param shipmentMetaDataEnableGrossWeight
     * @param shipmentMetaDataDeclarationStripesEnable
     * @param noOfPages
     * @param shipmentMetaDataNoOfDgds
     * @param additionalInfo
     * @param shipmentMetaDataNoOfWayBills
     * @param shipmentMetaDataPartialDeliveryStatus
     * @param userInfoDetails
     */
    public PageCommonDynamicDetails(ShipperDetails shipperDetails, String shipmentMetaDataUniqueid, String radioactiveCrossStripe, String shipmentMetaDataDeclarationType, ConsigneeDetails consigneeDetails, String sourceOfCountyAndPortWithIso, String customerReturn, List<Object> carrierInforesult, String docTypeBsedOnAddres, String consigneeInformationWaybill, String destOfCountyAndPortWithIso, String shipmentMetaDataEnableGrossWeight, String shipmentMetaDataDeclarationStripesEnable, String noOfPages, String shipmentMetaDataNoOfDgds, String additionalInfo, String shipmentMetaDataNoOfWayBills, String shipmentMetaDataPartialDeliveryStatus, UserInfoDetails userInfoDetails) {
        super();
        this.shipperDetails = shipperDetails;
        this.shipmentMetaDataUniqueid = shipmentMetaDataUniqueid;
        this.radioactiveCrossStripe = radioactiveCrossStripe;
        this.shipmentMetaDataDeclarationType = shipmentMetaDataDeclarationType;
        this.consigneeDetails = consigneeDetails;
        this.sourceOfCountyAndPortWithIso = sourceOfCountyAndPortWithIso;
        this.customerReturn = customerReturn;
        this.carrierInforesult = carrierInforesult;
        this.docTypeBsedOnAddres = docTypeBsedOnAddres;
        this.consigneeInformationWaybill = consigneeInformationWaybill;
        this.destOfCountyAndPortWithIso = destOfCountyAndPortWithIso;
        this.shipmentMetaDataEnableGrossWeight = shipmentMetaDataEnableGrossWeight;
        this.shipmentMetaDataDeclarationStripesEnable = shipmentMetaDataDeclarationStripesEnable;
        this.noOfPages = noOfPages;
        this.shipmentMetaDataNoOfDgds = shipmentMetaDataNoOfDgds;
        this.additionalInfo = additionalInfo;
        this.shipmentMetaDataNoOfWayBills = shipmentMetaDataNoOfWayBills;
        this.shipmentMetaDataPartialDeliveryStatus = shipmentMetaDataPartialDeliveryStatus;
        this.userInfoDetails = userInfoDetails;
    }

    @JsonProperty("shipperDetails")
    public ShipperDetails getShipperDetails() {
        return shipperDetails;
    }

    @JsonProperty("shipperDetails")
    public void setShipperDetails(ShipperDetails shipperDetails) {
        this.shipperDetails = shipperDetails;
    }

    public PageCommonDynamicDetails withShipperDetails(ShipperDetails shipperDetails) {
        this.shipperDetails = shipperDetails;
        return this;
    }

    @JsonProperty("shipmentMetaDataUniqueid")
    public String getShipmentMetaDataUniqueid() {
        return shipmentMetaDataUniqueid;
    }

    @JsonProperty("shipmentMetaDataUniqueid")
    public void setShipmentMetaDataUniqueid(String shipmentMetaDataUniqueid) {
        this.shipmentMetaDataUniqueid = shipmentMetaDataUniqueid;
    }

    public PageCommonDynamicDetails withShipmentMetaDataUniqueid(String shipmentMetaDataUniqueid) {
        this.shipmentMetaDataUniqueid = shipmentMetaDataUniqueid;
        return this;
    }

    @JsonProperty("radioactiveCrossStripe")
    public String getRadioactiveCrossStripe() {
        return radioactiveCrossStripe;
    }

    @JsonProperty("radioactiveCrossStripe")
    public void setRadioactiveCrossStripe(String radioactiveCrossStripe) {
        this.radioactiveCrossStripe = radioactiveCrossStripe;
    }

    public PageCommonDynamicDetails withRadioactiveCrossStripe(String radioactiveCrossStripe) {
        this.radioactiveCrossStripe = radioactiveCrossStripe;
        return this;
    }

    @JsonProperty("shipmentMetaDataDeclarationType")
    public String getShipmentMetaDataDeclarationType() {
        return shipmentMetaDataDeclarationType;
    }

    @JsonProperty("shipmentMetaDataDeclarationType")
    public void setShipmentMetaDataDeclarationType(String shipmentMetaDataDeclarationType) {
        this.shipmentMetaDataDeclarationType = shipmentMetaDataDeclarationType;
    }

    public PageCommonDynamicDetails withShipmentMetaDataDeclarationType(String shipmentMetaDataDeclarationType) {
        this.shipmentMetaDataDeclarationType = shipmentMetaDataDeclarationType;
        return this;
    }

    @JsonProperty("consigneeDetails")
    public ConsigneeDetails getConsigneeDetails() {
        return consigneeDetails;
    }

    @JsonProperty("consigneeDetails")
    public void setConsigneeDetails(ConsigneeDetails consigneeDetails) {
        this.consigneeDetails = consigneeDetails;
    }

    public PageCommonDynamicDetails withConsigneeDetails(ConsigneeDetails consigneeDetails) {
        this.consigneeDetails = consigneeDetails;
        return this;
    }

    @JsonProperty("sourceOfCountyAndPortWithIso")
    public String getSourceOfCountyAndPortWithIso() {
        return sourceOfCountyAndPortWithIso;
    }

    @JsonProperty("sourceOfCountyAndPortWithIso")
    public void setSourceOfCountyAndPortWithIso(String sourceOfCountyAndPortWithIso) {
        this.sourceOfCountyAndPortWithIso = sourceOfCountyAndPortWithIso;
    }

    public PageCommonDynamicDetails withSourceOfCountyAndPortWithIso(String sourceOfCountyAndPortWithIso) {
        this.sourceOfCountyAndPortWithIso = sourceOfCountyAndPortWithIso;
        return this;
    }

    @JsonProperty("customerReturn")
    public String getCustomerReturn() {
        return customerReturn;
    }

    @JsonProperty("customerReturn")
    public void setCustomerReturn(String customerReturn) {
        this.customerReturn = customerReturn;
    }

    public PageCommonDynamicDetails withCustomerReturn(String customerReturn) {
        this.customerReturn = customerReturn;
        return this;
    }

    @JsonProperty("carrierInforesult")
    public List<Object> getCarrierInforesult() {
        return carrierInforesult;
    }

    @JsonProperty("carrierInforesult")
    public void setCarrierInforesult(List<Object> carrierInforesult) {
        this.carrierInforesult = carrierInforesult;
    }

    public PageCommonDynamicDetails withCarrierInforesult(List<Object> carrierInforesult) {
        this.carrierInforesult = carrierInforesult;
        return this;
    }

    @JsonProperty("docTypeBsedOnAddres")
    public String getDocTypeBsedOnAddres() {
        return docTypeBsedOnAddres;
    }

    @JsonProperty("docTypeBsedOnAddres")
    public void setDocTypeBsedOnAddres(String docTypeBsedOnAddres) {
        this.docTypeBsedOnAddres = docTypeBsedOnAddres;
    }

    public PageCommonDynamicDetails withDocTypeBsedOnAddres(String docTypeBsedOnAddres) {
        this.docTypeBsedOnAddres = docTypeBsedOnAddres;
        return this;
    }

    @JsonProperty("consigneeInformationWaybill")
    public String getConsigneeInformationWaybill() {
        return consigneeInformationWaybill;
    }

    @JsonProperty("consigneeInformationWaybill")
    public void setConsigneeInformationWaybill(String consigneeInformationWaybill) {
        this.consigneeInformationWaybill = consigneeInformationWaybill;
    }

    public PageCommonDynamicDetails withConsigneeInformationWaybill(String consigneeInformationWaybill) {
        this.consigneeInformationWaybill = consigneeInformationWaybill;
        return this;
    }

    @JsonProperty("destOfCountyAndPortWithIso")
    public String getDestOfCountyAndPortWithIso() {
        return destOfCountyAndPortWithIso;
    }

    @JsonProperty("destOfCountyAndPortWithIso")
    public void setDestOfCountyAndPortWithIso(String destOfCountyAndPortWithIso) {
        this.destOfCountyAndPortWithIso = destOfCountyAndPortWithIso;
    }

    public PageCommonDynamicDetails withDestOfCountyAndPortWithIso(String destOfCountyAndPortWithIso) {
        this.destOfCountyAndPortWithIso = destOfCountyAndPortWithIso;
        return this;
    }

    @JsonProperty("shipmentMetaDataEnableGrossWeight")
    public String getShipmentMetaDataEnableGrossWeight() {
        return shipmentMetaDataEnableGrossWeight;
    }

    @JsonProperty("shipmentMetaDataEnableGrossWeight")
    public void setShipmentMetaDataEnableGrossWeight(String shipmentMetaDataEnableGrossWeight) {
        this.shipmentMetaDataEnableGrossWeight = shipmentMetaDataEnableGrossWeight;
    }

    public PageCommonDynamicDetails withShipmentMetaDataEnableGrossWeight(String shipmentMetaDataEnableGrossWeight) {
        this.shipmentMetaDataEnableGrossWeight = shipmentMetaDataEnableGrossWeight;
        return this;
    }

    @JsonProperty("shipmentMetaDataDeclarationStripesEnable")
    public String getShipmentMetaDataDeclarationStripesEnable() {
        return shipmentMetaDataDeclarationStripesEnable;
    }

    @JsonProperty("shipmentMetaDataDeclarationStripesEnable")
    public void setShipmentMetaDataDeclarationStripesEnable(String shipmentMetaDataDeclarationStripesEnable) {
        this.shipmentMetaDataDeclarationStripesEnable = shipmentMetaDataDeclarationStripesEnable;
    }

    public PageCommonDynamicDetails withShipmentMetaDataDeclarationStripesEnable(String shipmentMetaDataDeclarationStripesEnable) {
        this.shipmentMetaDataDeclarationStripesEnable = shipmentMetaDataDeclarationStripesEnable;
        return this;
    }

    @JsonProperty("noOfPages")
    public String getNoOfPages() {
        return noOfPages;
    }

    @JsonProperty("noOfPages")
    public void setNoOfPages(String noOfPages) {
        this.noOfPages = noOfPages;
    }

    public PageCommonDynamicDetails withNoOfPages(String noOfPages) {
        this.noOfPages = noOfPages;
        return this;
    }

    @JsonProperty("shipmentMetaDataNoOfDgds")
    public String getShipmentMetaDataNoOfDgds() {
        return shipmentMetaDataNoOfDgds;
    }

    @JsonProperty("shipmentMetaDataNoOfDgds")
    public void setShipmentMetaDataNoOfDgds(String shipmentMetaDataNoOfDgds) {
        this.shipmentMetaDataNoOfDgds = shipmentMetaDataNoOfDgds;
    }

    public PageCommonDynamicDetails withShipmentMetaDataNoOfDgds(String shipmentMetaDataNoOfDgds) {
        this.shipmentMetaDataNoOfDgds = shipmentMetaDataNoOfDgds;
        return this;
    }

    @JsonProperty("additionalInfo")
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonProperty("additionalInfo")
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public PageCommonDynamicDetails withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    @JsonProperty("shipmentMetaDataNoOfWayBills")
    public String getShipmentMetaDataNoOfWayBills() {
        return shipmentMetaDataNoOfWayBills;
    }

    @JsonProperty("shipmentMetaDataNoOfWayBills")
    public void setShipmentMetaDataNoOfWayBills(String shipmentMetaDataNoOfWayBills) {
        this.shipmentMetaDataNoOfWayBills = shipmentMetaDataNoOfWayBills;
    }

    public PageCommonDynamicDetails withShipmentMetaDataNoOfWayBills(String shipmentMetaDataNoOfWayBills) {
        this.shipmentMetaDataNoOfWayBills = shipmentMetaDataNoOfWayBills;
        return this;
    }

    @JsonProperty("shipmentMetaDataPartialDeliveryStatus")
    public String getShipmentMetaDataPartialDeliveryStatus() {
        return shipmentMetaDataPartialDeliveryStatus;
    }

    @JsonProperty("shipmentMetaDataPartialDeliveryStatus")
    public void setShipmentMetaDataPartialDeliveryStatus(String shipmentMetaDataPartialDeliveryStatus) {
        this.shipmentMetaDataPartialDeliveryStatus = shipmentMetaDataPartialDeliveryStatus;
    }

    public PageCommonDynamicDetails withShipmentMetaDataPartialDeliveryStatus(String shipmentMetaDataPartialDeliveryStatus) {
        this.shipmentMetaDataPartialDeliveryStatus = shipmentMetaDataPartialDeliveryStatus;
        return this;
    }

    @JsonProperty("userInfoDetails")
    public UserInfoDetails getUserInfoDetails() {
        return userInfoDetails;
    }

    @JsonProperty("userInfoDetails")
    public void setUserInfoDetails(UserInfoDetails userInfoDetails) {
        this.userInfoDetails = userInfoDetails;
    }

    public PageCommonDynamicDetails withUserInfoDetails(UserInfoDetails userInfoDetails) {
        this.userInfoDetails = userInfoDetails;
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

    public PageCommonDynamicDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("shipperDetails", shipperDetails).append("shipmentMetaDataUniqueid", shipmentMetaDataUniqueid).append("radioactiveCrossStripe", radioactiveCrossStripe).append("shipmentMetaDataDeclarationType", shipmentMetaDataDeclarationType).append("consigneeDetails", consigneeDetails).append("sourceOfCountyAndPortWithIso", sourceOfCountyAndPortWithIso).append("customerReturn", customerReturn).append("carrierInforesult", carrierInforesult).append("docTypeBsedOnAddres", docTypeBsedOnAddres).append("consigneeInformationWaybill", consigneeInformationWaybill).append("destOfCountyAndPortWithIso", destOfCountyAndPortWithIso).append("shipmentMetaDataEnableGrossWeight", shipmentMetaDataEnableGrossWeight).append("shipmentMetaDataDeclarationStripesEnable", shipmentMetaDataDeclarationStripesEnable).append("noOfPages", noOfPages).append("shipmentMetaDataNoOfDgds", shipmentMetaDataNoOfDgds).append("additionalInfo", additionalInfo).append("shipmentMetaDataNoOfWayBills", shipmentMetaDataNoOfWayBills).append("shipmentMetaDataPartialDeliveryStatus", shipmentMetaDataPartialDeliveryStatus).append("userInfoDetails", userInfoDetails).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(shipperDetails).append(shipmentMetaDataUniqueid).append(radioactiveCrossStripe).append(shipmentMetaDataDeclarationType).append(consigneeDetails).append(sourceOfCountyAndPortWithIso).append(customerReturn).append(carrierInforesult).append(docTypeBsedOnAddres).append(consigneeInformationWaybill).append(destOfCountyAndPortWithIso).append(shipmentMetaDataEnableGrossWeight).append(shipmentMetaDataDeclarationStripesEnable).append(noOfPages).append(shipmentMetaDataNoOfDgds).append(additionalInfo).append(shipmentMetaDataNoOfWayBills).append(shipmentMetaDataPartialDeliveryStatus).append(additionalProperties).append(userInfoDetails).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PageCommonDynamicDetails) == false) {
            return false;
        }
        PageCommonDynamicDetails rhs = ((PageCommonDynamicDetails) other);
        return new EqualsBuilder().append(shipperDetails, rhs.shipperDetails).append(shipmentMetaDataUniqueid, rhs.shipmentMetaDataUniqueid).append(radioactiveCrossStripe, rhs.radioactiveCrossStripe).append(shipmentMetaDataDeclarationType, rhs.shipmentMetaDataDeclarationType).append(consigneeDetails, rhs.consigneeDetails).append(sourceOfCountyAndPortWithIso, rhs.sourceOfCountyAndPortWithIso).append(customerReturn, rhs.customerReturn).append(carrierInforesult, rhs.carrierInforesult).append(docTypeBsedOnAddres, rhs.docTypeBsedOnAddres).append(consigneeInformationWaybill, rhs.consigneeInformationWaybill).append(destOfCountyAndPortWithIso, rhs.destOfCountyAndPortWithIso).append(shipmentMetaDataEnableGrossWeight, rhs.shipmentMetaDataEnableGrossWeight).append(shipmentMetaDataDeclarationStripesEnable, rhs.shipmentMetaDataDeclarationStripesEnable).append(noOfPages, rhs.noOfPages).append(shipmentMetaDataNoOfDgds, rhs.shipmentMetaDataNoOfDgds).append(additionalInfo, rhs.additionalInfo).append(shipmentMetaDataNoOfWayBills, rhs.shipmentMetaDataNoOfWayBills).append(shipmentMetaDataPartialDeliveryStatus, rhs.shipmentMetaDataPartialDeliveryStatus).append(additionalProperties, rhs.additionalProperties).append(userInfoDetails, rhs.userInfoDetails).isEquals();
    }

}