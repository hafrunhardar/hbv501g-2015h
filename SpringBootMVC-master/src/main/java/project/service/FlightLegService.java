package project.service;

import project.persistence.entities.FlightLeg;

import java.util.List;

import org.springframework.stereotype.Service;

public interface FlightLegService {

    /**
     * Save a {@link PostitNote}
     * @param postitNote {@link PostitNote} to be saved
     * @return {@link PostitNote} that was saved
     */
	FlightLeg save(FlightLeg flightLeg);

    /**
     * Get all {@link PostitNote}s
     * @return A list of {@link PostitNote}s
     */
    List<FlightLeg> findAll();

    /**
     * Find a {@link PostitNote} based on {@link Long id}
     * @param id {@link Long}
     * @return A {@link PostitNote} with {@link Long id}
     */
    FlightLeg findOne(Long id);
    
}
