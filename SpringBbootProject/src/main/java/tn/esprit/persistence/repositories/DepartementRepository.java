package tn.esprit.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.persistence.entity.Departement;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Integer> {
	
	//public List<Departement> getDepartementByUniversiteIdUniv(int idUniversity);

}
