package com.microservice1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice1.Entity.Contact;
import com.microservice1.Service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
@Autowired
ContactService cs;

@GetMapping("/")
public List<Contact> get(){
	return cs.get();
}
@PostMapping("/")
public List<Contact> post(@RequestBody Contact c){
	return cs.post(c);
}
@PutMapping("/")
public List<Contact> put(@RequestBody Contact c){
	return cs.put(c);
}
@DeleteMapping("/")
public List<Contact> delete(@PathVariable int id){
	return cs.delete(id);
}

}
