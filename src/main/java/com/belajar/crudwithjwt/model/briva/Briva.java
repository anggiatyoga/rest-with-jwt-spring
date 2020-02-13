package com.belajar.crudwithjwt.model.briva;

import com.belajar.crudwithjwt.model.mynt.DataModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Briva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Boolean status;
    private String responseDescription;
    private String responseCode;
    private ArrayList<DataModel> data;

    public Briva() {
    }

    public Briva(int id, Boolean status, String responseDescription, String responseCode, ArrayList<DataModel> data) {
        this.id = id;
        this.status = status;
        this.responseDescription = responseDescription;
        this.responseCode = responseCode;
        this.data = data;
    }
}
