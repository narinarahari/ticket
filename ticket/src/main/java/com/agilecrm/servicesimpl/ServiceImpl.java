package com.agilecrm.servicesimpl;

import java.sql.SQLException;
import java.util.List;

import com.agilecrm.dao.Dao;
import com.agilecrm.daoimpl.DaoImpl;
import com.agilecrm.model.Ticket;
import com.agilecrm.services.Services;

public class ServiceImpl implements Services {
	Dao dao = new DaoImpl();

	public int addTicket(Ticket ticket) throws SQLException, ClassNotFoundException {
		return dao.addTicket(ticket);
	}
	/* public int updateContact(Contact contact) {
		return dao.updateContact(contact);
	}
	public List<Contact> listContacts() throws SQLException {
		return dao.listContacts();
	}
	public List<Contact> getContactById(Contact contact) throws SQLException, ClassNotFoundException {
		return dao.getContactById(contact);
	}
	public boolean deleteContact(Contact contact) {
		return dao.deleteContact(contact);
	}
	*/

	@Override
	public int updateTicket(Ticket ticket) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return dao.updateTicket(ticket);
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
	public int updateResolution(Ticket ticket) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
}