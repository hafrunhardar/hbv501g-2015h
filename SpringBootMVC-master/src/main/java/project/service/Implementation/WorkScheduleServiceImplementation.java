package project.service.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.persistence.entities.WorkSchedule;
import project.persistence.repositories.WorkScheduleRepository;
import project.service.WorkScheduleService;

import java.util.List;

@Service
public class WorkScheduleServiceImplementation implements WorkScheduleService {

    // Instance Variables
	WorkScheduleRepository repository;

    // Dependency Injection
    @Autowired
    public WorkScheduleServiceImplementation(WorkScheduleRepository repository) {
        this.repository = repository;
    }

    @Override
    public WorkSchedule save(WorkSchedule workSchedule) {
        return repository.save(workSchedule);
    }

    @Override
    public List<WorkSchedule> findAll() {
        return repository.findAll();
    }

    @Override
    public WorkSchedule findOne(Long id) {
        return repository.findOne(id);
    }
}
