package com.unicommerce.clientInformation.entity;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Nps implements java.io.Serializable {
    private Integer id;
    private Tenant tenant;
    private Integer rating;
    private LocalDate feedbackDate;
    private User feedbackProvider;
    private String feedback;
    private Boolean actionRequired;

    public Nps() {
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tenant_id", nullable = false)
    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Integer getRating() {
        return rating;
    }

        public void setRating(Integer rating) {
        this.rating = rating;
    }

    public LocalDate getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(LocalDate feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    public User getFeedbackProvider() {
        return feedbackProvider;
    }

    public void setFeedbackProvider(User feedbackProvider) {
        this.feedbackProvider = feedbackProvider;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Boolean getActionRequired() {
        return actionRequired;
    }

    public void setActionRequired(Boolean actionRequired) {
        this.actionRequired = actionRequired;
    }
}
