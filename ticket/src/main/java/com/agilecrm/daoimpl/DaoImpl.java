package com.agilecrm.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.agilecrm.dao.Dao;
import com.agilecrm.model.Ticket;
import com.agilecrm.util.MySqlConnection;

public class DaoImpl implements Dao {

	static Connection con;
	static int status;
	

	@Override
	public int addTicket(Ticket ticket) throws SQLException, ClassNotFoundException {
		con = MySqlConnection.getConnection();
		try {
			String sql = "insert into ticket(name,email,mobile,problem_type,problem_desc,status) values(?,?,?,?,?,'NEW')";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ticket.getName());
			ps.setString(2, ticket.getEmail());
			ps.setLong(3, ticket.getMobile());
			ps.setString(4, ticket.getProblem_type());
			ps.setString(5, ticket.getProblem_desc());
			status = ps.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		}
		return status;
	}

	@Override
	public int updateTicket(Ticket ticket) throws ClassNotFoundException, SQLException {

		try {
			String sql = "update ticket set dept=?,status=? where ticketId=?";
			con = MySqlConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ticket.getDept());
			ps.setString(2, ticket.getStatus());
			ps.setInt(3, ticket.getTicketId());
			status = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return status;
		
	}
	@Override
	public List<Ticket> listTickets() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Ticket> getTicketById(Ticket ticket) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(Ticket ticket) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean sendTickeyByEmail(Ticket ticket) {
		return false;

	}

	@Override
	public int updateResolution(Ticket ticket) throws ClassNotFoundException, SQLException {
		
		try {
			String sql = "update ticket set resolution=? where ticketId=?";
			con = MySqlConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ticket.getResolution());
			ps.setInt(2, ticket.getTicketId());
			status = ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return status;
	}


}