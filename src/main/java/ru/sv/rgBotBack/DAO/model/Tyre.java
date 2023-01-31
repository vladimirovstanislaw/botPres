package ru.sv.rgBotBack.DAO.model;


import jakarta.persistence.*;
import ru.sv.rgBotBack.parse.parsers.ParserUtils;
import ru.sv.rgBotBack.parse.plainPOJO.TyrePOJO;

import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name = "tyre")
public class Tyre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //Tyre Set ID :C
    //@Id
    @Column(name = "tyreID")
    private String tyreID;

    //Tyre Set Name :A
    @Column(name = "tyreName")
    private String tyreName;

    //Record Type :B
    @Column(name = "recordTypeTyre")
    private String recordTypeTyre;

    //Tyre Set Name :D
    @Column(name = "tyreSetName")
    private String tyreSetName;

    //Tyre Set ID :E
    @Column(name = "tyreSetID")
    private String tyreSetID;

    //Record Type :F
    @Column(name = "tyreSetRecordType")
    private String tyreSetRecordType;

    //Parent number of tyres
    @Column(name = "parentNumberOfTyres")
    private Integer parentNumberOfTyres;

    //Owner: Account Name
    @Column(name = "ownerAccountName")
    private String ownerAccountName;

    //Tyre Status
    @Column(name = "tyreStatus")
    private String tyreStatus;

    //Serial number
    @Column(name = "serialNumber")
    private String serialNumber;

    //Factory code
    @Column(name = "factoryCode")
    private String factoryCode;

    //Size Code
    @Column(name = "sizeCode")
    private String sizeCode;

    //Manufactured week
    @Column(name = "manufacturedWeek")
    private String manufacturedWeek;

    //Manufactured Year
    @Column(name = "manufacturedYear")
    private String manufacturedYear;

    //Created By: Full Name
    @Column(name = "createdByFullName")
    private String createdByFullName;

    //Created By: Full Name SF ID
    @Column(name = "createdByFullNameSFID")
    private String createdByFullNameSFID;

    //Last Modified By: Full Name
    @Column(name = "lastModifiedByFullName")
    private String lastModifiedByFullName;

    //Last Modified By: Full Name SF ID
    @Column(name = "lastModifiedByFullNameSFID")
    private String lastModifiedByFullNameSFID;

    //Last Modified Date
    @Column(name = "lastModifiedDate")
    private Date lastModifiedDate;

    //Owner: Account ID
    @Column(name = "ownerAccountID")
    private String ownerAccountID;

    //Owner: Account ID 18 digits
    @Column(name = "ownerAccountID18Digits")
    private String ownerAccountID18Digits;

    //Created Date
    @Column(name = "createdDate")
    private Date createdDate;

    public Tyre() {
    }

    public Tyre(TyrePOJO tyrePOJO) {
        this.tyreID = tyrePOJO.getTyreID();
        this.tyreName = tyrePOJO.getTyreName();
        this.recordTypeTyre = tyrePOJO.getRecordTypeTyre();
        this.tyreSetName = tyrePOJO.getTyreSetName();
        this.tyreSetID = tyrePOJO.getTyreSetID();
        this.tyreSetRecordType = tyrePOJO.getTyreSetRecordType();
        this.parentNumberOfTyres = ParserUtils.getInteger(tyrePOJO.getParentNumberOfTyres());
        this.ownerAccountName = tyrePOJO.getOwnerAccountName();
        this.tyreStatus = tyrePOJO.getTyreStatus();
        this.serialNumber = tyrePOJO.getSerialNumber();
        this.factoryCode = tyrePOJO.getFactoryCode();
        this.sizeCode = tyrePOJO.getSizeCode();
        this.manufacturedWeek = tyrePOJO.getManufacturedWeek();
        this.manufacturedYear = tyrePOJO.getManufacturedYear();
        this.createdByFullName = tyrePOJO.getCreatedByFullName();
        this.createdByFullNameSFID = tyrePOJO.getCreatedByFullNameSFID();
        this.lastModifiedByFullName = tyrePOJO.getLastModifiedByFullName();
        this.lastModifiedByFullNameSFID = tyrePOJO.getLastModifiedByFullNameSFID();
        this.lastModifiedDate = ParserUtils.makeJavaDate(tyrePOJO.getLastModifiedDate());
        this.ownerAccountID = tyrePOJO.getOwnerAccountID();
        this.ownerAccountID18Digits = tyrePOJO.getOwnerAccountID18Digits();
        this.createdDate = ParserUtils.makeJavaDate(tyrePOJO.getCreatedDate());
    }

    public Tyre(long id, String tyreID, String tyreName, String recordTypeTyre, String tyreSetName, String tyreSetID, String tyreSetRecordType, Integer parentNumberOfTyres, String ownerAccountName, String tyreStatus, String serialNumber, String factoryCode, String sizeCode, String manufacturedWeek, String manufacturedYear, String createdByFullName, String createdByFullNameSFID, String lastModifiedByFullName, String lastModifiedByFullNameSFID, Date lastModifiedDate, String ownerAccountID, String ownerAccountID18Digits, Date createdDate) {
        this.id = id;
        this.tyreID = tyreID;
        this.tyreName = tyreName;
        this.recordTypeTyre = recordTypeTyre;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTyreID() {
        return tyreID;
    }

    public void setTyreID(String tyreID) {
        this.tyreID = tyreID;
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

    public Integer getParentNumberOfTyres() {
        return parentNumberOfTyres;
    }

    public void setParentNumberOfTyres(Integer parentNumberOfTyres) {
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

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "\n\t\t\t\t\t\t\t\t\t\t\t<b>Tyre</b>" +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i>ID:</i> " + tyreID +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<i>Status:</i> " + tyreStatus;
    }
}
