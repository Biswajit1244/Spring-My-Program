package com.biss.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.biss.BO.EmployeeBO;

public final class EmployeeDAOImpl implements EmloyeeDAO {
	DataSource ds;
	private static final String INSERT_EMP="INSERT INTO LAYERED_EMPLOYEE VALUES(seq_emp.NEXTVAL,?,?,?,?,?)";
	public EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count =0;
		//Create connection
		con=ds.getConnection();
		//create Statement obj
		ps=con.prepareStatement(INSERT_EMP);
		//set value to query string
		ps.setString(1, bo.getEmpName());
		ps.setString(2, bo.getEmpAddrs());
		ps.setFloat(3, bo.getBasicSalary());
		ps.setFloat(4, bo.getGrossSalary());
		ps.setFloat(5, bo.getNetSalary());
		//execute the query
		count=ps.executeUpdate();
		//close jdbc connection obj
		ps.close();
		con.close();
		
		return count;
	}

}
