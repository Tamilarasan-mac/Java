package com.example.Tamil_api.servicelayer;

import com.example.Tamil_api.model.Contact;
import com.example.Tamil_api.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private final ContactRepository repository;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public Contact save(Contact contact) {
        return repository.save(contact);
    }

    // READ ALL
    public List<Contact> findAll() {
        return repository.findAll();
    }

    // READ BY ID
    public Contact findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found with id " + id));
    }

    // UPDATE
    public Contact update(Contact contact) {
        return repository.save(contact);
    }

    // DELETE
    public void delete(Long id) {
        repository.deleteById(id);
    }
}