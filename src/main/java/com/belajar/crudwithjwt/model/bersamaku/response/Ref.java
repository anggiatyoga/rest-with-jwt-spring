package com.belajar.crudwithjwt.model.bersamaku.response;

import javax.persistence.Entity;

@Entity
public class Ref {

    private String code;
    private String finish_estimation;

    public Ref() {
    }

    public Ref(String code, String finish_estimation) {
        this.code = code;
        this.finish_estimation = finish_estimation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFinish_estimation() {
        return finish_estimation;
    }

    public void setFinish_estimation(String finish_estimation) {
        this.finish_estimation = finish_estimation;
    }
}
