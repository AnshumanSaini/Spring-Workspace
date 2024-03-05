package org.edu.repository;

import java.util.List;
import java.util.Optional;

import org.edu.model.Students;
import org.springframework.stereotype.Repository;

public interface StudentsRepository {
	List<Students> findAll();
	public int save(Students std);
	public int delete(int id);
	public int update(Students std);
	public Optional<Students> findById(Students std);
}
