package tn.esprit.services.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.persistence.entity.Universite;
import tn.esprit.persistence.repositories.UniversiteRepository;
import tn.esprit.services.interfaces.IUniversiteService;

@Service
public class UniversiteService implements IUniversiteService {

	@Autowired
	UniversiteRepository universiteRepository;

	@Override
	public List<Universite> retrieveAllUniversities() {
		return universiteRepository.findAll();
	}

	@Override
	public Universite addUniversity(Universite u) {
		return universiteRepository.save(u);
	}

	@Override
	public Universite updateUniversity(Universite u) {
		Universite uni = new Universite();
		uni.setNomUniv(u.getNomUniv());
		return universiteRepository.save(uni);
	}

	@Override
	public Universite retrieveUniversity(Integer idUniv) {
		return universiteRepository.findById(idUniv).get();
	}

	@Override
	public void removeUniversity(Integer idUniv) {
		universiteRepository.deleteById(idUniv);
	}
}
