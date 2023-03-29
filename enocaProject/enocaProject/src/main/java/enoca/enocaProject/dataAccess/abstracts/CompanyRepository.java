package enoca.enocaProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import enoca.enocaProject.entities.concretes.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
