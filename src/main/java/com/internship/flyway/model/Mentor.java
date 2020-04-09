package com.internship.flyway.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentor")
@Data
@NoArgsConstructor
public class Mentor {
    @Id
    @Column(name = "id_mentor")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMentor;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
}
