package ru.sv.rgBotBack.parse.plainPOJO;
public class TyreSetPOJO {
    //Purchase Date
    private String purchaseDate;
    //Tyre Set Name
    private String tyreSetName;
    //Tyre Set ID
    //@Id
    private String tyreSetID;
    //Record Type
    private String recordType;
    //Purchase Country
    private String purchaseCountry;
    //Country Code
    private String countryCode;
    //Number of Tyres
    private String numberOfTyres;
    //Size Code
    private String sizeCode;
    //Point of Sale: Account Name
    private String pointOfSaleAccountName;
    //Account ID
    private String accountID;
    //Point of Sale: Account ID 18 digits
    private String pointOfSaleAccountID18Digits;
    //Point of Sale: Company Site Code
    private String pointOfSaleCompanySiteCode;
    //Service Entry ID
    private String serviceEntryID;
    //Service Entry Id 18d
    private String serviceEntryId18d;
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
    //Created Date
    private String createdDate;

    public TyreSetPOJO() {
    }

    public TyreSetPOJO(String purchaseDate, String tyreSetName, String tyreSetID, String recordType, String purchaseCountry, String countryCode, String numberOfTyres, String sizeCode, String pointOfSaleAccountName, String accountID, String pointOfSaleAccountID18Digits, String pointOfSaleCompanySiteCode, String serviceEntryID, String serviceEntryId18d, String ownerAccountName, String ownerAccountID18Digits, String ownerPersonAccountMobile, String productProductName, String productProductCode, String carVehicleName, String carVehicleID, String createdByFullName, String createdByFullNameSFID, String lastModifiedDate, String lastModifiedByFullName, String lastModifiedByFullNameSFID, String createdDate) {
        this.purchaseDate = purchaseDate;
        this.tyreSetName = tyreSetName;
        this.tyreSetID = tyreSetID;
        this.recordType = recordType;
        this.purchaseCountry = purchaseCountry;
        this.countryCode = countryCode;
        this.numberOfTyres = numberOfTyres;
        this.sizeCode = sizeCode;
        this.pointOfSaleAccountName = pointOfSaleAccountName;
        this.accountID = accountID;
        this.pointOfSaleAccountID18Digits = pointOfSaleAccountID18Digits;
        this.pointOfSaleCompanySiteCode = pointOfSaleCompanySiteCode;
        this.serviceEntryID = serviceEntryID;
        this.serviceEntryId18d = serviceEntryId18d;
        this.ownerAccountName = ownerAccountName;
        this.ownerAccountID18Digits = ownerAccountID18Digits;
        this.ownerPersonAccountMobile = ownerPersonAccountMobile;
        this.productProductName = productProductName;
        this.productProductCode = productProductCode;
        this.carVehicleName = carVehicleName;
        this.carVehicleID = carVehicleID;
        this.createdByFullName = createdByFullName;
        this.createdByFullNameSFID = createdByFullNameSFID;
        this.lastModifiedDate = lastModifiedDate;
        this.lastModifiedByFullName = lastModifiedByFullName;
        this.lastModifiedByFullNameSFID = lastModifiedByFullNameSFID;
        this.createdDate = createdDate;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
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

    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public String getPurchaseCountry() {
        return purchaseCountry;
    }

    public void setPurchaseCountry(String purchaseCountry) {
        this.purchaseCountry = purchaseCountry;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumberOfTyres() {
        return numberOfTyres;
    }

    public void setNumberOfTyres(String numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    public String getSizeCode() {
        return sizeCode;
    }

    public void setSizeCode(String sizeCode) {
        this.sizeCode = sizeCode;
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

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "TyreSetPOJO{" +
                "purchaseDate='" + purchaseDate + '\'' +
                ", tyreSetName='" + tyreSetName + '\'' +
                ", tyreSetID='" + tyreSetID + '\'' +
                ", recordType='" + recordType + '\'' +
                ", purchaseCountry='" + purchaseCountry + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", numberOfTyres='" + numberOfTyres + '\'' +
                ", sizeCode='" + sizeCode + '\'' +
                ", pointOfSaleAccountName='" + pointOfSaleAccountName + '\'' +
                ", accountID='" + accountID + '\'' +
                ", pointOfSaleAccountID18Digits='" + pointOfSaleAccountID18Digits + '\'' +
                ", pointOfSaleCompanySiteCode='" + pointOfSaleCompanySiteCode + '\'' +
                ", serviceEntryID='" + serviceEntryID + '\'' +
                ", serviceEntryId18d='" + serviceEntryId18d + '\'' +
                ", ownerAccountName='" + ownerAccountName + '\'' +
                ", ownerAccountID18Digits='" + ownerAccountID18Digits + '\'' +
                ", ownerPersonAccountMobile='" + ownerPersonAccountMobile + '\'' +
                ", productProductName='" + productProductName + '\'' +
                ", productProductCode='" + productProductCode + '\'' +
                ", carVehicleName='" + carVehicleName + '\'' +
                ", carVehicleID='" + carVehicleID + '\'' +
                ", createdByFullName='" + createdByFullName + '\'' +
                ", createdByFullNameSFID='" + createdByFullNameSFID + '\'' +
                ", lastModifiedDate='" + lastModifiedDate + '\'' +
                ", lastModifiedByFullName='" + lastModifiedByFullName + '\'' +
                ", lastModifiedByFullNameSFID='" + lastModifiedByFullNameSFID + '\'' +
                ", createdDate='" + createdDate + '\'' +
                '}';
    }
}
