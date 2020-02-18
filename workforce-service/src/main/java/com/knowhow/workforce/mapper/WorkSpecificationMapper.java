package com.knowhow.workforce.mapper;


import com.knowhow.workforce.contract.WorkSpecificationRequest;
import com.knowhow.workforce.model.WorkSpecification;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface WorkSpecificationMapper {

    WorkSpecificationRequest toDto(WorkSpecification ws);

    WorkSpecification toModel(WorkSpecificationRequest dto);

    void updateFromDto(WorkSpecificationRequest dto, @MappingTarget WorkSpecification model);
}
