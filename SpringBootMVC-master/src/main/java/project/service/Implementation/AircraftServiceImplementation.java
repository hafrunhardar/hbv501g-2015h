package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.persistence.entities.Aircraft;
import project.persistence.repositories.AircraftRepository;
import project.service.AircraftService;

import java.util.List;

@Service
public class AircraftServiceImplementation implements AircraftService {

    // Instance Variables
    AircraftRepository repository;

    // Dependency Injection
    @Autowired
    public AircraftServiceImplementation(AircraftRepository repository) {
        this.repository = repository;
    }

    @Override
    public Aircraft save(Aircraft aircraft) {
        return repository.save(aircraft);
    }

    @Override
    public List<Aircraft> findAll() {
        return repository.findAll();
    }

    @Override
    public Aircraft findOne(Long id) {
        return repository.findOne(id);
    }
}
