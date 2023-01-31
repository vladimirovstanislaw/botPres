package ru.sv.rgBotBack.parse.plainPOJO;
public class VehiclePOJO {
    //Active
    private String active;
    //Vehicle: Vehicle Name
    private String vehicleVehicleName;
    //Vehicle: ID
    //@Id
    private String vehicleID;
    //Vehicle Owner: Account Name
    private String vehicleOwnerAccountName;
    //Vehicle Owner: Account ID 18 digits
    private String vehicleOwnerAccountID18Digits;
    //Vehicle Owner: Account ID
    private String vehicleOwnerAccountID;
    //Vehicle: Created By
    private String vehicleCreatedBy;
    //Vehicle: Created By SF ID
    private String vehicleCreatedBySFID;
    //Vehicle: Last Modified Date
    private String vehicleLastModifiedDate;
    //Vehicle: Last Modified By
    private String vehicleLastModifiedBy;
    //Vehicle: Last Modified By SF ID
    private String vehicleLastModifiedBySFID;
    //License Plate Number
    private String licensePlateNumber;
    //License Plate Number Clean
    private String licensePlateNumberClean;
    //Brand
    private String brand;
    //Model
    private String model;
    //Engine
    private String engine;
    //Manufacture Year
    private String manufactureYear;
    //Registration Country
    private String registrationCountry;
    //Country Code
    private String countryCode;
    //Created at
    private String createdAt;
    //Inactivated Date
    private String inactivatedDate;
    //Author Account
    private String authorAccount;
    //Vehicle: Record Type
    private String vehicleRecordType;
    //Vehicle: Created Date
    private String vehicleCreatedDate;

    public VehiclePOJO() {
    }

