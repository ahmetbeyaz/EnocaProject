	package enoca.enocaProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import enoca.enocaProject.entities.concretes.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
