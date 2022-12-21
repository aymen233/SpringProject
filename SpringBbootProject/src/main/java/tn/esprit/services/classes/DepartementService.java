package tn.esprit.services.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.persistence.entity.Departement;
import tn.esprit.persistence.entity.Universite;
import tn.esprit.persistence.repositories.DepartementRepository;
import tn.esprit.persistence.repositories.UniversiteRepository;
import tn.esprit.services.interfaces.IDepartementService;

@Service
public class DepartementService implements IDepartementService {

	@Autowired
	DepartementRepository departementRepository;
	@Autowired
	UniversiteRepository universityRepository;

	@Override
	public List<Departement> retrieveAllDepartements() {
		return departementRepository.findAll();
	}

	@Override
	public Departement addDepartement(Departement d) {
		return departementRepository.save(d);
	}

	@Override
	public Departement updateDepartement(Departement d) {
		Departement dep = new Departement();
		dep.setIdDepart(d.getIdDepart());
		return departementRepository.save(dep);
	}

	@Override
	public Departement retrieveDepartement(Integer idDepart) {
		return departementRepository.findById(idDepart).get();
	}

	@Override
	public void removeDepartement(Integer idDepart) {
		 departementRepository.deleteById(idDepart);
	}

	@Override
	public Departement assignUniversityToDepartement(Integer idUniversite, Integer idDepartement) {
		Departement dept = departementRepository.getById(idDepartement);
		Universite univ = universityRepository.getById(idUniversite);
		dept.setUniversite(univ);
		return null;
	}

	@Override
	public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
		return null;
	}
	
}
