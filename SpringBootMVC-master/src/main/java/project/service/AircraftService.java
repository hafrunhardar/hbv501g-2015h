package project.service;

import project.persistence.entities.Aircraft;

import java.util.List;

import org.springframework.stereotype.Service;

public interface AircraftService {

    /**
     * Save a {@link PostitNote}
     * @param postitNote {@link PostitNote} to be saved
     * @return {@link PostitNote} that was saved
     */
    Aircraft save(Aircraft aircraft);

    /**
     * Delete {@link PostitNote}
     * @param postitNote {@link PostitNote} to be deleted
     */
    void delete(Aircraft aircraft);

    /**
     * Get all {@link PostitNote}s
     * @return A list of {@link PostitNote}s
     */
    List<Aircraft> findAll();


    /**
     * Find a {@link PostitNote} based on {@link Long id}
     * @param id {@link Long}
     * @return A {@link PostitNote} with {@link Long id}
     */
    Aircraft findOne(Long id);



}