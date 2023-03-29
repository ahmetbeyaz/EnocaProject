package enoca.enocaProject.businnes.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enoca.enocaProject.businnes.abstracts.CompanyService;
import enoca.enocaProject.dataAccess.abstracts.CompanyRepository;
import enoca.enocaProject.entities.concretes.Company;

@Service
public class CompanyManager implements CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public List<Company> getAll() {
		return  companyRepository.findAll() ;
	}

	@Override
	public void add(Company company) throws Exception {
		
		this.isNameEmpty(company);
		this.checkIfNameExists(company);
        companyRepository.save(company);		
	}

	@Override
	public void update(Company company) throws Exception {
		this.isNameEmpty(company);
		this.checkIfNameExists(company);
      companyRepository.save(company);		
	}

	@Override
	public void delete(int id) {
           companyRepository.deleteById(id);		
	}

	@Override
	public void isNameEmpty(Company company) throws Exception {
		if(company.getName().trim().isEmpty()|| company.getName().isBlank()) {
			throw new Exception("Şirket adı boş bırakılamaz");
		}
	}

	@Override
	public void checkIfNameExists(Company company) throws Exception {
         List<Company>  companyList=companyRepository.findAll();
         
         for( Company company2:companyList) {
        	 if(company2.getName().equalsIgnoreCase(company.getName())) {
        		 throw new Exception("Şirket isimleri aynı olamaz");
        	 }
        	 
         }
	}
	
	

}
