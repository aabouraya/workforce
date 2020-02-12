package com.knowhow.workforce.repository;

import com.knowhow.workforce.model.WorkSpecification;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkSpecificationRepository extends JpaRepository<WorkSpecification, UUID> {

    List<WorkSpecification> findAll();
}
