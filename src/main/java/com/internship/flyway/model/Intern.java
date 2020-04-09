package com.internship.flyway.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Comparator;

@Entity
@Table(name = "intern")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Intern implements Comparable<Intern>{
    @Id
    @Column(name = "id_intern")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idIntern;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToOne
    @JoinColumn(name = "mentor_id", referencedColumnName = "id_mentor" )
    private Mentor mentor;

    @Override
    public int compareTo(Intern o) {
         return this.getIdIntern() >= o.getIdIntern() ? -1 : 0;
    }
}
