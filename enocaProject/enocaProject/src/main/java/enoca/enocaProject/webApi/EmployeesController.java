package enoca.enocaProject.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import enoca.enocaProject.businnes.abstracts.EmployeeService;
import enoca.enocaProject.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeesController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	
	
	@GetMapping("getAll")
	public List<Employee>  getAll(){
	return	this.employeeService.getAll();
	}
	
	
	@PostMapping("/add")
	public  void add(@RequestBody() Employee employee) {
		
		this.employeeService.add(employee);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody() Employee employee) {
		
		this.employeeService.update(employee);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable int id) {
		
		this.employeeService.delete(id);
	}

}
