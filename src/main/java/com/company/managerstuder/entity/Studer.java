package com.company.managerstuder.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

//
import java.time.Period;
import io.jmix.core.metamodel.annotation.JmixProperty;
//
@JmixEntity
@Table(name = "STUDER")
@Entity
public class Studer {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @Column(name = "CODE", nullable = false)
    @NotNull
    private String code;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "DOB", nullable = false)
    @NotNull
    private LocalDate dob;

    @Column(name = "CCCD", nullable = false)
    @NotNull
    private String cccd;

    @Column(name = "ADDRESS", nullable = false)
    @NotNull
    private String address;

    @Column(name = "NUMBER_PHONE", nullable = false)
    @NotNull
    private String numberPhone;

    @Composition
    @OneToMany(mappedBy = "studers")
    private List<Enrollment> enrollments;
    //
    @JmixProperty
    public Integer getAge() {
        if (dob == null) {
            return null;
        }
        return Period.between(dob, LocalDate.now()).getYears();
    }
    //
    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}