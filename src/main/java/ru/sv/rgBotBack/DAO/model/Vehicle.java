package ru.sv.rgBotBack.DAO.model;

import jakarta.persistence.*;
import ru.sv.rgBotBack.parse.parsers.ParserUtils;
import ru.sv.rgBotBack.parse.plainPOJO.VehiclePOJO;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "vehicle")
public class Vehicle implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Vehicle: ID
    //@Id
    @Column(name = "vehicleID")
    private String vehicleID;

    //Active
    @Column(name = "active")
    private String active;

    //Vehicle: Vehicle Name
    @Column(name = "vehicleVehicleName")
    private String vehicleVehicleName;

    //Vehicle Owner: Account Name
    @Column(name = "vehicleOwnerAccountName")
    private String vehicleOwnerAccountName;

    //Vehicle Owner: Account ID 18 digits
    @Column(name = "vehicleOwnerAccountID18Digits")
    private String vehicleOwnerAccountID18Digits;

    //Vehicle Owner: Account ID
    @Column(name = "vehicleOwnerAccountID")
    private String vehicleOwnerAccountID;

    //Vehicle: Created By
    @Column(name = "vehicleCreatedBy")
    private String vehicleCreatedBy;

    //Vehicle: Created By SF ID
    @Column(name = "vehicleCreatedBySFID")
    private String vehicleCreatedBySFID;

    //Vehicle: Last Modified Date
    @Column(name = "vehicleLastModifiedDate")
    private Date vehicleLastModifiedDate;

    //Vehicle: Last Modified By
    @Column(name = "vehicleLastModifiedBy")
    private String vehicleLastModifiedBy;

    //Vehicle: Last Modified By SF ID
    @Column(name = "vehicleLastModifiedBySFID")
    private String vehicleLastModifiedBySFID;

    //License Plate Number
    @Column(name = "licensePlateNumber")
    private String licensePlateNumber;

    //License Plate Number Clean
    @Column(name = "licensePlateNumberClean")
    private String licensePlateNumberClean;

    //Brand
    @Column(name = "brand")
    private String brand;

    //Model
    @Column(name = "model")
    private String model;

    //Engine
    @Column(name = "engine")
    private String engine;

    //Manufacture Year
    @Column(name = "manufactureYear")
    private String manufactureYear;

    //Registration Country
    @Column(name = "registrationCountry")
    private String registrationCountry;

    //Country Code
    @Column(name = "countryCode")
    private String countryCode;

    //Created at
    @Column(name = "createdAt")
    private String createdAt;

    //Inactivated Date
    @Column(name = "inactivatedDate")
    private Date inactivatedDate;

    //Author Account
    @Column(name = "authorAccount")
    private String authorAccount;


    //Vehicle: Record Type
    @Column(name = "vehicleRecordType")
    private String vehicleRecordType;

    //Vehicle: Created Date
    @Column(name = "vehicleCreatedDate")
    private Date vehicleCreatedDate;

    public Vehicle() {
    }

    public Vehicle(VehiclePOJO pojo) {
        this.vehicleID = pojo.getVehicleID();
        this.active = pojo.getActive();
        this.vehicleVehicleName = pojo.getVehicleVehicleName();
        this.vehicleOwnerAccountName = pojo.getVehicleOwnerAccountName();
        this.vehicleOwnerAccountID18Digits = pojo.getVehicleOwnerAccountID18Digits();
        this.vehicleOwnerAccountID = pojo.getVehicleOwnerAccountID();
        this.vehicleCreatedBy = pojo.getVehicleCreatedBy();
        this.vehicleCreatedBySFID = pojo.getVehicleCreatedBySFID();
        this.vehicleLastModifiedDate = ParserUtils.makeJavaDate(pojo.getVehicleLastModifiedDate());
        this.vehicleLastModifiedBy = pojo.getVehicleLastModifiedBy();
        this.vehicleLastModifiedBySFID = pojo.getVehicleLastModifiedBySFID();
        this.licensePlateNumber = pojo.getLicensePlateNumber();
        this.licensePlateNumberClean = pojo.getLicensePlateNumberClean();
        this.brand = pojo.getBrand();
        this.model = pojo.getModel();
        this.engine = pojo.getEngine();
        this.manufactureYear = pojo.getManufactureYear();
        this.registrationCountry = pojo.getRegistrationCountry();
        this.countryCode = pojo.getCountryCode();
        this.createdAt = pojo.getCreatedAt();
        this.inactivatedDate = ParserUtils.makeJavaDate(pojo.getInactivatedDate());
        this.authorAccount = pojo.getAuthorAccount();
        this.vehicleRecordType = pojo.getVehicleRecordType();
        this.vehicleCreatedDate = ParserUtils.makeJavaDate(pojo.getVehicleCreatedDate());
    }

    public Vehicle(long id, String vehicleID, String active, String vehicleVehicleName, String vehicleOwnerAccountName, String vehicleOwnerAccountID18Digits, String vehicleOwnerAccountID, String vehicleCreatedBy, String vehicleCreatedBySFID, Date vehicleLastModifiedDate, String vehicleLastModifiedBy, String vehicleLastModifiedBySFID, String licensePlateNumber, String licensePlateNumberClean, String brand, String model, String engine, String manufactureYear, String registrationCountry, String countryCode, String createdAt, Date inactivatedDate, String authorAccount, String vehicleRecordType, Date vehicleCreatedDate) {
        this.id = id;
        this.vehicleID = vehicleID;
        this.active = active;
        this.vehicleVehicleName = vehicleVehicleName;
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


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
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

    public Date getVehicleLastModifiedDate() {
        return vehicleLastModifiedDate;
    }

    public void setVehicleLastModifiedDate(Date vehicleLastModifiedDate) {
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

    public Date getInactivatedDate() {
        return inactivatedDate;
    }

    public void setInactivatedDate(Date inactivatedDate) {
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

    public Date getVehicleCreatedDate() {
        return vehicleCreatedDate;
    }

    public void setVehicleCreatedDate(Date vehicleCreatedDate) {
        this.vehicleCreatedDate = vehicleCreatedDate;
    }

    @Override
    public String toString() {
        return "\n<b>Vehicle</b>" +
                "\n\t\t\t\t\t\t\t<i>ID:</i> " + vehicleID +
                "\n\t\t\t\t\t\t\t<i>Active:</i> " + active +
                "\n\t\t\t\t\t\t\t<i>Brand:</i> " + brand +
                "\n\t\t\t\t\t\t\t<i>Model:</i> " + model +
                "\n\t\t\t\t\t\t\t<i>Engine:</i> " + engine +
                "\n\t\t\t\t\t\t\t<i>Manufacture year:</i> " + manufactureYear +
                "\n\t\t\t\t\t\t\t<i>License plate number:</i> " + licensePlateNumber +
                "\n\t\t\t\t\t\t\t<i>Vehicle owner name:</i> " + vehicleOwnerAccountName +
                "\n\t\t\t\t\t\t\t<i>Last modified date:</i> " + ParserUtils.getPlainDate(vehicleLastModifiedDate) +
                "\n\t\t\t\t\t\t\t<i>Inactivated date:</i> " + ParserUtils.getPlainDate(inactivatedDate) +
                "\n\t\t\t\t\t\t\t<i>Vehicle created date:</i> " + ParserUtils.getPlainDate(vehicleCreatedDate);
    }
}
