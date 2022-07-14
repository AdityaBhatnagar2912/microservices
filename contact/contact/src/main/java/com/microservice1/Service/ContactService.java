package com.microservice1.Service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservice1.Entity.Contact;

public interface ContactService {

	public List<Contact> get();
	public List<Contact> post(@RequestBody Contact c);
	public List<Contact> put(@RequestBody Contact c);
	public List<Contact> delete(@PathVariable int id);
	
}
