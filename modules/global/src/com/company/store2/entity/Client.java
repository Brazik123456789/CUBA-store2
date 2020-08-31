package com.company.store2.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Table(name = "STORE2_CLIENT")
@Entity(name = "store2_Client")
public class Client extends StandardEntity {
    private static final long serialVersionUID = 8232088499091423812L;

    @NotNull
    @Column(name = "FULL_NAME", nullable = false)
    private String fullName;

    @NotNull
    @Column(name = "PHONE", nullable = false)
    private String phone;

    @NotNull
    @Column(name = "EMAIL", nullable = false)
    @Email
    private String email;

    @Column(name = "SALE")
    private Integer sale;

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}