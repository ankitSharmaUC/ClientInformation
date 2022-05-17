package com.unicommerce.clientInformation.entity;

import java.time.LocalDate;

public class Handover implements java.io.Serializable {

    private Integer id;
    private Tenant tenant;
    private User user;
    private String status;
    private LocalDate handoverDate;

}
