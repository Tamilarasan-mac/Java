package com.example.Tamil_api.controller;

import com.example.Tamil_api.model.Contact;
import com.example.Tamil_api.servicelayer.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public Contact create(@RequestBody Contact contact) {
        return service.save(contact);
    }

    // READ ALL
    @GetMapping
    public List<Contact> getAll() {
        return service.findAll();
    }

    // READ BY ID
    @GetMapping("/{id}")
    public Contact getById(@PathVariable Long id) {
        return service.findById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Contact update(@PathVariable Long id, @RequestBody Contact contact) {
        contact.setId(id);
        return service.update(contact);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}