    public VehiclePOJO(String active, String vehicleVehicleName, String vehicleID, String vehicleOwnerAccountName, String vehicleOwnerAccountID18Digits, String vehicleOwnerAccountID, String vehicleCreatedBy, String vehicleCreatedBySFID, String vehicleLastModifiedDate, String vehicleLastModifiedBy, String vehicleLastModifiedBySFID, String licensePlateNumber, String licensePlateNumberClean, String brand, String model, String engine, String manufactureYear, String registrationCountry, String countryCode, String createdAt, String inactivatedDate, String authorAccount, String vehicleRecordType, String vehicleCreatedDate) {
        this.active = active;
        this.vehicleVehicleName = vehicleVehicleName;
        this.vehicleID = vehicleID;
        this.vehicleOwnerAccountName = vehicleOwnerAccountName;
        this.vehicleOwnerAccountID18Digits = vehicleOwnerAccountID18Digits;
        this.vehicleOwnerAccountID = vehicleOwnerAccountID;
        this.vehicleCreatedBy = vehicleCreatedBy;
        this.vehicleCreatedBySFID = vehicleCreatedBySFID;
        this.vehicleLastModifiedDate = vehicleLastModifiedDate;
        this.vehicleLastModifiedBy = vehicleLastModifiedBy;
        this.vehicleLastModifiedBySFID = vehicleLastModifiedBySFID;
        this.licensePlateNumber = licensePlateNumber;
        this.licensePlateNumberClean = licensePlateNumberClean;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.manufactureYear = manufactureYear;
        this.registrationCountry = registrationCountry;
        this.countryCode = countryCode;
        this.createdAt = createdAt;
        this.inactivatedDate = inactivatedDate;
        this.authorAccount = authorAccount;
        this.vehicleRecordType = vehicleRecordType;
        this.vehicleCreatedDate = vehicleCreatedDate;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getVehicleVehicleName() {
        return vehicleVehicleName;
    }

    public void setVehicleVehicleName(String vehicleVehicleName) {
        this.vehicleVehicleName = vehicleVehicleName;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getVehicleOwnerAccountName() {
        return vehicleOwnerAccountName;
    }

    public void setVehicleOwnerAccountName(String vehicleOwnerAccountName) {
        this.vehicleOwnerAccountName = vehicleOwnerAccountName;
    }

    public String getVehicleOwnerAccountID18Digits() {
        return vehicleOwnerAccountID18Digits;
    }

    public void setVehicleOwnerAccountID18Digits(String vehicleOwnerAccountID18Digits) {
        this.vehicleOwnerAccountID18Digits = vehicleOwnerAccountID18Digits;
    }

    public String getVehicleOwnerAccountID() {
        return vehicleOwnerAccountID;
    }

    public void setVehicleOwnerAccountID(String vehicleOwnerAccountID) {
        this.vehicleOwnerAccountID = vehicleOwnerAccountID;
    }

    public String getVehicleCreatedBy() {
        return vehicleCreatedBy;
    }

    public void setVehicleCreatedBy(String vehicleCreatedBy) {
        this.vehicleCreatedBy = vehicleCreatedBy;
    }

    public String getVehicleCreatedBySFID() {
        return vehicleCreatedBySFID;
    }

    public void setVehicleCreatedBySFID(String vehicleCreatedBySFID) {
        this.vehicleCreatedBySFID = vehicleCreatedBySFID;
    }

    public String getVehicleLastModifiedDate() {
        return vehicleLastModifiedDate;
    }

    public void setVehicleLastModifiedDate(String vehicleLastModifiedDate) {
        this.vehicleLastModifiedDate = vehicleLastModifiedDate;
    }

    public String getVehicleLastModifiedBy() {
        return vehicleLastModifiedBy;
    }

    public void setVehicleLastModifiedBy(String vehicleLastModifiedBy) {
        this.vehicleLastModifiedBy = vehicleLastModifiedBy;
    }

    public String getVehicleLastModifiedBySFID() {
        return vehicleLastModifiedBySFID;
    }

    public void setVehicleLastModifiedBySFID(String vehicleLastModifiedBySFID) {
        this.vehicleLastModifiedBySFID = vehicleLastModifiedBySFID;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getLicensePlateNumberClean() {
        return licensePlateNumberClean;
    }

    public void setLicensePlateNumberClean(String licensePlateNumberClean) {
        this.licensePlateNumberClean = licensePlateNumberClean;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getRegistrationCountry() {
        return registrationCountry;
    }

    public void setRegistrationCountry(String registrationCountry) {
        this.registrationCountry = registrationCountry;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getInactivatedDate() {
        return inactivatedDate;
    }

    public void setInactivatedDate(String inactivatedDate) {
        this.inactivatedDate = inactivatedDate;
    }

    public String getAuthorAccount() {
        return authorAccount;
    }

    public void setAuthorAccount(String authorAccount) {
        this.authorAccount = authorAccount;
    }

    public String getVehicleRecordType() {
        return vehicleRecordType;
    }

    public void setVehicleRecordType(String vehicleRecordType) {
        this.vehicleRecordType = vehicleRecordType;
    }

    public String getVehicleCreatedDate() {
        return vehicleCreatedDate;
    }

    public void setVehicleCreatedDate(String vehicleCreatedDate) {
        this.vehicleCreatedDate = vehicleCreatedDate;
    }

    @Override
    public String toString() {
        return "VehiclePOJO{" +
                "active='" + active + '\'' +
                ", vehicleVehicleName='" + vehicleVehicleName + '\'' +
                ", vehicleID='" + vehicleID + '\'' +
                ", vehicleOwnerAccountName='" + vehicleOwnerAccountName + '\'' +
                ", vehicleOwnerAccountID18Digits='" + vehicleOwnerAccountID18Digits + '\'' +
                ", vehicleOwnerAccountID='" + vehicleOwnerAccountID + '\'' +
                ", vehicleCreatedBy='" + vehicleCreatedBy + '\'' +
                ", vehicleCreatedBySFID='" + vehicleCreatedBySFID + '\'' +
                ", vehicleLastModifiedDate='" + vehicleLastModifiedDate + '\'' +
                ", vehicleLastModifiedBy='" + vehicleLastModifiedBy + '\'' +
                ", vehicleLastModifiedBySFID='" + vehicleLastModifiedBySFID + '\'' +
                ", licensePlateNumber='" + licensePlateNumber + '\'' +
                ", licensePlateNumberClean='" + licensePlateNumberClean + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", manufactureYear='" + manufactureYear + '\'' +
                ", registrationCountry='" + registrationCountry + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", inactivatedDate='" + inactivatedDate + '\'' +
                ", authorAccount='" + authorAccount + '\'' +
                ", vehicleRecordType='" + vehicleRecordType + '\'' +
                ", vehicleCreatedDate='" + vehicleCreatedDate + '\'' +
                '}';
    }
}
