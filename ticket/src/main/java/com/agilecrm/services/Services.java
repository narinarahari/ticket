package com.agilecrm.services;

import java.sql.SQLException;
import java.util.List;
import com.agilecrm.model.Ticket;

public interface Services {
	
	public int addTicket(Ticket ticket) throws SQLException, ClassNotFoundException;
	public int updateTicket(Ticket ticket) throws ClassNotFoundException, SQLException;
	public int updateResolution(Ticket ticket) throws ClassNotFoundException, SQLException;
	public List<Ticket> listTickets() throws SQLException;
	public List<Ticket> getTicketById(Ticket ticket) throws SQLException, ClassNotFoundException;
	public boolean deleteContact(Ticket ticket);


}