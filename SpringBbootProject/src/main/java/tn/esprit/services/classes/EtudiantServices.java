package tn.esprit.services.classes;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.persistence.entity.Contrat;
import tn.esprit.persistence.entity.Departement;
import tn.esprit.persistence.entity.Equipe;
import tn.esprit.persistence.entity.Etudiant;
import tn.esprit.persistence.repositories.ContratRepository;
import tn.esprit.persistence.repositories.DepartementRepository;
import tn.esprit.persistence.repositories.EquipeRepository;
import tn.esprit.persistence.repositories.EtudiantRepository;
import tn.esprit.services.interfaces.IEtudiantService;


@Service
public class EtudiantServices implements IEtudiantService {
	@Autowired
	EtudiantRepository etudiantRepository;
	@Autowired
	DepartementRepository departementRepository;
	@Autowired
	ContratRepository contratRepository;
	@Autowired
	EquipeRepository equipeRepository;

	
	@Override
	public List<Etudiant> retrieveAllEtudiants() {
		return etudiantRepository.findAll();
	}

	@Override
	public Etudiant addEtudiant(Etudiant o) {
		return etudiantRepository.save(o);
	}

	@Override
	public Etudiant updateEtudiant(Etudiant o) {
		return etudiantRepository.save(o);
		
	}

	@Override
	public Etudiant retrieveEtudiant(Integer idEtudiant) {
		return etudiantRepository.findById(idEtudiant).get();

	}

	@Override
	public void removeEtudiant(Integer idEtudiant) {
		etudiantRepository.deleteById(idEtudiant);
		
	}

	@Transactional
	@Override
	public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
		Etudiant etud = etudiantRepository.findById(etudiantId).orElse(null);
		Departement depart =  departementRepository.findById(departementId).orElse(null);
		etud.setDepartement(depart);
		
	}
	
	@Transactional
	@Override
	public Etudiant addAssignEtudiantToEquipeAndContrat(Etudiant e, Integer idContrat, Integer idEquipe) {
		Contrat c = contratRepository.findById(idContrat).orElse(null);
		Equipe eq = equipeRepository.findById(idEquipe).orElse(null);
		c.setEtudiant(e);
		eq.getEtudiant().add(e);
		return e;
	}

	@Override
	public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement) {
		return  etudiantRepository.getEtudiantByDepartementIdDepart(idDepartement);
	}
	
}