package tn.esprit.services.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.persistence.entity.DetailEquipe;
import tn.esprit.persistence.entity.Equipe;
import tn.esprit.persistence.repositories.EquipeRepository;
import tn.esprit.services.interfaces.IDetailEquipeService;
import tn.esprit.services.interfaces.IEquipeService;

@Service
public class EquipeService implements IEquipeService {
	@Autowired
	EquipeRepository equipeRepository;

	@Override
	public List<Equipe> retrieveAllEquipes() {
		return equipeRepository.findAll();
	}
	
	@Override
	public Equipe addEquipe(Equipe e) {
		return equipeRepository.save(e);
	}

	@Override
	public Equipe updateEquipe(Equipe e) {
		Equipe eq = new Equipe();
		eq.setNomEquipe(e.getNomEquipe());
		return equipeRepository.save(eq);
	}

	@Override
	public Equipe retrieveEquipe(Integer idEquipe) {
		return equipeRepository.findById(idEquipe).get();
	}

	@Override
	public void removeEquipe(Integer idEquipe) {
		equipeRepository.deleteById(idEquipe);
	}

	
	

}
