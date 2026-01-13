package com.example.Tamil_api.repository;

import com.example.Tamil_api.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}