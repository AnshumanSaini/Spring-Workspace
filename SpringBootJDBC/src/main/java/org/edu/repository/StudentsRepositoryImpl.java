package org.edu.repository;

import java.util.List;
import java.util.Optional;

import org.edu.model.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentsRepositoryImpl implements StudentsRepository {
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public List<Students> findAll() {
		return jdbctemplate.query("select * from students", (rs, rowNum) -> new Students(rs.getInt("studentID"), rs.getString("studentName"), rs.getInt("age")));
	}
	
	public int save(Students std) {
		return jdbctemplate.update("insert into students values(?,?,?)", std.getStudentId(), std.getStudentName(), std.getAge());
	}
	
	public int delete(int id)
	{
		return jdbctemplate.update("delete from students where studentID=?",id);
	}
	
	public int update(Students std)
	{
		return jdbctemplate.update("update students set age=? where studentID=?", std.getAge(),std.getStudentId());
	}
	
	public Optional<Students> findById(Students std)
	{
		return jdbctemplate.queryForObject("select * from students where studentID=?",new Object[] {std.getStudentId()},(rs,rowNum)-> Optional.of(new Students(rs.getInt("studentID"), rs.getString("studentName"), rs.getInt("age"))));
	}
}
