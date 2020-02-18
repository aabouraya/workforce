package com.knowhow.workforce.service;


import com.knowhow.workforce.contract.WorkSpecificationRequest;
import java.util.List;

public interface WorkSpecificationService {

    List<WorkSpecificationRequest> getAll();
}
