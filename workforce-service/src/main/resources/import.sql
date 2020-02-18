INSERT INTO WORK_SPECIFICATION_TYPES  (ID, NAME) VALUES (1,'Testing');
alter table WORK_SPECIFICATIONS alter column ID binary(16)

INSERT INTO WORK_SPECIFICATIONS (ID, Description, NAME,standard_duration, standard_capacity_required, work_specification_type_id) VALUES ('21ae7719e3f64465ba7ed66cfec9fa90', 'empty description', 'GPON Installation', 120, 10, 1);