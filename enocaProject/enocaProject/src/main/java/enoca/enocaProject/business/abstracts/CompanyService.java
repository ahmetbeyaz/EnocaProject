package enoca.enocaProject.business.abstracts;

import java.util.List;

import enoca.enocaProject.entities.concretes.Company;

public interface CompanyService {
	List<Company> getAll();

	void add(Company company) throws Exception;

	void update(Company company) throws Exception;

	void delete(int id);

	void isNameEmpty(Company company) throws Exception;

	void checkIfNameExists(Company company) throws Exception;

}
