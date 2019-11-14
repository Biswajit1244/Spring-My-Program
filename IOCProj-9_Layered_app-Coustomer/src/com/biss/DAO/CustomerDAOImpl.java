package com.biss.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.biss.BO.CustomerBo;

public class CustomerDAOImpl implements CustomerDAO {
	private static final String INSERT_EMP="INSERT INTO LAYERED_CUSTOMER VALUES(?,?,?,?)";
	DataSource ds;
	
	//
	public CustomerDAOImpl(DataSource ds) {
		System.out.println("CustomerDAOImpl::!-param constructor");
		this.ds=ds;
	}
	@Override
	public int insert(CustomerBo bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get connection obj
		con=ds.getConnection();
		//prepare statement obj
		ps=con.prepareStatement(INSERT_EMP);
		//Set the query param value
		ps.setInt(1, bo.getCid());
		ps.setString(2,bo.getCname());
		ps.setFloat(3,bo.getPamt());
		ps.setFloat(4, bo.getInterestAmt());
		//execute the query
		count=ps.executeUpdate();
		
		//close jdbc connection
		ps.close();
		con.close();
		
		return count;
	}

	
}
