package com.knowhow.workforce.mapper;

import com.knowhow.workforce.WorkSpecificationDto;
import com.knowhow.workforce.model.WorkSpecification;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface WorkSpecificationMapper {

    WorkSpecificationDto toDto(WorkSpecification ws);

    WorkSpecification toModel(WorkSpecificationDto dto);

    void updateFromDto(WorkSpecificationDto dto, @MappingTarget WorkSpecification model);
}
