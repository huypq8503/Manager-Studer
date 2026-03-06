package com.company.managerstuder.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@JmixEntity
@Table(name = "ENROLLMENT", indexes = {
        @Index(name = "IDX_ENROLLMENT_COURSES", columnList = "COURSES_ID"),
        @Index(name = "IDX_ENROLLMENT_STUDERS", columnList = "STUDERS_ID")
}, uniqueConstraints = {
        @UniqueConstraint(name = "IDX_ENROLLMENT_UNQ", columnNames = {"COURSES_ID", "STUDERS_ID"})
})
@Entity
public class Enrollment {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @Column(name = "POINT", nullable = false)
    @NotNull
    private Integer point;

    @JoinColumn(name = "COURSES_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Course courses;

    @JoinColumn(name = "STUDERS_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Studer studers;

    public Studer getStuders() {
        return studers;
    }

    public void setStuders(Studer studers) {
        this.studers = studers;
    }

    public Course getCourses() {
        return courses;
    }

    public void setCourses(Course courses) {
        this.courses = courses;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
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