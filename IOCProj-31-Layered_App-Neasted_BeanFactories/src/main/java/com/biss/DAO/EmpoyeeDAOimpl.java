package com.biss.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.biss.EmployeeBO.EmployeeBO;

public class EmpoyeeDAOimpl implements EmployeeDAO {
	private static final String GET_EMP="SELECT EMPNO,ENAME,MGR,SAL,DEPTNO FROM EMP WHERE JOB=? OR JOB=?";
	DataSource ds;
	public EmpoyeeDAOimpl(DataSource ds) {
		this.ds=ds;
	}
	@Override
	public List<EmployeeBO> getEmpsByDesg(String desg1, String desg2) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		EmployeeBO bo=null;
		List<EmployeeBO> listBO=null;
		//GET connection obj
		con=ds.getConnection();
		//create statement obj
		ps=con.prepareStatement(GET_EMP);
		//set values query string
		ps.setString(1,desg1);
		ps.setString(2, desg2);
		//Execute the query
		rs=ps.executeQuery();
		//process the result and store into collection
		listBO=new ArrayList<>();
		while(rs.next()) {
			bo=new EmployeeBO();
			bo.setEmpNO(rs.getInt(1));
			bo.setEmpName(rs.getString(2));
			bo.setMgr(rs.getInt(3));
			bo.setSal(rs.getFloat(4));
			bo.setDeptNo(rs.getInt(5));
			//set value to collection
			listBO.add(bo);
		}
		  rs.close();
		  ps.close();
		  con.close();
		return listBO;
	}

}
