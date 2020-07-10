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
        "userSignature",
        "lastName",
        "userLang",
        "userReportingTo",
        "phoneNum",
        "userSessionId",
        "userName",
        "userId",
        "userActiveStatus",
        "firstName",
        "userTitle",
        "userEmailId",
        "userDgMode",
        "userAccessSites",
        "userType",
        "userLoginTime",
        "dgCertDate"
})
public class UserInfoDetails implements Serializable
{

    @JsonProperty("userSignature")
    private String userSignature;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("userLang")
    private int userLang;
    @JsonProperty("userReportingTo")
    private int userReportingTo;
    @JsonProperty("phoneNum")
    private String phoneNum;
    @JsonProperty("userSessionId")
    private String userSessionId;
    @JsonProperty("userName")
    private String userName;
    @JsonProperty("userId")
    private String userId;
    @JsonProperty("userActiveStatus")
    private int userActiveStatus;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("userTitle")
    private String userTitle;
    @JsonProperty("userEmailId")
    private String userEmailId;
    @JsonProperty("userDgMode")
    private int userDgMode;
    @JsonProperty("userAccessSites")
    private List<Object> userAccessSites = new ArrayList<Object>();
    @JsonProperty("userType")
    private int userType;
    @JsonProperty("userLoginTime")
    private String userLoginTime;
    @JsonProperty("dgCertDate")
    private String dgCertDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5162813781434756686L;

    /**
     * No args constructor for use in serialization
     *
     */
    public UserInfoDetails() {
    }

    /**
     *
     * @param userSignature
     * @param lastName
     * @param userLang
     * @param userReportingTo
     * @param phoneNum
     * @param userSessionId
     * @param userName
     * @param userId
     * @param userActiveStatus
     * @param firstName
     * @param userTitle
     * @param userEmailId
     * @param userDgMode
     * @param userAccessSites
     * @param userType
     * @param userLoginTime
     * @param dgCertDate
     */
    public UserInfoDetails(String userSignature, String lastName, int userLang, int userReportingTo, String phoneNum, String userSessionId, String userName, String userId, int userActiveStatus, String firstName, String userTitle, String userEmailId, int userDgMode, List<Object> userAccessSites, int userType, String userLoginTime, String dgCertDate) {
        super();
        this.userSignature = userSignature;
        this.lastName = lastName;
        this.userLang = userLang;
        this.userReportingTo = userReportingTo;
        this.phoneNum = phoneNum;
        this.userSessionId = userSessionId;
        this.userName = userName;
        this.userId = userId;
        this.userActiveStatus = userActiveStatus;
        this.firstName = firstName;
        this.userTitle = userTitle;
        this.userEmailId = userEmailId;
        this.userDgMode = userDgMode;
        this.userAccessSites = userAccessSites;
        this.userType = userType;
        this.userLoginTime = userLoginTime;
        this.dgCertDate = dgCertDate;
    }

    @JsonProperty("userSignature")
    public String getUserSignature() {
        return userSignature;
    }

    @JsonProperty("userSignature")
    public void setUserSignature(String userSignature) {
        this.userSignature = userSignature;
    }

    public UserInfoDetails withUserSignature(String userSignature) {
        this.userSignature = userSignature;
        return this;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserInfoDetails withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @JsonProperty("userLang")
    public int getUserLang() {
        return userLang;
    }

    @JsonProperty("userLang")
    public void setUserLang(int userLang) {
        this.userLang = userLang;
    }

    public UserInfoDetails withUserLang(int userLang) {
        this.userLang = userLang;
        return this;
    }

    @JsonProperty("userReportingTo")
    public int getUserReportingTo() {
        return userReportingTo;
    }

    @JsonProperty("userReportingTo")
    public void setUserReportingTo(int userReportingTo) {
        this.userReportingTo = userReportingTo;
    }

    public UserInfoDetails withUserReportingTo(int userReportingTo) {
        this.userReportingTo = userReportingTo;
        return this;
    }

    @JsonProperty("phoneNum")
    public String getPhoneNum() {
        return phoneNum;
    }

    @JsonProperty("phoneNum")
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public UserInfoDetails withPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
        return this;
    }

    @JsonProperty("userSessionId")
    public String getUserSessionId() {
        return userSessionId;
    }

    @JsonProperty("userSessionId")
    public void setUserSessionId(String userSessionId) {
        this.userSessionId = userSessionId;
    }

    public UserInfoDetails withUserSessionId(String userSessionId) {
        this.userSessionId = userSessionId;
        return this;
    }

    @JsonProperty("userName")
    public String getUserName() {
        return userName;
    }

