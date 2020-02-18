package com.knowhow.workforce.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import lombok.Data;

@Data
@Entity
@Table(name = "work_specification_costs")
public class WorkSpecificationCost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Digits(integer = 10 , fraction = 2)
    @Column(name = "cost", precision=10, scale=2)
    private BigDecimal cost;

}
