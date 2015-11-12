package project.service;

import project.persistence.entities.Employee;

import java.util.List;

import org.springframework.stereotype.Service;

public interface EmployeeService {

    /**
     * Save a {@link PostitNote}
     * @param postitNote {@link PostitNote} to be saved
     * @return {@link PostitNote} that was saved
     */
	Employee save(Employee employee);

    /**
     * Get all {@link PostitNote}s
     * @return A list of {@link PostitNote}s
     */
    List<Employee> findAll();

    /**
     * Find a {@link PostitNote} based on {@link Long id}
     * @param id {@link Long}
     * @return A {@link PostitNote} with {@link Long id}
     */
    Employee findOne(Long id);
   
}
