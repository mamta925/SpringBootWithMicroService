package com.spr;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
	
      java.util.List<Person> findByPjobContains(String pjob);
}
