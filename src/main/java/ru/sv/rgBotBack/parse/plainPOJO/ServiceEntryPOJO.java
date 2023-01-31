package ru.sv.rgBotBack.parse.plainPOJO;
public class ServiceEntryPOJO {
    //Record Type
    private String recordType;
    //Campaign: Campaign Name
    private String campaignCampaignName;
    //Campaign: Campaign ID
    private String campaignCampaignID;
    //Service Entry ID
    private String serviceEntryID;
    //Service Entry Id 18d
    //@Id
    private String serviceEntryId18d;
    //Created Date
    private String createdDate;
    //Created By: Full Name
    private String createdByFullName;
    //Created By: Full Name SF ID
    private String createdByFullNameSFID;
    //Last Modified Date
    private String lastModifiedDate;
    //Last Modified By: Full Name
    private String lastModifiedByFullName;
    //Last Modified By: Full Name SF ID
    private String lastModifiedByFullNameSFID;
    //Valid from
    private String validFrom;
    //Valid to
    private String validTo;
    //Tyre model
    private String tyreModel;
    //Issue Country
    private String issueCountry;
    //Country Code
    private String countryCode;
    //Status
    private String status;
    //Service Code
    private String serviceCode;
    //External Service ID
    private String externalServiceID;
    //Created at
    private String createdAt;
    //Point of Sale: Account Name
    private String pointOfSaleAccountName;
    //Account ID
    private String accountID;
    //Point of Sale: Account ID 18 digits
    private String pointOfSaleAccountID18Digits;
    //Point of Sale: Company Site Code
    private String pointOfSaleCompanySiteCode;
    //Tyre Set Name
    private String tyreSetName;
    //Tyre Set ID
    private String tyreSetID;
    //Owner: Account Name
    private String ownerAccountName;
    //Owner: Account ID 18 digits
    private String ownerAccountID18Digits;
    //Owner: Person Account: Mobile
    private String ownerPersonAccountMobile;
    //Product: Product Name
    private String productProductName;
    //Product: Product Code
    private String productProductCode;
    //Car: Vehicle Name
    private String carVehicleName;
    //Car: Vehicle ID
    private String carVehicleID;
    //Car: License Plate Number
    private String carLicensePlateNumber;
    //Owner: Owner ID
    private String ownerOwnerID;
    //Date of Issue
    private String dateOfIssue;

    public ServiceEntryPOJO() {
    }

    public ServiceEntryPOJO(String recordType, String campaignCampaignName, String campaignCampaignID, String serviceEntryID, String serviceEntryId18d, String createdDate, String createdByFullName, String createdByFullNameSFID, String lastModifiedDate, String lastModifiedByFullName, String lastModifiedByFullNameSFID, String validFrom, String validTo, String tyreModel, String issueCountry, String countryCode, String status, String serviceCode, String externalServiceID, String createdAt, String pointOfSaleAccountName, String accountID, String pointOfSaleAccountID18Digits, String pointOfSaleCompanySiteCode, String tyreSetName, String tyreSetID, String ownerAccountName, String ownerAccountID18Digits, String ownerPersonAccountMobile, String productProductName, String productProductCode, String carVehicleName, String carVehicleID, String carLicensePlateNumber, String ownerOwnerID, String dateOfIssue) {
        this.recordType = recordType;
        this.campaignCampaignName = campaignCampaignName;
        this.campaignCampaignID = campaignCampaignID;
        this.serviceEntryID = serviceEntryID;
        this.serviceEntryId18d = serviceEntryId18d;
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

    public String getServiceEntryId18d() {
        return serviceEntryId18d;
    }

    public void setServiceEntryId18d(String serviceEntryId18d) {
        this.serviceEntryId18d = serviceEntryId18d;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
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

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
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

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
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

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    @Override
    public String toString() {
        return "ServiceEntryPOJO{" +
                "recordType='" + recordType + '\'' +
                ", campaignCampaignName='" + campaignCampaignName + '\'' +
                ", campaignCampaignID='" + campaignCampaignID + '\'' +
                ", serviceEntryID='" + serviceEntryID + '\'' +
                ", serviceEntryId18d='" + serviceEntryId18d + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", createdByFullName='" + createdByFullName + '\'' +
                ", createdByFullNameSFID='" + createdByFullNameSFID + '\'' +
                ", lastModifiedDate='" + lastModifiedDate + '\'' +
                ", lastModifiedByFullName='" + lastModifiedByFullName + '\'' +
                ", lastModifiedByFullNameSFID='" + lastModifiedByFullNameSFID + '\'' +
                ", validFrom='" + validFrom + '\'' +
                ", validTo='" + validTo + '\'' +
                ", tyreModel='" + tyreModel + '\'' +
                ", issueCountry='" + issueCountry + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", status='" + status + '\'' +
                ", serviceCode='" + serviceCode + '\'' +
                ", externalServiceID='" + externalServiceID + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", pointOfSaleAccountName='" + pointOfSaleAccountName + '\'' +
                ", accountID='" + accountID + '\'' +
                ", pointOfSaleAccountID18Digits='" + pointOfSaleAccountID18Digits + '\'' +
                ", pointOfSaleCompanySiteCode='" + pointOfSaleCompanySiteCode + '\'' +
                ", tyreSetName='" + tyreSetName + '\'' +
                ", tyreSetID='" + tyreSetID + '\'' +
                ", ownerAccountName='" + ownerAccountName + '\'' +
                ", ownerAccountID18Digits='" + ownerAccountID18Digits + '\'' +
                ", ownerPersonAccountMobile='" + ownerPersonAccountMobile + '\'' +
                ", productProductName='" + productProductName + '\'' +
                ", productProductCode='" + productProductCode + '\'' +
                ", carVehicleName='" + carVehicleName + '\'' +
                ", carVehicleID='" + carVehicleID + '\'' +
                ", carLicensePlateNumber='" + carLicensePlateNumber + '\'' +
                ", ownerOwnerID='" + ownerOwnerID + '\'' +
                ", dateOfIssue='" + dateOfIssue + '\'' +
                '}';
    }
}
