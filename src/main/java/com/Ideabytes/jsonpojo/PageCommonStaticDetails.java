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
        "handlingInformation",
        "transportInformation",
        "signature",
        "truckType",
        "billOfLading",
        "shipmentMetaDataShipperReferenceNumber",
        "companyName",
        "destination",
        "portOfDischarge",
        "currentDate",
        "shipmentMetadataSealNo",
        "shipmentMetaDataCustPoNo",
        "pageName",
        "weightOfDunning",
        "carrierName",
        "nameAndTitleOfSignature",
        "saidToContainDesc",
        "place",
        "templateRefNo",
        "cargo",
        "containerSize",
        "containerNumberDesc",
        "containerNoAndSealNo",
        "signForCarrierBasedDoc",
        "portOfSourceWithCountry",
        "conatinerNameAndSize",
        "vesselAndVoyageNo",
        "marinePollutant",
        "consigneeInformation",
        "truckTypeId",
        "version",
        "bookingId",
        "airwayBillNo",
        "totalWeight",
        "shipperInformation",
        "time",
        "portOfLoading",
        "portOfDischargeWithCountry",
        "passengerAndCargo",
        "tareWeight",
        "currentDateAndTime"
})
public class PageCommonStaticDetails implements Serializable
{

    @JsonProperty("handlingInformation")
    private String handlingInformation;
    @JsonProperty("transportInformation")
    private String transportInformation;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("truckType")
    private String truckType;
    @JsonProperty("billOfLading")
    private String billOfLading;
    @JsonProperty("shipmentMetaDataShipperReferenceNumber")
    private String shipmentMetaDataShipperReferenceNumber;
    @JsonProperty("companyName")
    private String companyName;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("portOfDischarge")
    private String portOfDischarge;
    @JsonProperty("currentDate")
    private String currentDate;
    @JsonProperty("shipmentMetadataSealNo")
    private String shipmentMetadataSealNo;
    @JsonProperty("shipmentMetaDataCustPoNo")
    private String shipmentMetaDataCustPoNo;
    @JsonProperty("pageName")
    private String pageName;
    @JsonProperty("weightOfDunning")
    private String weightOfDunning;
    @JsonProperty("carrierName")
    private String carrierName;
    @JsonProperty("nameAndTitleOfSignature")
    private String nameAndTitleOfSignature;
    @JsonProperty("saidToContainDesc")
    private String saidToContainDesc;
    @JsonProperty("place")
    private String place;
    @JsonProperty("templateRefNo")
    private String templateRefNo;
    @JsonProperty("cargo")
    private String cargo;
    @JsonProperty("containerSize")
    private String containerSize;
    @JsonProperty("containerNumberDesc")
    private String containerNumberDesc;
    @JsonProperty("containerNoAndSealNo")
    private String containerNoAndSealNo;
    @JsonProperty("signForCarrierBasedDoc")
    private String signForCarrierBasedDoc;
    @JsonProperty("portOfSourceWithCountry")
    private String portOfSourceWithCountry;
    @JsonProperty("conatinerNameAndSize")
    private String conatinerNameAndSize;
    @JsonProperty("vesselAndVoyageNo")
    private String vesselAndVoyageNo;
    @JsonProperty("marinePollutant")
    private String marinePollutant;
    @JsonProperty("consigneeInformation")
    private String consigneeInformation;
    @JsonProperty("truckTypeId")
    private String truckTypeId;
    @JsonProperty("version")
    private String version;
    @JsonProperty("bookingId")
    private String bookingId;
    @JsonProperty("airwayBillNo")
    private String airwayBillNo;
    @JsonProperty("totalWeight")
    private String totalWeight;
    @JsonProperty("shipperInformation")
    private String shipperInformation;
    @JsonProperty("time")
    private String time;
    @JsonProperty("portOfLoading")
    private String portOfLoading;
    @JsonProperty("portOfDischargeWithCountry")
    private String portOfDischargeWithCountry;
    @JsonProperty("passengerAndCargo")
    private String passengerAndCargo;
    @JsonProperty("tareWeight")
    private String tareWeight;
    @JsonProperty("currentDateAndTime")
    private String currentDateAndTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8857905319987411818L;

