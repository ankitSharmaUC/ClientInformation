package com.unicommerce.clientInformation.entity;

import java.time.LocalDate;

public class Churn {
    private Integer id;
    private Tenant tenant;
    private String lastStatus;
    private LocalDate churnDate;
    private String kamComments;
    private String managerComments;
    private String salesComments;
    private String leadershipComments;
    private String finalReason;
    private String learning;

}
