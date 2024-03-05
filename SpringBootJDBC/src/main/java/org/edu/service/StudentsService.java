package org.edu.service;

import java.util.List;
import java.util.Optional;

import org.edu.model.Students;

public interface StudentsService {

	List<Students> findAll();
	public int save(Students std);
	public int delete(int id);
	public int update(Students std);
	public Optional<Students> findById(Students std);

}
