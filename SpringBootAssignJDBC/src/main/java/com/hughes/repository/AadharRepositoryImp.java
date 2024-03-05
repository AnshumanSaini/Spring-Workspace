package com.hughes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hughes.model.Aadhar;

@Repository
public class AadharRepositoryImp implements AadharRepository {

	@Autowired
	JdbcTemplate jdbctemplate;
	@Override
	public List<Aadhar> findAll() {
		return jdbctemplate.query("select * from aadhar", (rs, rowNum)-> new Aadhar(rs.getInt("aadhar_no"), rs.getString("name"), rs.getString("mobile_no"), rs.getString("address"), rs.getInt("income"), rs.getString("state")));
	}

	@Override
	public int create(Aadhar a) {
		return jdbctemplate.update("insert into aadhar values(?,?,?,?,?,?)", a.getAadhar_no(), a.getName(), a.getMobile_no(), a.getAadhar_no(), a.getIncome(), a.getState());
	}

	@Override
	public Optional<Aadhar> read(Aadhar a) {
		return jdbctemplate.queryForObject("select * from aadhar where aadhar_no=?",new Object[] {a.getAadhar_no()}, (rs, rowNum)-> Optional.of(new Aadhar(rs.getInt("aadhar_no"), rs.getString("name"), rs.getString("mobile_no"), rs.getString("address"), rs.getInt("income"), rs.getString("state"))));
	}

	@Override
	public int update(Aadhar a) {
		return jdbctemplate.update("update aadhar set name=? where aadhar_no=?", a.getName(), a.getAadhar_no());
	}

	@Override
	public int delete(Aadhar a) {
		return jdbctemplate.update("delete from aadhar where aadhar_no=?",a.getAadhar_no());
	}

}
