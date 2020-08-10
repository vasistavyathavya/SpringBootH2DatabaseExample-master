	package com.vasista.studentmanager.repository;
	
	import org.springframework.data.repository.CrudRepository;

import com.vasista.studentmanager.model.Studentmanager;
	
	public interface StudentmanagerRepository extends CrudRepository<Studentmanager, Integer> {}