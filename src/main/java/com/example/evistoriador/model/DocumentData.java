package com.example.evistoriador.model;

public class DocumentData{
    private InspectionType inspectionType;
    private String landlord;
    private String landlordCpfCnpj;
    private String renter;
    private String renterCpfCnpj;
    private RealEstateType realEstateType;
    private String CEP;
    private int number;
    private String address;
    private String aAInformation;
    private int bedrooms;
    private int bathrooms;
    private int parking;

    public InspectionType getInspectionType() {
        return inspectionType;
    }

    public void setInspectionType(InspectionType inspectionType) {
        this.inspectionType = inspectionType;
    }

    public String getLandlord() {
        return landlord;
    }

    public void setLandlord(String landlord) {
        this.landlord = landlord;
    }

    public String getLandlordCpfCnpj() {
        return landlordCpfCnpj;
    }

    public void setLandlordCpfCnpj(String landlordCpfCnpj) {
        this.landlordCpfCnpj = landlordCpfCnpj;
    }

    public String getRenter() {
        return renter;
    }

    public void setRenter(String renter) {
        this.renter = renter;
    }

    public String getRenterCpfCnpj() {
        return renterCpfCnpj;
    }

    public void setRenterCpfCnpj(String renterCpfCnpj) {
        this.renterCpfCnpj = renterCpfCnpj;
    }

    public RealEstateType getRealEstateType() {
        return realEstateType;
    }

    public void setRealEstateType(RealEstateType realEstateType) {
        this.realEstateType = realEstateType;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getaAInformation() {
        return aAInformation;
    }

    public void setaAInformation(String aAInformation) {
        this.aAInformation = aAInformation;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getParking() {
        return parking;
    }

    public void setParking(int parking) {
        this.parking = parking;
    }
}
