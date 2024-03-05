package com.hughes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hughes.model.Aadhar;
import com.hughes.repository.AadharRepository;

@Service
public class AadharServiceImp implements AadharService {
	@Autowired
	AadharRepository arepo;

	@Override
	public List<Aadhar> findAll() {
		return arepo.findAll();
	}

	@Override
	public int create(Aadhar a) {
		return arepo.create(a);
	}

	@Override
	public Optional<Aadhar> read(Aadhar a) {
		return arepo.read(a);
	}

	@Override
	public int update(Aadhar a) {
		return arepo.update(a);
	}

	@Override
	public int delete(Aadhar a) {
		return arepo.delete(a);
	}

}
