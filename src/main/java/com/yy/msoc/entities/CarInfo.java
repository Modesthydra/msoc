package com.yy.msoc.entities;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class CarInfo {

    private int id;

    private String brand;

    private String platenum;

    private String owner;

    private String parkingid;

    private Timestamp registertime;

    private Timestamp expirationtime;

    private Timestamp createtime;

    private Timestamp updatetime;

    private String createuser;

    private String updateuser;
}
