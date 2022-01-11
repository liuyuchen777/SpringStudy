package com.example.jpawithrest.dao;

import com.example.jpawithrest.pojo.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Interface PagingAndSortingRepository extend from CrudRepository with extra finaAll with page and sort
 * @RepositoryRestResource  direct Spring MVC to create RESTful endpoints at "/students"
 * default will be students, you can also change to others in path
 */

@RepositoryRestResource(collectionResourceRel = "students", path = "students")
public interface StudentRepository extends PagingAndSortingRepository<Student, Long> {
    List<Student> findByLastName(@Param("name") String name);
}
