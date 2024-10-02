package com.example.evistoriador.model;

import java.util.List;

public class DocumentRequest {
    private List<TableData> tablesData;
    private DataInput dataInput;

    public List<TableData> getTablesData() {
        return tablesData;
    }

    public void setTablesData(List<TableData> tablesData) {
        this.tablesData = tablesData;
    }

    public DataInput getDataInput() {
        return dataInput;
    }

    public void setDataInput(DataInput dataInput) {
        this.dataInput = dataInput;
    }

    @Override
    public String toString() {
        return "DocumentRequest{" +
                "tablesData=" + tablesData +
                ", dataInput=" + dataInput +
                '}';
    }

    public static class TableData {
        private String title;
        private List<String> fields;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getFields() {
            return fields;
        }

        public void setFields(List<String> fields) {
            this.fields = fields;
        }

        @Override
        public String toString() {
            return "TableData{" +
                    "title='" + title + '\'' +
                    ", fields=" + fields +
                    '}';
        }
    }

    public static class DataInput {
        private String tipoDeVistoria;
        private String locador;
        private String locadorCpfCnpj;
        private String locatario;
        private String locatarioCpfCnpj;
        private String tipoImovel;
        private String cep;
        private String numero;
        private String endereco;
        private String complemento;
        private String nQuartos;
        private String nBanheiros;
        private String nVagas;

        public String getTipoDeVistoria() {
            return tipoDeVistoria;
        }

        public void setTipoDeVistoria(String tipoDeVistoria) {
            this.tipoDeVistoria = tipoDeVistoria;
        }

        public String getLocador() {
            return locador;
        }

        public void setLocador(String locador) {
            this.locador = locador;
        }

        public String getLocadorCpfCnpj() {
            return locadorCpfCnpj;
        }

        public void setLocadorCpfCnpj(String locadorCpfCnpj) {
            this.locadorCpfCnpj = locadorCpfCnpj;
        }

        public String getLocatario() {
            return locatario;
        }

        public void setLocatario(String locatario) {
            this.locatario = locatario;
        }

        public String getLocatarioCpfCnpj() {
            return locatarioCpfCnpj;
        }

        public void setLocatarioCpfCnpj(String locatarioCpfCnpj) {
            this.locatarioCpfCnpj = locatarioCpfCnpj;
        }

        public String getTipoImovel() {
            return tipoImovel;
        }

        public void setTipoImovel(String tipoImovel) {
            this.tipoImovel = tipoImovel;
        }

        public String getCep() {
            return cep;
        }

        public void setCep(String cep) {
            this.cep = cep;
        }

        public String getNumero() {
            return numero;
        }

        public void setNumero(String numero) {
            this.numero = numero;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public String getComplemento() {
            return complemento;
        }

        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }

        public String getNQuartos() {
            return nQuartos;
        }

        public void setNQuartos(String nQuartos) {
            this.nQuartos = nQuartos;
        }

        public String getNBanheiros() {
            return nBanheiros;
        }

        public void setNBanheiros(String nBanheiros) {
            this.nBanheiros = nBanheiros;
        }

        public String getNVagas() {
            return nVagas;
        }

        public void setNVagas(String nVagas) {
            this.nVagas = nVagas;
        }

        @Override
        public String toString() {
            return "DataInput{" +
                    "tipoDeVistoria='" + tipoDeVistoria + '\'' +
                    ", locador='" + locador + '\'' +
                    ", locadorCpfCnpj='" + locadorCpfCnpj + '\'' +
                    ", locatario='" + locatario + '\'' +
                    ", locatarioCpfCnpj='" + locatarioCpfCnpj + '\'' +
                    ", tipoImovel='" + tipoImovel + '\'' +
                    ", cep='" + cep + '\'' +
                    ", numero='" + numero + '\'' +
                    ", endereco='" + endereco + '\'' +
                    ", complemento='" + complemento + '\'' +
                    ", nQuartos='" + nQuartos + '\'' +
                    ", nBanheiros='" + nBanheiros + '\'' +
                    ", nVagas='" + nVagas + '\'' +
                    '}';
        }
    }
}