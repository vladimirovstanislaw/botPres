package ru.sv.rgBotBack.DAO.model;

import jakarta.persistence.*;
import ru.sv.rgBotBack.parse.parsers.ParserUtils;
import ru.sv.rgBotBack.parse.plainPOJO.TyreSetPOJO;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "tyreSet")
public class TyreSet implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Tyre Set ID
    //@Id
    @Column(name = "tyreSetID")
    private String tyreSetID;

    //Purchase Date
    @Column(name = "purchaseDate")
    private Date purchaseDate;

    //Tyre Set Name
    @Column(name = "tyreSetName")
    private String tyreSetName;

    //Record Type
    @Column(name = "recordType")
    private String recordType;

    //Purchase Country
    @Column(name = "purchaseCountry")
    private String purchaseCountry;

    //Country Code
    @Column(name = "countryCode")
    private String countryCode;

    //Number of Tyres
    @Column(name = "numberOfTyres")
    private Integer numberOfTyres;

    //Size Code
    @Column(name = "sizeCode")
    private String sizeCode;

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

    //Service Entry ID
    @Column(name = "serviceEntryID")
    private String serviceEntryID;

    //Service Entry Id 18d
    @Column(name = "serviceEntryId18d")
    private String serviceEntryId18d;

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

    //Created Date
    @Column(name = "createdDate")
    private Date createdDate;

    public TyreSet() {
    }

    public TyreSet(TyreSetPOJO tyreSetPOJO) {
        this.tyreSetID = tyreSetPOJO.getTyreSetID();
        this.purchaseDate = ParserUtils.makeJavaDate(tyreSetPOJO.getPurchaseDate());
        this.tyreSetName = tyreSetPOJO.getTyreSetName();
        this.recordType = tyreSetPOJO.getRecordType();
        this.purchaseCountry = tyreSetPOJO.getPurchaseCountry();
        this.countryCode = tyreSetPOJO.getCountryCode();
        this.numberOfTyres = ParserUtils.getInteger(tyreSetPOJO.getNumberOfTyres());
        this.sizeCode = tyreSetPOJO.getSizeCode();
        this.pointOfSaleAccountName = tyreSetPOJO.getPointOfSaleAccountName();
        this.accountID = tyreSetPOJO.getAccountID();
        this.pointOfSaleAccountID18Digits = tyreSetPOJO.getPointOfSaleAccountID18Digits();
        this.pointOfSaleCompanySiteCode = tyreSetPOJO.getPointOfSaleCompanySiteCode();
        this.serviceEntryID = tyreSetPOJO.getServiceEntryID();
        this.serviceEntryId18d = tyreSetPOJO.getServiceEntryId18d();
        this.ownerAccountName = tyreSetPOJO.getOwnerAccountName();
        this.ownerAccountID18Digits = tyreSetPOJO.getOwnerAccountID18Digits();
        this.ownerPersonAccountMobile = tyreSetPOJO.getOwnerPersonAccountMobile();
        this.productProductName = tyreSetPOJO.getProductProductName();
        this.productProductCode = tyreSetPOJO.getProductProductCode();
        this.carVehicleName = tyreSetPOJO.getCarVehicleName();
        this.carVehicleID = tyreSetPOJO.getCarVehicleID();
        this.createdByFullName = tyreSetPOJO.getCreatedByFullName();
        this.createdByFullNameSFID = tyreSetPOJO.getCreatedByFullNameSFID();
        this.lastModifiedDate = ParserUtils.makeJavaDate(tyreSetPOJO.getLastModifiedDate());
        this.lastModifiedByFullName = tyreSetPOJO.getLastModifiedByFullName();
        this.lastModifiedByFullNameSFID = tyreSetPOJO.getLastModifiedByFullNameSFID();
        this.createdDate = ParserUtils.makeJavaDate(tyreSetPOJO.getCreatedDate());
    }

    public TyreSet(long id, String tyreSetID, Date purchaseDate, String tyreSetName, String recordType, String purchaseCountry, String countryCode, Integer numberOfTyres, String sizeCode, String pointOfSaleAccountName, String accountID, String pointOfSaleAccountID18Digits, String pointOfSaleCompanySiteCode, String serviceEntryID, String serviceEntryId18d, String ownerAccountName, String ownerAccountID18Digits, String ownerPersonAccountMobile, String productProductName, String productProductCode, String carVehicleName, String carVehicleID, String createdByFullName, String createdByFullNameSFID, Date lastModifiedDate, String lastModifiedByFullName, String lastModifiedByFullNameSFID, Date createdDate) {
        this.id = id;
        this.tyreSetID = tyreSetID;
        this.purchaseDate = purchaseDate;
        this.tyreSetName = tyreSetName;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTyreSetID() {
        return tyreSetID;
    }

    public void setTyreSetID(String tyreSetID) {
        this.tyreSetID = tyreSetID;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getTyreSetName() {
        return tyreSetName;
    }

    public void setTyreSetName(String tyreSetName) {
        this.tyreSetName = tyreSetName;
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

    public Integer getNumberOfTyres() {
        return numberOfTyres;
    }

    public void setNumberOfTyres(Integer numberOfTyres) {
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "\n<b>Tyre Set:</b>" +

                "\n\t\t\t\t\t\t\t<i>ID:</i> " + tyreSetID +
                "\n\t\t\t\t\t\t\t<i>Number of tyres:</i> " + numberOfTyres +
                "\n\t\t\t\t\t\t\t<i>Purchase date:</i> " + ParserUtils.getPlainDate(purchaseDate) +
                "\n\t\t\t\t\t\t\t<i>Product name:</i> " + productProductName +
                "\n\t\t\t\t\t\t\t<i>Product code:</i> " + productProductCode +
                "\n\t\t\t\t\t\t\t<i>Vehicle ID:</i> " + carVehicleID;
    }

}
