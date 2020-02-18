package com.knowhow.workforce.controller;

import com.knowhow.workforce.contract.WorkSpecificationRequest;
import com.knowhow.workforce.service.WorkSpecificationService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/work-specification", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class WorkSpecificationController {

    private final WorkSpecificationService workSpecificationService;

    @GetMapping
    public List<WorkSpecificationRequest> get() {
        return workSpecificationService.getAll();
    }
}
