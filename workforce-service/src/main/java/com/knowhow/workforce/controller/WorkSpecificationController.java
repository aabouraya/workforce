package com.knowhow.workforce.controller;

import com.knowhow.workforce.WorkSpecificationDto;
import com.knowhow.workforce.service.WorkSpecificationService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WorkSpecificationController {

    private final WorkSpecificationService workSpecificationService;

    public List<WorkSpecificationDto> get() {
        return workSpecificationService.getAll();
    }
}
