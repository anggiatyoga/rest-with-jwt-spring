package com.belajar.crudwithjwt.mobilepulsa;

import java.util.ArrayList;

public class MobilepuldaDataModel {

    private ArrayList<MobilepulsaModel> mobilepulsaModels;

    public MobilepuldaDataModel() {
    }

    public MobilepuldaDataModel(ArrayList<MobilepulsaModel> mobilepulsaModels) {
        this.mobilepulsaModels = mobilepulsaModels;
    }

    public ArrayList<MobilepulsaModel> getMobilepulsaModels() {
        return mobilepulsaModels;
    }

    public void setMobilepulsaModels(ArrayList<MobilepulsaModel> mobilepulsaModels) {
        this.mobilepulsaModels = mobilepulsaModels;
    }
}
