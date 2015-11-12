package project.service;

import project.persistence.entities.Training;

import java.util.List;

import org.springframework.stereotype.Service;

public interface TrainingService {

    /**
     * Save a {@link PostitNote}
     * @param postitNote {@link PostitNote} to be saved
     * @return {@link PostitNote} that was saved
     */
	Training save(Training training);

    /**
     * Get all {@link PostitNote}s
     * @return A list of {@link PostitNote}s
     */
    List<Training> findAll();

    /**
     * Find a {@link PostitNote} based on {@link Long id}
     * @param id {@link Long}
     * @return A {@link PostitNote} with {@link Long id}
     */
    Training findOne(Long id);
    
}
