package tn.esprit.services.classes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.persistence.entity.Contrat;
import tn.esprit.persistence.entity.Etudiant;
import tn.esprit.persistence.repositories.ContratRepository;
import tn.esprit.persistence.repositories.EtudiantRepository;
import tn.esprit.services.interfaces.IContratService;

@Service
public class ContratService implements IContratService {

	@Autowired
	ContratRepository contratRepository;
	@Autowired
	EtudiantRepository etudiantRepository;

	@Override
	public List<Contrat> retrieveAllContrats() {
		return contratRepository.findAll();
	}

	@Override
	public Contrat addContrat(Contrat c) {
		return contratRepository.save(c);
	}

	@Override
	public Contrat updateContrat(Contrat c) {
		Contrat cnt = new Contrat();
		cnt.setIdContrat(c.getIdContrat());
		return contratRepository.save(cnt);
	}

	@Override
	public Contrat retrieveContrat(Integer idContrat) {
		return contratRepository.findById(idContrat).get();
	}

	@Override
	public void removeContrat(Integer idContrat) {
		contratRepository.deleteById(idContrat);
	}

	@Override
	public Contrat assignContratToEtudiant(Contrat ce, String nomE, String prenomE) {
		Etudiant et = etudiantRepository.findByNomE(nomE);
		ce.setEtudiant(et);
		return ce;
	}

}