    /**
     * No args constructor for use in serialization
     *
     */
    public PageCommonStaticDetails() {
    }

    /**
     *
     * @param handlingInformation
     * @param transportInformation
     * @param signature
     * @param truckType
     * @param billOfLading
     * @param shipmentMetaDataShipperReferenceNumber
     * @param companyName
     * @param destination
     * @param portOfDischarge
     * @param currentDate
     * @param shipmentMetadataSealNo
     * @param shipmentMetaDataCustPoNo
     * @param pageName
     * @param weightOfDunning
     * @param carrierName
     * @param nameAndTitleOfSignature
     * @param saidToContainDesc
     * @param place
     * @param templateRefNo
     * @param cargo
     * @param containerSize
     * @param containerNumberDesc
     * @param containerNoAndSealNo
     * @param signForCarrierBasedDoc
     * @param portOfSourceWithCountry
     * @param conatinerNameAndSize
     * @param vesselAndVoyageNo
     * @param marinePollutant
     * @param consigneeInformation
     * @param truckTypeId
     * @param version
     * @param bookingId
     * @param airwayBillNo
     * @param totalWeight
     * @param shipperInformation
     * @param time
     * @param portOfLoading
     * @param portOfDischargeWithCountry
     * @param passengerAndCargo
     * @param tareWeight
     * @param currentDateAndTime
     */
    public PageCommonStaticDetails(String handlingInformation, String transportInformation, String signature, String truckType, String billOfLading, String shipmentMetaDataShipperReferenceNumber, String companyName, String destination, String portOfDischarge, String currentDate, String shipmentMetadataSealNo, String shipmentMetaDataCustPoNo, String pageName, String weightOfDunning, String carrierName, String nameAndTitleOfSignature, String saidToContainDesc, String place, String templateRefNo, String cargo, String containerSize, String containerNumberDesc, String containerNoAndSealNo, String signForCarrierBasedDoc, String portOfSourceWithCountry, String conatinerNameAndSize, String vesselAndVoyageNo, String marinePollutant, String consigneeInformation, String truckTypeId, String version, String bookingId, String airwayBillNo, String totalWeight, String shipperInformation, String time, String portOfLoading, String portOfDischargeWithCountry, String passengerAndCargo, String tareWeight, String currentDateAndTime) {
        super();
        this.handlingInformation = handlingInformation;
        this.transportInformation = transportInformation;
        this.signature = signature;
        this.truckType = truckType;
        this.billOfLading = billOfLading;
        this.shipmentMetaDataShipperReferenceNumber = shipmentMetaDataShipperReferenceNumber;
        this.companyName = companyName;
        this.destination = destination;
        this.portOfDischarge = portOfDischarge;
        this.currentDate = currentDate;
        this.shipmentMetadataSealNo = shipmentMetadataSealNo;
        this.shipmentMetaDataCustPoNo = shipmentMetaDataCustPoNo;
        this.pageName = pageName;
        this.weightOfDunning = weightOfDunning;
        this.carrierName = carrierName;
        this.nameAndTitleOfSignature = nameAndTitleOfSignature;
        this.saidToContainDesc = saidToContainDesc;
        this.place = place;
        this.templateRefNo = templateRefNo;
        this.cargo = cargo;
        this.containerSize = containerSize;
        this.containerNumberDesc = containerNumberDesc;
        this.containerNoAndSealNo = containerNoAndSealNo;
        this.signForCarrierBasedDoc = signForCarrierBasedDoc;
        this.portOfSourceWithCountry = portOfSourceWithCountry;
        this.conatinerNameAndSize = conatinerNameAndSize;
        this.vesselAndVoyageNo = vesselAndVoyageNo;
        this.marinePollutant = marinePollutant;
        this.consigneeInformation = consigneeInformation;
        this.truckTypeId = truckTypeId;
        this.version = version;
        this.bookingId = bookingId;
        this.airwayBillNo = airwayBillNo;
        this.totalWeight = totalWeight;
        this.shipperInformation = shipperInformation;
        this.time = time;
        this.portOfLoading = portOfLoading;
        this.portOfDischargeWithCountry = portOfDischargeWithCountry;
        this.passengerAndCargo = passengerAndCargo;
        this.tareWeight = tareWeight;
        this.currentDateAndTime = currentDateAndTime;
    }

