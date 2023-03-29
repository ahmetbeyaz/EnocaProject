package enoca.enocaProject.businnes.abstracts;

import java.util.List;

import enoca.enocaProject.entities.concretes.Employee;

public interface EmployeeService {

	List<Employee> getAll();

	void add(Employee employee);

	void update(Employee employee);

	void delete(int id);

}
