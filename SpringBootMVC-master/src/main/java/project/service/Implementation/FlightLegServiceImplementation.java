package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.persistence.entities.FlightLeg;
import project.persistence.repositories.FlightLegRepository;
import project.service.FlightLegService;

import java.util.List;

@Service
public class FlightLegServiceImplementation implements FlightLegService {

    // Instance Variables
	FlightLegRepository repository;

    // Dependency Injection
    @Autowired
    public FlightLegServiceImplementation(FlightLegRepository repository) {
        this.repository = repository;
    }

    @Override
    public FlightLeg save(FlightLeg flightLeg) {
        return repository.save(flightLeg);
    }

    @Override
    public List<FlightLeg> findAll() {
        return repository.findAll();
    }

    @Override
    public FlightLeg findOne(Long id) {
        return repository.findOne(id);
    }
}
