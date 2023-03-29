package enoca.enocaProject.businnes.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enoca.enocaProject.businnes.abstracts.EmployeeService;
import enoca.enocaProject.dataAccess.abstracts.EmployeeRepository;
import enoca.enocaProject.entities.concretes.Employee;

@Service
public class EmployeeManager implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAll() {

		return this.employeeRepository.findAll();

	}

	@Override
	public void add(Employee employee) {

		this.employeeRepository.save(employee);

	}

	@Override
	public void update(Employee employee) {
		this.employeeRepository.save(employee);
	}

	@Override
	public void delete(int id) {
		this.employeeRepository.deleteById(id);
	}

}
