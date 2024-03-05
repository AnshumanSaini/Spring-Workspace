package com.hughes.repository;

import java.util.List;
import java.util.Optional;

import com.hughes.model.Aadhar;

public interface AadharRepository {
	public List<Aadhar> findAll();

	public int create(Aadhar a);

	public Optional<Aadhar> read(Aadhar a);

	public int update(Aadhar a);

	public int delete(Aadhar a);

}