    @JsonProperty("userName")
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserInfoDetails withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserInfoDetails withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("userActiveStatus")
    public int getUserActiveStatus() {
        return userActiveStatus;
    }

    @JsonProperty("userActiveStatus")
    public void setUserActiveStatus(int userActiveStatus) {
        this.userActiveStatus = userActiveStatus;
    }

    public UserInfoDetails withUserActiveStatus(int userActiveStatus) {
        this.userActiveStatus = userActiveStatus;
        return this;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserInfoDetails withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @JsonProperty("userTitle")
    public String getUserTitle() {
        return userTitle;
    }

    @JsonProperty("userTitle")
    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public UserInfoDetails withUserTitle(String userTitle) {
        this.userTitle = userTitle;
        return this;
    }

    @JsonProperty("userEmailId")
    public String getUserEmailId() {
        return userEmailId;
    }

    @JsonProperty("userEmailId")
    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public UserInfoDetails withUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
        return this;
    }

    @JsonProperty("userDgMode")
    public int getUserDgMode() {
        return userDgMode;
    }

    @JsonProperty("userDgMode")
    public void setUserDgMode(int userDgMode) {
        this.userDgMode = userDgMode;
    }

    public UserInfoDetails withUserDgMode(int userDgMode) {
        this.userDgMode = userDgMode;
        return this;
    }

    @JsonProperty("userAccessSites")
    public List<Object> getUserAccessSites() {
        return userAccessSites;
    }

    @JsonProperty("userAccessSites")
    public void setUserAccessSites(List<Object> userAccessSites) {
        this.userAccessSites = userAccessSites;
    }

    public UserInfoDetails withUserAccessSites(List<Object> userAccessSites) {
        this.userAccessSites = userAccessSites;
        return this;
    }

    @JsonProperty("userType")
    public int getUserType() {
        return userType;
    }

    @JsonProperty("userType")
    public void setUserType(int userType) {
        this.userType = userType;
    }

    public UserInfoDetails withUserType(int userType) {
        this.userType = userType;
        return this;
    }

    @JsonProperty("userLoginTime")
    public String getUserLoginTime() {
        return userLoginTime;
    }

    @JsonProperty("userLoginTime")
    public void setUserLoginTime(String userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

    public UserInfoDetails withUserLoginTime(String userLoginTime) {
        this.userLoginTime = userLoginTime;
        return this;
    }

    @JsonProperty("dgCertDate")
    public String getDgCertDate() {
        return dgCertDate;
    }

    @JsonProperty("dgCertDate")
    public void setDgCertDate(String dgCertDate) {
        this.dgCertDate = dgCertDate;
    }

    public UserInfoDetails withDgCertDate(String dgCertDate) {
        this.dgCertDate = dgCertDate;
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

    public UserInfoDetails withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("userSignature", userSignature).append("lastName", lastName).append("userLang", userLang).append("userReportingTo", userReportingTo).append("phoneNum", phoneNum).append("userSessionId", userSessionId).append("userName", userName).append("userId", userId).append("userActiveStatus", userActiveStatus).append("firstName", firstName).append("userTitle", userTitle).append("userEmailId", userEmailId).append("userDgMode", userDgMode).append("userAccessSites", userAccessSites).append("userType", userType).append("userLoginTime", userLoginTime).append("dgCertDate", dgCertDate).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(userSignature).append(lastName).append(userLang).append(userReportingTo).append(phoneNum).append(userSessionId).append(userName).append(userId).append(userActiveStatus).append(firstName).append(userTitle).append(userEmailId).append(userDgMode).append(userAccessSites).append(userType).append(additionalProperties).append(userLoginTime).append(dgCertDate).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserInfoDetails) == false) {
            return false;
        }
        UserInfoDetails rhs = ((UserInfoDetails) other);
        return new EqualsBuilder().append(userSignature, rhs.userSignature).append(lastName, rhs.lastName).append(userLang, rhs.userLang).append(userReportingTo, rhs.userReportingTo).append(phoneNum, rhs.phoneNum).append(userSessionId, rhs.userSessionId).append(userName, rhs.userName).append(userId, rhs.userId).append(userActiveStatus, rhs.userActiveStatus).append(firstName, rhs.firstName).append(userTitle, rhs.userTitle).append(userEmailId, rhs.userEmailId).append(userDgMode, rhs.userDgMode).append(userAccessSites, rhs.userAccessSites).append(userType, rhs.userType).append(additionalProperties, rhs.additionalProperties).append(userLoginTime, rhs.userLoginTime).append(dgCertDate, rhs.dgCertDate).isEquals();
    }

}