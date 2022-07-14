package com.microservice1.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.microservice1.Entity.Contact;
import com.microservice1.Repo.ContactRepo;
import com.microservice1.Service.ContactService;

public class ContactServiceImp implements ContactService{
@Autowired
ContactRepo cr;
	@Override
	public List<Contact> get() {
		return cr.findAll();
	}

	@Override
	public List<Contact> post(Contact c) {
		cr.save(c);
		return cr.findAll();
	}

	@Override
	public List<Contact> put(Contact c) {
		cr.save(c);
		return cr.findAll();
	}

	@Override
	public List<Contact> delete(int id) {
		cr.deleteById(id);
		return cr.findAll();
	}

}
