package com.knowhow.workforce.model;

import java.util.Set;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "work_specifications")
public class WorkSpecification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "standard_duration", nullable = false)
    private Integer standardDuration;

    @Column(name = "standard_capacity_required", nullable = false)
    private Integer standardCapacityRequired;

    @ManyToOne
    @JoinColumn(name = "work_specification_type_id")
    private WorkSpecificationType type;

    @ManyToMany
    @JoinTable(name = "work_specifications_skills", joinColumns = @JoinColumn(name = "work_specification_id"), inverseJoinColumns = @JoinColumn(name = "skill_specification_id"))
    private Set<SkillSpecification> skills;


    @ManyToOne
    @JoinColumn(name = "work_specification_cost_id")
    private WorkSpecificationCost cost;
}
