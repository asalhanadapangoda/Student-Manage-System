package org.example.repository;

import org.example.entity.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<StudentEntity, Long> {

}
