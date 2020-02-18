package com.knowhow.workforce.service.impl;

import static java.util.stream.Collectors.toList;

import com.knowhow.workforce.contract.WorkSpecificationRequest;
import com.knowhow.workforce.mapper.WorkSpecificationMapper;
import com.knowhow.workforce.repository.WorkSpecificationRepository;
import com.knowhow.workforce.service.WorkSpecificationService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class WorkSpecificationServiceImpl implements WorkSpecificationService {

    private final WorkSpecificationRepository repository;
    private final WorkSpecificationMapper mapper;

    @Override
    public List<WorkSpecificationRequest> getAll() {
        return repository.findAll().stream().map(mapper::toDto).collect(toList());
    }
}
