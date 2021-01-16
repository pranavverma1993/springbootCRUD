package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.EmployeeEntity;





public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Long> {

	@Query("select m.firstName,m.lastName from EmployeeEntity as m where m.id=:id")
	List<Object[]> findByRequiredUserId(@Param("id")Integer id);
}
