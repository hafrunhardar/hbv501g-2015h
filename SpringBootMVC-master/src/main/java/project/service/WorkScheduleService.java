package project.service;

import project.persistence.entities.WorkSchedule;

import java.util.List;

import org.springframework.stereotype.Service;

public interface WorkScheduleService {

    /**
     * Save a {@link PostitNote}
     * @param postitNote {@link PostitNote} to be saved
     * @return {@link PostitNote} that was saved
     */
	WorkSchedule save(WorkSchedule workSchedule);

    /**
     * Get all {@link PostitNote}s
     * @return A list of {@link PostitNote}s
     */
    List<WorkSchedule> findAll();

    /**
     * Find a {@link PostitNote} based on {@link Long id}
     * @param id {@link Long}
     * @return A {@link PostitNote} with {@link Long id}
     */
    WorkSchedule findOne(Long id);
    
}
