package ru.sv.rgBotBack.parse.plainPOJO;
public class TyrePOJO {
    //Tyre Set Name :A
    private String tyreName;
    //Record Type :B
    private String recordTypeTyre;
    //Tyre Set ID :C
    //@Id
    private String tyreID;
    //Tyre Set Name :D
    private String tyreSetName;
    //Tyre Set ID :E
    private String tyreSetID;
    //Record Type :F
    private String tyreSetRecordType;
    //Parent number of tyres
    private String parentNumberOfTyres;
    //Owner: Account Name
    private String ownerAccountName;
    //Tyre Status
    private String tyreStatus;
    //Serial number
    private String serialNumber;
    //Factory code
    private String factoryCode;
    //Size Code
    private String sizeCode;
    //Manufactured week
    private String manufacturedWeek;
    //Manufactured Year
    private String manufacturedYear;
    //Created By: Full Name
    private String createdByFullName;
    //Created By: Full Name SF ID
    private String createdByFullNameSFID;
    //Last Modified By: Full Name
    private String lastModifiedByFullName;
    //Last Modified By: Full Name SF ID
    private String lastModifiedByFullNameSFID;
    //Last Modified Date
    private String lastModifiedDate;
    //Owner: Account ID
    private String ownerAccountID;
    //Owner: Account ID 18 digits
    private String ownerAccountID18Digits;
    //Created Date
    private String createdDate;

    public TyrePOJO() {
    }

    public TyrePOJO(String tyreName, String recordTypeTyre, String tyreID, String tyreSetName, String tyreSetID, String tyreSetRecordType, String parentNumberOfTyres, String ownerAccountName, String tyreStatus, String serialNumber, String factoryCode, String sizeCode, String manufacturedWeek, String manufacturedYear, String createdByFullName, String createdByFullNameSFID, String lastModifiedByFullName, String lastModifiedByFullNameSFID, String lastModifiedDate, String ownerAccountID, String ownerAccountID18Digits, String createdDate) {
        this.tyreName = tyreName;
        this.recordTypeTyre = recordTypeTyre;
        this.tyreID = tyreID;
        this.tyreSetName = tyreSetName;
        this.tyreSetID = tyreSetID;
        this.tyreSetRecordType = tyreSetRecordType;
        this.parentNumberOfTyres = parentNumberOfTyres;
        this.ownerAccountName = ownerAccountName;
        this.tyreStatus = tyreStatus;
        this.serialNumber = serialNumber;
        this.factoryCode = factoryCode;
        this.sizeCode = sizeCode;
        this.manufacturedWeek = manufacturedWeek;
        this.manufacturedYear = manufacturedYear;
        this.createdByFullName = createdByFullName;
        this.createdByFullNameSFID = createdByFullNameSFID;
        this.lastModifiedByFullName = lastModifiedByFullName;
        this.lastModifiedByFullNameSFID = lastModifiedByFullNameSFID;
        this.lastModifiedDate = lastModifiedDate;
        this.ownerAccountID = ownerAccountID;
        this.ownerAccountID18Digits = ownerAccountID18Digits;
        this.createdDate = createdDate;
    }

    public String getTyreName() {
        return tyreName;
    }

    public void setTyreName(String tyreName) {
        this.tyreName = tyreName;
    }

    public String getRecordTypeTyre() {
        return recordTypeTyre;
    }

    public void setRecordTypeTyre(String recordTypeTyre) {
        this.recordTypeTyre = recordTypeTyre;
    }

    public String getTyreID() {
        return tyreID;
    }

    public void setTyreID(String tyreID) {
        this.tyreID = tyreID;
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

    public String getTyreSetRecordType() {
        return tyreSetRecordType;
    }

    public void setTyreSetRecordType(String tyreSetRecordType) {
        this.tyreSetRecordType = tyreSetRecordType;
    }

    public String getParentNumberOfTyres() {
        return parentNumberOfTyres;
    }

    public void setParentNumberOfTyres(String parentNumberOfTyres) {
        this.parentNumberOfTyres = parentNumberOfTyres;
    }

    public String getOwnerAccountName() {
        return ownerAccountName;
    }

    public void setOwnerAccountName(String ownerAccountName) {
        this.ownerAccountName = ownerAccountName;
    }

    public String getTyreStatus() {
        return tyreStatus;
    }

    public void setTyreStatus(String tyreStatus) {
        this.tyreStatus = tyreStatus;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getFactoryCode() {
        return factoryCode;
    }

    public void setFactoryCode(String factoryCode) {
        this.factoryCode = factoryCode;
    }

    public String getSizeCode() {
        return sizeCode;
    }

    public void setSizeCode(String sizeCode) {
        this.sizeCode = sizeCode;
    }

    public String getManufacturedWeek() {
        return manufacturedWeek;
    }

    public void setManufacturedWeek(String manufacturedWeek) {
        this.manufacturedWeek = manufacturedWeek;
    }

    public String getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(String manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
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

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getOwnerAccountID() {
        return ownerAccountID;
    }

    public void setOwnerAccountID(String ownerAccountID) {
        this.ownerAccountID = ownerAccountID;
    }

    public String getOwnerAccountID18Digits() {
        return ownerAccountID18Digits;
    }

    public void setOwnerAccountID18Digits(String ownerAccountID18Digits) {
        this.ownerAccountID18Digits = ownerAccountID18Digits;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Tyre{" +
                "tyreName='" + tyreName + '\'' +
                ", recordTypeTyre='" + recordTypeTyre + '\'' +
                ", tyreID='" + tyreID + '\'' +
                ", tyreSetName='" + tyreSetName + '\'' +
                ", tyreSetID='" + tyreSetID + '\'' +
                ", tyreSetRecordType='" + tyreSetRecordType + '\'' +
                ", parentNumberOfTyres='" + parentNumberOfTyres + '\'' +
                ", ownerAccountName='" + ownerAccountName + '\'' +
                ", tyreStatus='" + tyreStatus + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", factoryCode='" + factoryCode + '\'' +
                ", sizeCode='" + sizeCode + '\'' +
                ", manufacturedWeek='" + manufacturedWeek + '\'' +
                ", manufacturedYear='" + manufacturedYear + '\'' +
                ", createdByFullName='" + createdByFullName + '\'' +
                ", createdByFullNameSFID='" + createdByFullNameSFID + '\'' +
                ", lastModifiedByFullName='" + lastModifiedByFullName + '\'' +
                ", lastModifiedByFullNameSFID='" + lastModifiedByFullNameSFID + '\'' +
                ", lastModifiedDate='" + lastModifiedDate + '\'' +
                ", ownerAccountID='" + ownerAccountID + '\'' +
                ", ownerAccountID18Digits='" + ownerAccountID18Digits + '\'' +
                ", createdDate='" + createdDate + '\'' +
                '}';
    }
}
