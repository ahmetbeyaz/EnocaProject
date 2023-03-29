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

import enoca.enocaProject.businnes.abstracts.CompanyService;
import enoca.enocaProject.entities.concretes.Company;

@RestController
@RequestMapping("/api/companies")
public class CompaniesController {

	@Autowired
	private CompanyService companyService;

	@GetMapping("/getAll")
	public List<Company> getAll() {
		return this.companyService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody Company company) throws Exception {

		this.companyService.add(company);
	}

	@PutMapping("/update")
	public void update(@RequestBody() Company company) throws Exception {

		this.companyService.update(company);
	}

	@DeleteMapping("{id}")
	public void delete(@PathVariable int id) {
		this.companyService.delete(id);
	}

}
