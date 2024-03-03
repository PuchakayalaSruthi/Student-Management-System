package com.psr.spring;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.mysql.jdbc.ResultSet;
public class StudentDao {
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int insert(Student stu)
	{
		/*String sql = "insert into Student  values('"+stu.getId()+"','"+stu.getName()+"','"+stu.getBranch()+"','"+stu.getAddress()+"','"+stu.getEmail()+"','"+stu.getPhoneno()+"')";
		return template.update(sql);*/
		
		
		    String sql = "INSERT INTO Student (sname, sbranch, saddress, semail, sphoneno) VALUES (?, ?, ?, ?, ?)";
		    return template.update(sql, stu.getName(), stu.getBranch(), stu.getAddress(), stu.getEmail(), stu.getPhoneno());
		}

	
	
	public int update(Student stu)
	{
		String sql = "update Student  set sname = '"+stu.getName()+"', sbranch = '"+stu.getBranch()+"',saddress = '"+stu.getAddress()+"', semail = '"+stu.getEmail()+"', sphoneno = '"+stu.getPhoneno()+"' where sid = '"+stu.getId()+"'";
		return template.update(sql);
	}
	
	public int delete(Student stu)
	{
		String sql = "delete from Student where sid = '"+stu.getId()+"'";
		return template.update(sql);
	}
	
	
		

	public List<Student> getStudents() {
		return template.query("select * from Student", new RowMapper<Student>() 
		{
			public Student mapRow(java.sql.ResultSet rs, int rownumber) throws SQLException
			{
				Student student = new Student();
				 
				student.setId(rs.getInt(1));
                student.setName (rs.getString(2));
				student.setBranch(rs.getString(3));
				student.setAddress(rs.getString(4));
				student.setEmail(rs.getString(5));
			    student.setPhoneno(rs.getString(6));

				return student;
				}
			});
	}
	
		
	
	
	
	
	
	
	public List<Student> getAllstudents(){

	return template.query("select * from Student", new ResultSetExtractor<List<Student>>() {
			public List<Student> extractData(java.sql.ResultSet rs) throws SQLException, DataAccessException{

	
	List<Student> list = new ArrayList<>();
	while(rs.next()) {

		Student s=new Student(); 
		s.setId(rs.getInt("sid")); 
		s.setName (rs.getString("sname")); 
		 s.setBranch(rs.getString("sbranch"));
	    s.setAddress(rs.getString("saddress"));
	    s.setEmail(rs.getString("semail"));
        s.setPhoneno(rs.getString("sphoneno"));
	    list.add(s);
	    
	    }

	return list;
			}

			

    });
}
}
	

	
	
	
	
	