    @JsonProperty("handlingInformation")
    public String getHandlingInformation() {
        return handlingInformation;
    }

    @JsonProperty("handlingInformation")
    public void setHandlingInformation(String handlingInformation) {
        this.handlingInformation = handlingInformation;
    }

    public PageCommonStaticDetails withHandlingInformation(String handlingInformation) {
        this.handlingInformation = handlingInformation;
        return this;
    }

    @JsonProperty("transportInformation")
    public String getTransportInformation() {
        return transportInformation;
    }

    @JsonProperty("transportInformation")
    public void setTransportInformation(String transportInformation) {
        this.transportInformation = transportInformation;
    }

    public PageCommonStaticDetails withTransportInformation(String transportInformation) {
        this.transportInformation = transportInformation;
        return this;
    }

    @JsonProperty("signature")
    public String getSignature() {
        return signature;
    }

    @JsonProperty("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    public PageCommonStaticDetails withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    @JsonProperty("truckType")
    public String getTruckType() {
        return truckType;
    }

    @JsonProperty("truckType")
    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public PageCommonStaticDetails withTruckType(String truckType) {
        this.truckType = truckType;
        return this;
    }

    @JsonProperty("billOfLading")
    public String getBillOfLading() {
        return billOfLading;
    }

    @JsonProperty("billOfLading")
    public void setBillOfLading(String billOfLading) {
        this.billOfLading = billOfLading;
    }

    public PageCommonStaticDetails withBillOfLading(String billOfLading) {
        this.billOfLading = billOfLading;
        return this;
    }

    @JsonProperty("shipmentMetaDataShipperReferenceNumber")
    public String getShipmentMetaDataShipperReferenceNumber() {
        return shipmentMetaDataShipperReferenceNumber;
    }

    @JsonProperty("shipmentMetaDataShipperReferenceNumber")
    public void setShipmentMetaDataShipperReferenceNumber(String shipmentMetaDataShipperReferenceNumber) {
        this.shipmentMetaDataShipperReferenceNumber = shipmentMetaDataShipperReferenceNumber;
    }

    public PageCommonStaticDetails withShipmentMetaDataShipperReferenceNumber(String shipmentMetaDataShipperReferenceNumber) {
        this.shipmentMetaDataShipperReferenceNumber = shipmentMetaDataShipperReferenceNumber;
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

    public PageCommonStaticDetails withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public PageCommonStaticDetails withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    @JsonProperty("portOfDischarge")
    public String getPortOfDischarge() {
        return portOfDischarge;
    }

    @JsonProperty("portOfDischarge")
    public void setPortOfDischarge(String portOfDischarge) {
        this.portOfDischarge = portOfDischarge;
    }

    public PageCommonStaticDetails withPortOfDischarge(String portOfDischarge) {
        this.portOfDischarge = portOfDischarge;
        return this;
    }

    @JsonProperty("currentDate")
    public String getCurrentDate() {
        return currentDate;
    }

    @JsonProperty("currentDate")
    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public PageCommonStaticDetails withCurrentDate(String currentDate) {
        this.currentDate = currentDate;
        return this;
    }

    @JsonProperty("shipmentMetadataSealNo")
    public String getShipmentMetadataSealNo() {
        return shipmentMetadataSealNo;
    }

    @JsonProperty("shipmentMetadataSealNo")
    public void setShipmentMetadataSealNo(String shipmentMetadataSealNo) {
        this.shipmentMetadataSealNo = shipmentMetadataSealNo;
    }

    public PageCommonStaticDetails withShipmentMetadataSealNo(String shipmentMetadataSealNo) {
        this.shipmentMetadataSealNo = shipmentMetadataSealNo;
        return this;
    }

    @JsonProperty("shipmentMetaDataCustPoNo")
    public String getShipmentMetaDataCustPoNo() {
        return shipmentMetaDataCustPoNo;
    }

    @JsonProperty("shipmentMetaDataCustPoNo")
    public void setShipmentMetaDataCustPoNo(String shipmentMetaDataCustPoNo) {
        this.shipmentMetaDataCustPoNo = shipmentMetaDataCustPoNo;
    }

    public PageCommonStaticDetails withShipmentMetaDataCustPoNo(String shipmentMetaDataCustPoNo) {
        this.shipmentMetaDataCustPoNo = shipmentMetaDataCustPoNo;
        return this;
    }

    @JsonProperty("pageName")
    public String getPageName() {
        return pageName;
    }

    @JsonProperty("pageName")
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public PageCommonStaticDetails withPageName(String pageName) {
        this.pageName = pageName;
        return this;
    }

    @JsonProperty("weightOfDunning")
    public String getWeightOfDunning() {
        return weightOfDunning;
    }

    @JsonProperty("weightOfDunning")
    public void setWeightOfDunning(String weightOfDunning) {
        this.weightOfDunning = weightOfDunning;
    }

    public PageCommonStaticDetails withWeightOfDunning(String weightOfDunning) {
        this.weightOfDunning = weightOfDunning;
        return this;
    }

    @JsonProperty("carrierName")
    public String getCarrierName() {
        return carrierName;
    }

    @JsonProperty("carrierName")
    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public PageCommonStaticDetails withCarrierName(String carrierName) {
        this.carrierName = carrierName;
        return this;
    }

    @JsonProperty("nameAndTitleOfSignature")
    public String getNameAndTitleOfSignature() {
        return nameAndTitleOfSignature;
    }

    @JsonProperty("nameAndTitleOfSignature")
    public void setNameAndTitleOfSignature(String nameAndTitleOfSignature) {
        this.nameAndTitleOfSignature = nameAndTitleOfSignature;
    }

    public PageCommonStaticDetails withNameAndTitleOfSignature(String nameAndTitleOfSignature) {
        this.nameAndTitleOfSignature = nameAndTitleOfSignature;
        return this;
    }

    @JsonProperty("saidToContainDesc")
    public String getSaidToContainDesc() {
        return saidToContainDesc;
    }

    @JsonProperty("saidToContainDesc")
    public void setSaidToContainDesc(String saidToContainDesc) {
        this.saidToContainDesc = saidToContainDesc;
    }

    public PageCommonStaticDetails withSaidToContainDesc(String saidToContainDesc) {
        this.saidToContainDesc = saidToContainDesc;
        return this;
    }

    @JsonProperty("place")
    public String getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(String place) {
        this.place = place;
    }

    public PageCommonStaticDetails withPlace(String place) {
        this.place = place;
        return this;
    }

    @JsonProperty("templateRefNo")
    public String getTemplateRefNo() {
        return templateRefNo;
    }

    @JsonProperty("templateRefNo")
    public void setTemplateRefNo(String templateRefNo) {
        this.templateRefNo = templateRefNo;
    }

    public PageCommonStaticDetails withTemplateRefNo(String templateRefNo) {
        this.templateRefNo = templateRefNo;
        return this;
    }

    @JsonProperty("cargo")
    public String getCargo() {
        return cargo;
    }

    @JsonProperty("cargo")
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public PageCommonStaticDetails withCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    @JsonProperty("containerSize")
    public String getContainerSize() {
        return containerSize;
    }

    @JsonProperty("containerSize")
    public void setContainerSize(String containerSize) {
        this.containerSize = containerSize;
    }

    public PageCommonStaticDetails withContainerSize(String containerSize) {
        this.containerSize = containerSize;
        return this;
    }

    @JsonProperty("containerNumberDesc")
    public String getContainerNumberDesc() {
        return containerNumberDesc;
    }

    @JsonProperty("containerNumberDesc")
    public void setContainerNumberDesc(String containerNumberDesc) {
        this.containerNumberDesc = containerNumberDesc;
    }

    public PageCommonStaticDetails withContainerNumberDesc(String containerNumberDesc) {
        this.containerNumberDesc = containerNumberDesc;
        return this;
    }

    @JsonProperty("containerNoAndSealNo")
    public String getContainerNoAndSealNo() {
        return containerNoAndSealNo;
    }

    @JsonProperty("containerNoAndSealNo")
    public void setContainerNoAndSealNo(String containerNoAndSealNo) {
        this.containerNoAndSealNo = containerNoAndSealNo;
    }

    public PageCommonStaticDetails withContainerNoAndSealNo(String containerNoAndSealNo) {
        this.containerNoAndSealNo = containerNoAndSealNo;
        return this;
    }

    @JsonProperty("signForCarrierBasedDoc")
    public String getSignForCarrierBasedDoc() {
        return signForCarrierBasedDoc;
    }

    @JsonProperty("signForCarrierBasedDoc")
    public void setSignForCarrierBasedDoc(String signForCarrierBasedDoc) {
        this.signForCarrierBasedDoc = signForCarrierBasedDoc;
    }

    public PageCommonStaticDetails withSignForCarrierBasedDoc(String signForCarrierBasedDoc) {
        this.signForCarrierBasedDoc = signForCarrierBasedDoc;
        return this;
    }

    @JsonProperty("portOfSourceWithCountry")
    public String getPortOfSourceWithCountry() {
        return portOfSourceWithCountry;
    }

    @JsonProperty("portOfSourceWithCountry")
    public void setPortOfSourceWithCountry(String portOfSourceWithCountry) {
        this.portOfSourceWithCountry = portOfSourceWithCountry;
    }

    public PageCommonStaticDetails withPortOfSourceWithCountry(String portOfSourceWithCountry) {
        this.portOfSourceWithCountry = portOfSourceWithCountry;
        return this;
    }

    @JsonProperty("conatinerNameAndSize")
    public String getConatinerNameAndSize() {
        return conatinerNameAndSize;
    }

    @JsonProperty("conatinerNameAndSize")
    public void setConatinerNameAndSize(String conatinerNameAndSize) {
        this.conatinerNameAndSize = conatinerNameAndSize;
    }

    public PageCommonStaticDetails withConatinerNameAndSize(String conatinerNameAndSize) {
        this.conatinerNameAndSize = conatinerNameAndSize;
        return this;
    }

    @JsonProperty("vesselAndVoyageNo")
    public String getVesselAndVoyageNo() {
        return vesselAndVoyageNo;
    }

    @JsonProperty("vesselAndVoyageNo")
    public void setVesselAndVoyageNo(String vesselAndVoyageNo) {
        this.vesselAndVoyageNo = vesselAndVoyageNo;
    }

    public PageCommonStaticDetails withVesselAndVoyageNo(String vesselAndVoyageNo) {
        this.vesselAndVoyageNo = vesselAndVoyageNo;
        return this;
    }

    @JsonProperty("marinePollutant")
    public String getMarinePollutant() {
        return marinePollutant;
    }

    @JsonProperty("marinePollutant")
    public void setMarinePollutant(String marinePollutant) {
        this.marinePollutant = marinePollutant;
    }

    public PageCommonStaticDetails withMarinePollutant(String marinePollutant) {
        this.marinePollutant = marinePollutant;
        return this;
    }

    @JsonProperty("consigneeInformation")
    public String getConsigneeInformation() {
        return consigneeInformation;
    }

    @JsonProperty("consigneeInformation")
    public void setConsigneeInformation(String consigneeInformation) {
        this.consigneeInformation = consigneeInformation;
    }

    public PageCommonStaticDetails withConsigneeInformation(String consigneeInformation) {
        this.consigneeInformation = consigneeInformation;
        return this;
    }

    @JsonProperty("truckTypeId")
    public String getTruckTypeId() {
        return truckTypeId;
    }

    @JsonProperty("truckTypeId")
    public void setTruckTypeId(String truckTypeId) {
        this.truckTypeId = truckTypeId;
    }

    public PageCommonStaticDetails withTruckTypeId(String truckTypeId) {
        this.truckTypeId = truckTypeId;
        return this;
    }

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    public PageCommonStaticDetails withVersion(String version) {
        this.version = version;
        return this;
    }

    @JsonProperty("bookingId")
    public String getBookingId() {
        return bookingId;
    }

    @JsonProperty("bookingId")
    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public PageCommonStaticDetails withBookingId(String bookingId) {
        this.bookingId = bookingId;
        return this;
    }

    @JsonProperty("airwayBillNo")
    public String getAirwayBillNo() {
        return airwayBillNo;
    }

    @JsonProperty("airwayBillNo")
    public void setAirwayBillNo(String airwayBillNo) {
        this.airwayBillNo = airwayBillNo;
    }

    public PageCommonStaticDetails withAirwayBillNo(String airwayBillNo) {
        this.airwayBillNo = airwayBillNo;
        return this;
    }

    @JsonProperty("totalWeight")
    public String getTotalWeight() {
        return totalWeight;
    }

    @JsonProperty("totalWeight")
    public void setTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
    }

    public PageCommonStaticDetails withTotalWeight(String totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    @JsonProperty("shipperInformation")
    public String getShipperInformation() {
        return shipperInformation;
    }

    @JsonProperty("shipperInformation")
    public void setShipperInformation(String shipperInformation) {
        this.shipperInformation = shipperInformation;
    }

    public PageCommonStaticDetails withShipperInformation(String shipperInformation) {
        this.shipperInformation = shipperInformation;
        return this;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    public PageCommonStaticDetails withTime(String time) {
        this.time = time;
        return this;
    }

    @JsonProperty("portOfLoading")
    public String getPortOfLoading() {
        return portOfLoading;
    }

    @JsonProperty("portOfLoading")
    public void setPortOfLoading(String portOfLoading) {
        this.portOfLoading = portOfLoading;
    }

    public PageCommonStaticDetails withPortOfLoading(String portOfLoading) {
        this.portOfLoading = portOfLoading;
        return this;
    }

    @JsonProperty("portOfDischargeWithCountry")
    public String getPortOfDischargeWithCountry() {
        return portOfDischargeWithCountry;
    }

    @JsonProperty("portOfDischargeWithCountry")
    public void setPortOfDischargeWithCountry(String portOfDischargeWithCountry) {
        this.portOfDischargeWithCountry = portOfDischargeWithCountry;
    }

    public PageCommonStaticDetails withPortOfDischargeWithCountry(String portOfDischargeWithCountry) {
        this.portOfDischargeWithCountry = portOfDischargeWithCountry;
        return this;
    }

    @JsonProperty("passengerAndCargo")
    public String getPassengerAndCargo() {
        return passengerAndCargo;
    }

    @JsonProperty("passengerAndCargo")
    public void setPassengerAndCargo(String passengerAndCargo) {
        this.passengerAndCargo = passengerAndCargo;
    }

    public PageCommonStaticDetails withPassengerAndCargo(String passengerAndCargo) {
        this.passengerAndCargo = passengerAndCargo;
        return this;
    }

    @JsonProperty("tareWeight")
    public String getTareWeight() {
        return tareWeight;
    }

    @JsonProperty("tareWeight")
    public void setTareWeight(String tareWeight) {
        this.tareWeight = tareWeight;
    }

    public PageCommonStaticDetails withTareWeight(String tareWeight) {
        this.tareWeight = tareWeight;
        return this;
    }

    @JsonProperty("currentDateAndTime")
    public String getCurrentDateAndTime() {
        return currentDateAndTime;
    }

    @JsonProperty("currentDateAndTime")
    public void setCurrentDateAndTime(String currentDateAndTime) {
        this.currentDateAndTime = currentDateAndTime;
    }

    public PageCommonStaticDetails withCurrentDateAndTime(String currentDateAndTime) {
        this.currentDateAndTime = currentDateAndTime;
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

    public PageCommonStaticDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("handlingInformation", handlingInformation).append("transportInformation", transportInformation).append("signature", signature).append("truckType", truckType).append("billOfLading", billOfLading).append("shipmentMetaDataShipperReferenceNumber", shipmentMetaDataShipperReferenceNumber).append("companyName", companyName).append("destination", destination).append("portOfDischarge", portOfDischarge).append("currentDate", currentDate).append("shipmentMetadataSealNo", shipmentMetadataSealNo).append("shipmentMetaDataCustPoNo", shipmentMetaDataCustPoNo).append("pageName", pageName).append("weightOfDunning", weightOfDunning).append("carrierName", carrierName).append("nameAndTitleOfSignature", nameAndTitleOfSignature).append("saidToContainDesc", saidToContainDesc).append("place", place).append("templateRefNo", templateRefNo).append("cargo", cargo).append("containerSize", containerSize).append("containerNumberDesc", containerNumberDesc).append("containerNoAndSealNo", containerNoAndSealNo).append("signForCarrierBasedDoc", signForCarrierBasedDoc).append("portOfSourceWithCountry", portOfSourceWithCountry).append("conatinerNameAndSize", conatinerNameAndSize).append("vesselAndVoyageNo", vesselAndVoyageNo).append("marinePollutant", marinePollutant).append("consigneeInformation", consigneeInformation).append("truckTypeId", truckTypeId).append("version", version).append("bookingId", bookingId).append("airwayBillNo", airwayBillNo).append("totalWeight", totalWeight).append("shipperInformation", shipperInformation).append("time", time).append("portOfLoading", portOfLoading).append("portOfDischargeWithCountry", portOfDischargeWithCountry).append("passengerAndCargo", passengerAndCargo).append("tareWeight", tareWeight).append("currentDateAndTime", currentDateAndTime).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(handlingInformation).append(transportInformation).append(signature).append(truckType).append(billOfLading).append(shipmentMetaDataShipperReferenceNumber).append(companyName).append(destination).append(portOfDischarge).append(currentDate).append(shipmentMetadataSealNo).append(shipmentMetaDataCustPoNo).append(pageName).append(weightOfDunning).append(carrierName).append(nameAndTitleOfSignature).append(saidToContainDesc).append(place).append(templateRefNo).append(cargo).append(containerSize).append(containerNumberDesc).append(containerNoAndSealNo).append(signForCarrierBasedDoc).append(portOfSourceWithCountry).append(conatinerNameAndSize).append(vesselAndVoyageNo).append(marinePollutant).append(consigneeInformation).append(truckTypeId).append(version).append(bookingId).append(airwayBillNo).append(totalWeight).append(shipperInformation).append(time).append(additionalProperties).append(portOfLoading).append(portOfDischargeWithCountry).append(passengerAndCargo).append(tareWeight).append(currentDateAndTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PageCommonStaticDetails) == false) {
            return false;
        }
        PageCommonStaticDetails rhs = ((PageCommonStaticDetails) other);
        return new EqualsBuilder().append(handlingInformation, rhs.handlingInformation).append(transportInformation, rhs.transportInformation).append(signature, rhs.signature).append(truckType, rhs.truckType).append(billOfLading, rhs.billOfLading).append(shipmentMetaDataShipperReferenceNumber, rhs.shipmentMetaDataShipperReferenceNumber).append(companyName, rhs.companyName).append(destination, rhs.destination).append(portOfDischarge, rhs.portOfDischarge).append(currentDate, rhs.currentDate).append(shipmentMetadataSealNo, rhs.shipmentMetadataSealNo).append(shipmentMetaDataCustPoNo, rhs.shipmentMetaDataCustPoNo).append(pageName, rhs.pageName).append(weightOfDunning, rhs.weightOfDunning).append(carrierName, rhs.carrierName).append(nameAndTitleOfSignature, rhs.nameAndTitleOfSignature).append(saidToContainDesc, rhs.saidToContainDesc).append(place, rhs.place).append(templateRefNo, rhs.templateRefNo).append(cargo, rhs.cargo).append(containerSize, rhs.containerSize).append(containerNumberDesc, rhs.containerNumberDesc).append(containerNoAndSealNo, rhs.containerNoAndSealNo).append(signForCarrierBasedDoc, rhs.signForCarrierBasedDoc).append(portOfSourceWithCountry, rhs.portOfSourceWithCountry).append(conatinerNameAndSize, rhs.conatinerNameAndSize).append(vesselAndVoyageNo, rhs.vesselAndVoyageNo).append(marinePollutant, rhs.marinePollutant).append(consigneeInformation, rhs.consigneeInformation).append(truckTypeId, rhs.truckTypeId).append(version, rhs.version).append(bookingId, rhs.bookingId).append(airwayBillNo, rhs.airwayBillNo).append(totalWeight, rhs.totalWeight).append(shipperInformation, rhs.shipperInformation).append(time, rhs.time).append(additionalProperties, rhs.additionalProperties).append(portOfLoading, rhs.portOfLoading).append(portOfDischargeWithCountry, rhs.portOfDischargeWithCountry).append(passengerAndCargo, rhs.passengerAndCargo).append(tareWeight, rhs.tareWeight).append(currentDateAndTime, rhs.currentDateAndTime).isEquals();
    }

}