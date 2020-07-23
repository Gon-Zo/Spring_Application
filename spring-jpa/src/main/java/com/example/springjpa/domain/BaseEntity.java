package com.example.springjpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@MappedSuperclass
public class BaseEntity {

    @Id
    @Setter
    @Column(name = "seq" , nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @Column(updatable = false , nullable = false)
    protected LocalDate createDate;

    @Column(nullable = false)
    protected LocalDate updateDate;

    @PrePersist
    protected void onPersist() {
        this.createDate = this.updateDate = LocalDate.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updateDate = LocalDate.now();
    }

}
