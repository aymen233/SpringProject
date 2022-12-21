package tn.esprit.persistence.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.persistence.entity.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer>{

	List<Etudiant> getEtudiantByDepartementIdDepart(int idDepart);
	
	Etudiant  findByNomE(String nomE);
	
}
