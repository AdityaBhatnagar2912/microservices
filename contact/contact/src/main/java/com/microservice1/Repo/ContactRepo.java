package com.microservice1.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice1.Entity.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer>{

}
