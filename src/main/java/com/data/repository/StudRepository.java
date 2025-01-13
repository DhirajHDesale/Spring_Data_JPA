package com.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.data.entity.Student;

public interface StudRepository extends CrudRepository<Student, Integer> {

}
