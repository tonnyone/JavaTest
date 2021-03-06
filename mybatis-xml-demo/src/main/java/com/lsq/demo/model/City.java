package com.lsq.demo.model;

import java.util.Date;

public class City {

    private Long id;
    private String name;
    private CityTypeEnum type;
    private Date insertTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CityTypeEnum getType() {
        return type;
    }

    public void setType(CityTypeEnum type) {
        this.type = type;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}
