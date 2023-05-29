package com.zohocrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entites.Contact;
import com.zohocrm.entites.Lead;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
