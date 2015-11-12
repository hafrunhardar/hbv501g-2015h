package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.persistence.entities.Training;
import project.persistence.repositories.TrainingRepository;
import project.service.TrainingService;

import java.util.List;

@Service
public class TrainingServiceImplementation implements TrainingService {

    // Instance Variables
	TrainingRepository repository;

    // Dependency Injection
    @Autowired
    public TrainingServiceImplementation(TrainingRepository repository) {
        this.repository = repository;
    }

    @Override
    public Training save(Training training) {
        return repository.save(training);
    }

    @Override
    public List<Training> findAll() {
        return repository.findAll();
    }

    @Override
    public Training findOne(Long id) {
        return repository.findOne(id);
    }
}
