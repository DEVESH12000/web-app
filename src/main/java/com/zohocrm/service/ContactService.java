package com.zohocrm.service;

import java.util.List;

import com.zohocrm.entites.Contact;

public interface ContactService {
public void saveContact(Contact contact);

List<Contact>  getContacts();

public Contact getContactById(long id);

	
}