package com.techprimers.reactive.reactivemongoexample1.repository;

import com.techprimers.reactive.reactivemongoexample1.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
}
