package com.internship.flyway.service;

import com.internship.flyway.model.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternService extends JpaRepository<Intern, Long> {

    Intern findInternByIdIntern(Long id);

}
