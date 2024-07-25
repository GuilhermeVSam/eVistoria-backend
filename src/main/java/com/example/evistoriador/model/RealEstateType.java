package com.example.evistoriador.model;

public enum RealEstateType {
    House("Casa"), Apartment("Apartamento"), Comercial("Comercial"), Townhouse("Sobrado");
    private String desc;

    RealEstateType(String desc){
        this.desc = desc;
    }
}
