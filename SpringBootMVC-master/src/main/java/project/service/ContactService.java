package project.service;

import project.persistence.entities.Contact;

import java.util.List;

import org.springframework.stereotype.Service;

public interface ContactService {

    /**
     * Save a {@link PostitNote}
     * @param postitNote {@link PostitNote} to be saved
     * @return {@link PostitNote} that was saved
     */
	Contact save(Contact contact);

    /**
     * Get all {@link PostitNote}s
     * @return A list of {@link PostitNote}s
     */
    List<Contact> findAll();

    /**
     * Find a {@link PostitNote} based on {@link Long id}
     * @param id {@link Long}
     * @return A {@link PostitNote} with {@link Long id}
     */
    Contact findOne(Long id);
    
}
