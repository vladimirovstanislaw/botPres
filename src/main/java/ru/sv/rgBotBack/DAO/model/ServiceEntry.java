package ru.sv.rgBotBack.DAO.model;

import jakarta.persistence.*;
import ru.sv.rgBotBack.parse.parsers.ParserUtils;
import ru.sv.rgBotBack.parse.plainPOJO.ServiceEntryPOJO;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "serviceEntry")
public class ServiceEntry implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Service Entry Id 18d
    //@Id
    @Column(name = "serviceEntryId18d")
    private String serviceEntryId18d;

    //Record Type
    @Column(name = "recordType")
    private String recordType;

    //Campaign: Campaign Name
    @Column(name = "campaignCampaignName")
    private String campaignCampaignName;

    //Campaign: Campaign ID
    @Column(name = "campaignCampaignID")
    private String campaignCampaignID;

    //Service Entry ID
    @Column(name = "serviceEntryID")
    private String serviceEntryID;

    //Created Date
    @Column(name = "createdDate")
    private Date createdDate;

    //Created By: Full Name
    @Column(name = "createdByFullName")
    private String createdByFullName;

    //Created By: Full Name SF ID
    @Column(name = "createdByFullNameSFID")
    private String createdByFullNameSFID;

    //Last Modified Date
    @Column(name = "lastModifiedDate")
    private Date lastModifiedDate;

    //Last Modified By: Full Name
    @Column(name = "lastModifiedByFullName")
    private String lastModifiedByFullName;

    //Last Modified By: Full Name SF ID
    @Column(name = "lastModifiedByFullNameSFID")
    private String lastModifiedByFullNameSFID;

    //Valid from
    @Column(name = "validFrom")
    private Date validFrom;

    //Valid to
    @Column(name = "validTo")
    private Date validTo;

    //Tyre model
    @Column(name = "tyreModel")
    private String tyreModel;

    //Issue Country
    @Column(name = "issueCountry")
    private String issueCountry;

    //Country Code
    @Column(name = "countryCode")
    private String countryCode;

    //Status
    @Column(name = "status")
    private String status;

    //Service Code
    @Column(name = "serviceCode")
    private String serviceCode;

    //External Service ID
    @Column(name = "externalServiceID")
    private String externalServiceID;

    //Created at
    @Column(name = "createdAt")
    private Date createdAt;

    //Point of Sale: Account Name
    @Column(name = "pointOfSaleAccountName")
    private String pointOfSaleAccountName;

    //Account ID
    @Column(name = "accountID")
    private String accountID;

    //Point of Sale: Account ID 18 digits
    @Column(name = "pointOfSaleAccountID18Digits")
    private String pointOfSaleAccountID18Digits;

    //Point of Sale: Company Site Code
    @Column(name = "pointOfSaleCompanySiteCode")
    private String pointOfSaleCompanySiteCode;

    //Tyre Set Name
    @Column(name = "tyreSetName")
    private String tyreSetName;

    //Tyre Set ID
    @Column(name = "tyreSetID")
    private String tyreSetID;

    //Owner: Account Name
    @Column(name = "ownerAccountName")
    private String ownerAccountName;

    //Owner: Account ID 18 digits
    @Column(name = "ownerAccountID18Digits")
    private String ownerAccountID18Digits;

    //Owner: Person Account: Mobile
    @Column(name = "ownerPersonAccountMobile")
    private String ownerPersonAccountMobile;

    //Product: Product Name
    @Column(name = "productProductName")
    private String productProductName;

    //Product: Product Code
    @Column(name = "productProductCode")
    private String productProductCode;

    //Car: Vehicle Name
    @Column(name = "carVehicleName")
    private String carVehicleName;

    //Car: Vehicle ID
    @Column(name = "carVehicleID")
    private String carVehicleID;

    //Car: License Plate Number
    @Column(name = "carLicensePlateNumber")
    private String carLicensePlateNumber;

    //Owner: Owner ID
    @Column(name = "ownerOwnerID")
    private String ownerOwnerID;

    //Date of Issue
    @Column(name = "dateOfIssue")
    private Date dateOfIssue;

    public ServiceEntry() {
    }

    public ServiceEntry(ServiceEntryPOJO serviceEntryPOJO) {
        this.serviceEntryId18d = serviceEntryPOJO.getServiceEntryId18d();
        this.recordType = serviceEntryPOJO.getRecordType();
        this.campaignCampaignName = serviceEntryPOJO.getCampaignCampaignName();
        this.campaignCampaignID = serviceEntryPOJO.getCampaignCampaignID();
        this.serviceEntryID = serviceEntryPOJO.getServiceEntryID();
        this.createdDate = ParserUtils.makeJavaDate(serviceEntryPOJO.getCreatedDate());
        this.createdByFullName = serviceEntryPOJO.getCreatedByFullName();
        this.createdByFullNameSFID = serviceEntryPOJO.getCreatedByFullNameSFID();
        this.lastModifiedDate = ParserUtils.makeJavaDate(serviceEntryPOJO.getLastModifiedDate());
        this.lastModifiedByFullName = serviceEntryPOJO.getLastModifiedByFullName();
        this.lastModifiedByFullNameSFID = serviceEntryPOJO.getLastModifiedByFullNameSFID();
        this.validFrom = ParserUtils.makeJavaDate(serviceEntryPOJO.getValidFrom());
        this.validTo = ParserUtils.makeJavaDate(serviceEntryPOJO.getValidTo());
        this.tyreModel = serviceEntryPOJO.getTyreModel();
        this.issueCountry = serviceEntryPOJO.getIssueCountry();
        this.countryCode = serviceEntryPOJO.getCountryCode();
        this.status = serviceEntryPOJO.getStatus();
        this.serviceCode = serviceEntryPOJO.getServiceCode();
        this.externalServiceID = serviceEntryPOJO.getExternalServiceID();
        this.createdAt = ParserUtils.makeJavaDate(serviceEntryPOJO.getCreatedAt());
        this.pointOfSaleAccountName = serviceEntryPOJO.getPointOfSaleAccountName();
        this.accountID = serviceEntryPOJO.getAccountID();
        this.pointOfSaleAccountID18Digits = serviceEntryPOJO.getPointOfSaleAccountID18Digits();
        this.pointOfSaleCompanySiteCode = serviceEntryPOJO.getPointOfSaleCompanySiteCode();
        this.tyreSetName = serviceEntryPOJO.getTyreSetName();
        this.tyreSetID = serviceEntryPOJO.getTyreSetID();
        this.ownerAccountName = serviceEntryPOJO.getOwnerAccountName();
        this.ownerAccountID18Digits = serviceEntryPOJO.getOwnerAccountID18Digits();
        this.ownerPersonAccountMobile = serviceEntryPOJO.getOwnerPersonAccountMobile();
        this.productProductName = serviceEntryPOJO.getProductProductName();
        this.productProductCode = serviceEntryPOJO.getProductProductCode();
        this.carVehicleName = serviceEntryPOJO.getCarVehicleName();
        this.carVehicleID = serviceEntryPOJO.getCarVehicleID();
        this.carLicensePlateNumber = serviceEntryPOJO.getCarLicensePlateNumber();
        this.ownerOwnerID = serviceEntryPOJO.getOwnerOwnerID();
        this.dateOfIssue = ParserUtils.makeJavaDate(serviceEntryPOJO.getDateOfIssue());
    }

    public ServiceEntry(long id, String serviceEntryId18d, String recordType, String campaignCampaignName, String campaignCampaignID, String serviceEntryID, Date createdDate, String createdByFullName, String createdByFullNameSFID, Date lastModifiedDate, String lastModifiedByFullName, String lastModifiedByFullNameSFID, Date validFrom, Date validTo, String tyreModel, String issueCountry, String countryCode, String status, String serviceCode, String externalServiceID, Date createdAt, String pointOfSaleAccountName, String accountID, String pointOfSaleAccountID18Digits, String pointOfSaleCompanySiteCode, String tyreSetName, String tyreSetID, String ownerAccountName, String ownerAccountID18Digits, String ownerPersonAccountMobile, String productProductName, String productProductCode, String carVehicleName, String carVehicleID, String carLicensePlateNumber, String ownerOwnerID, Date dateOfIssue) {
        this.id = id;
        this.serviceEntryId18d = serviceEntryId18d;
        this.recordType = recordType;
        this.campaignCampaignName = campaignCampaignName;
        this.campaignCampaignID = campaignCampaignID;
        this.serviceEntryID = serviceEntryID;
        this.createdDate = createdDate;
        this.createdByFullName = createdByFullName;
        this.createdByFullNameSFID = createdByFullNameSFID;
        this.lastModifiedDate = lastModifiedDate;
        this.lastModifiedByFullName = lastModifiedByFullName;
        this.lastModifiedByFullNameSFID = lastModifiedByFullNameSFID;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.tyreModel = tyreModel;
        this.issueCountry = issueCountry;
        this.countryCode = countryCode;
        this.status = status;
        this.serviceCode = serviceCode;
        this.externalServiceID = externalServiceID;
        this.createdAt = createdAt;
        this.pointOfSaleAccountName = pointOfSaleAccountName;
        this.accountID = accountID;
        this.pointOfSaleAccountID18Digits = pointOfSaleAccountID18Digits;
        this.pointOfSaleCompanySiteCode = pointOfSaleCompanySiteCode;
        this.tyreSetName = tyreSetName;
        this.tyreSetID = tyreSetID;
        this.ownerAccountName = ownerAccountName;
        this.ownerAccountID18Digits = ownerAccountID18Digits;
        this.ownerPersonAccountMobile = ownerPersonAccountMobile;
        this.productProductName = productProductName;
        this.productProductCode = productProductCode;
        this.carVehicleName = carVehicleName;
        this.carVehicleID = carVehicleID;
        this.carLicensePlateNumber = carLicensePlateNumber;
        this.ownerOwnerID = ownerOwnerID;
        this.dateOfIssue = dateOfIssue;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getServiceEntryId18d() {
        return serviceEntryId18d;
    }

    public void setServiceEntryId18d(String serviceEntryId18d) {
        this.serviceEntryId18d = serviceEntryId18d;
    }

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getCampaignCampaignName() {
        return campaignCampaignName;
    }

    public void setCampaignCampaignName(String campaignCampaignName) {
        this.campaignCampaignName = campaignCampaignName;
    }

    public String getCampaignCampaignID() {
        return campaignCampaignID;
    }

    public void setCampaignCampaignID(String campaignCampaignID) {
        this.campaignCampaignID = campaignCampaignID;
    }

    public String getServiceEntryID() {
        return serviceEntryID;
    }

    public void setServiceEntryID(String serviceEntryID) {
        this.serviceEntryID = serviceEntryID;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedByFullName() {
        return createdByFullName;
    }

    public void setCreatedByFullName(String createdByFullName) {
        this.createdByFullName = createdByFullName;
    }

    public String getCreatedByFullNameSFID() {
        return createdByFullNameSFID;
    }

    public void setCreatedByFullNameSFID(String createdByFullNameSFID) {
        this.createdByFullNameSFID = createdByFullNameSFID;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedByFullName() {
        return lastModifiedByFullName;
    }

    public void setLastModifiedByFullName(String lastModifiedByFullName) {
        this.lastModifiedByFullName = lastModifiedByFullName;
    }

    public String getLastModifiedByFullNameSFID() {
        return lastModifiedByFullNameSFID;
    }

    public void setLastModifiedByFullNameSFID(String lastModifiedByFullNameSFID) {
        this.lastModifiedByFullNameSFID = lastModifiedByFullNameSFID;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public String getTyreModel() {
        return tyreModel;
    }

    public void setTyreModel(String tyreModel) {
        this.tyreModel = tyreModel;
    }

    public String getIssueCountry() {
        return issueCountry;
    }

    public void setIssueCountry(String issueCountry) {
        this.issueCountry = issueCountry;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getExternalServiceID() {
        return externalServiceID;
    }

    public void setExternalServiceID(String externalServiceID) {
        this.externalServiceID = externalServiceID;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getPointOfSaleAccountName() {
        return pointOfSaleAccountName;
    }

    public void setPointOfSaleAccountName(String pointOfSaleAccountName) {
        this.pointOfSaleAccountName = pointOfSaleAccountName;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getPointOfSaleAccountID18Digits() {
        return pointOfSaleAccountID18Digits;
    }

    public void setPointOfSaleAccountID18Digits(String pointOfSaleAccountID18Digits) {
        this.pointOfSaleAccountID18Digits = pointOfSaleAccountID18Digits;
    }

    public String getPointOfSaleCompanySiteCode() {
        return pointOfSaleCompanySiteCode;
    }

    public void setPointOfSaleCompanySiteCode(String pointOfSaleCompanySiteCode) {
        this.pointOfSaleCompanySiteCode = pointOfSaleCompanySiteCode;
    }

    public String getTyreSetName() {
        return tyreSetName;
    }

    public void setTyreSetName(String tyreSetName) {
        this.tyreSetName = tyreSetName;
    }

    public String getTyreSetID() {
        return tyreSetID;
    }

    public void setTyreSetID(String tyreSetID) {
        this.tyreSetID = tyreSetID;
    }

    public String getOwnerAccountName() {
        return ownerAccountName;
    }

    public void setOwnerAccountName(String ownerAccountName) {
        this.ownerAccountName = ownerAccountName;
    }

    public String getOwnerAccountID18Digits() {
        return ownerAccountID18Digits;
    }

    public void setOwnerAccountID18Digits(String ownerAccountID18Digits) {
        this.ownerAccountID18Digits = ownerAccountID18Digits;
    }

    public String getOwnerPersonAccountMobile() {
        return ownerPersonAccountMobile;
    }

    public void setOwnerPersonAccountMobile(String ownerPersonAccountMobile) {
        this.ownerPersonAccountMobile = ownerPersonAccountMobile;
    }

    public String getProductProductName() {
        return productProductName;
    }

    public void setProductProductName(String productProductName) {
        this.productProductName = productProductName;
    }

    public String getProductProductCode() {
        return productProductCode;
    }

    public void setProductProductCode(String productProductCode) {
        this.productProductCode = productProductCode;
    }

    public String getCarVehicleName() {
        return carVehicleName;
    }

    public void setCarVehicleName(String carVehicleName) {
        this.carVehicleName = carVehicleName;
    }

    public String getCarVehicleID() {
        return carVehicleID;
    }

    public void setCarVehicleID(String carVehicleID) {
        this.carVehicleID = carVehicleID;
    }

    public String getCarLicensePlateNumber() {
        return carLicensePlateNumber;
    }

    public void setCarLicensePlateNumber(String carLicensePlateNumber) {
        this.carLicensePlateNumber = carLicensePlateNumber;
    }

    public String getOwnerOwnerID() {
        return ownerOwnerID;
    }

    public void setOwnerOwnerID(String ownerOwnerID) {
        this.ownerOwnerID = ownerOwnerID;
    }

    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    @Override
    public String toString() {
        return "\n\t\t\t\t\t\t\t<i>ID:</i> \t" + serviceEntryId18d +
                "\n\t\t\t\t\t\t\t<i>ShortID:</i> \t" + serviceEntryID +
                "\n\t\t\t\t\t\t\t<i>Status:</i> \t" + status +
                "\n\t\t\t\t\t\t\t<i>Record type:</i> \t" + recordType +
                "\n\t\t\t\t\t\t\t<i>Campaign name:</i> \t" + campaignCampaignName +
                "\n\t\t\t\t\t\t\t<i>Created date:</i> \t" + ParserUtils.getPlainDate(createdDate) +
                "\n\t\t\t\t\t\t\t<i>Last modified date:</i> \t" + ParserUtils.getPlainDate(lastModifiedDate) +
                "\n\t\t\t\t\t\t\t<i>Valid from:</i> \t" + ParserUtils.getPlainDate(validFrom) +
                "\n\t\t\t\t\t\t\t<i>Valid to:</i> \t" + ParserUtils.getPlainDate(validTo) +
                "\n\t\t\t\t\t\t\t<i>Tyre model:</i> \t" + tyreModel +
                "\n\t\t\t\t\t\t\t<i>Point of sale account name:</i> \t" + pointOfSaleAccountName +
                "\n\t\t\t\t\t\t\t<i>Point of sale account name 2:</i> \t" + pointOfSaleCompanySiteCode +
                "\n\t\t\t\t\t\t\t<i>Owner name:</i> \t" + ownerAccountName +
                "\n\t\t\t\t\t\t\t<i>Owner mobile:</i> \t" + ownerPersonAccountMobile
                ;
    }
}
