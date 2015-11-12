package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.persistence.entities.Contact;
import project.persistence.repositories.ContactRepository;
import project.service.ContactService;

import java.util.List;

@Service
public class ContactServiceImplementation implements ContactService {

    // Instance Variables
	ContactRepository repository;

    // Dependency Injection
    @Autowired
    public ContactServiceImplementation(ContactRepository repository) {
        this.repository = repository;
    }

    @Override
    public Contact save(Contact contact) {
        return repository.save(contact);
    }

    @Override
    public List<Contact> findAll() {
        return repository.findAll();
    }

    @Override
    public Contact findOne(Long id) {
        return repository.findOne(id);
    }
}
