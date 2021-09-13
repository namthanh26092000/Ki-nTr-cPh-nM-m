package com.example.demo.repository;
import com.example.demo.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Long> {
    void save(Employee employee);
}

