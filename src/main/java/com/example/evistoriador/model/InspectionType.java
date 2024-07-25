package com.example.evistoriador.model;

public enum InspectionType {
    ENTRADA("Entrada"), SAIDA("Saída"), ENTRADA_SAIDA("Entrada e Saída");
    private String desc;

    InspectionType(String desc){
        this.desc = desc;
    }
}
