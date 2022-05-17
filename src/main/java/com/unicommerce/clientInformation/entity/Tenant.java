package com.unicommerce.clientInformation.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "tenant",uniqueConstraints =@UniqueConstraint(name = "code",columnNames={"code"}))
public class Tenant implements java.io.Serializable {


    private Integer                id;
    private String               code;
    private String              name;
    private String              accessUrl;
    private String              accountType;
    private String              statusCode;
    private String              source;
    private LocalDate           goLiveDate;
    private String              businessName;
    private String              businessModel;
    private String              industry;
    private LocalDateTime       created;
    private LocalDateTime       updated;

    public Tenant() {
    }

    public Tenant(String code, String name, String accessUrl, String accountType, String statusCode, String source, LocalDate goLiveDate, String businessName, String businessModel, String industry, LocalDateTime created) {
        this.code = code;
        this.name = name;
        this.accessUrl = accessUrl;
        this.accountType = accountType;
        this.statusCode = statusCode;
        this.source = source;
        this.goLiveDate = goLiveDate;
        this.businessName = businessName;
        this.businessModel = businessModel;
        this.industry = industry;
        this.created = created;
    }

    public Tenant(String code, String name, LocalDateTime created) {
        this.code = code;
        this.name = name;
        this.created = created;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "code", unique = true, nullable = false, length = 45)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccessUrl() {
        return accessUrl;
    }

    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public LocalDate getGoLiveDate() {
        return goLiveDate;
    }

    public void setGoLiveDate(LocalDate goLiveDate) {
        this.goLiveDate = goLiveDate;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessModel() {
        return businessModel;
    }

    public void setBusinessModel(String businessModel) {
        this.businessModel = businessModel;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
