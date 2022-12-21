package tn.esprit.services.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.persistence.entity.DetailEquipe;
import tn.esprit.persistence.repositories.DetailEquipeRepository;
import tn.esprit.services.interfaces.IDetailEquipeService;

@Service
public class DetailEquipeService implements IDetailEquipeService {

	@Autowired
	DetailEquipeRepository detailEquipeRepository;

	@Override
	public List<DetailEquipe> retrieveAllDetailsEquipes() {
		return detailEquipeRepository.findAll();
	}

	@Override
	public DetailEquipe addDetailEquipe(DetailEquipe dE) {
		return detailEquipeRepository.save(dE);
	}

	@Override
	public DetailEquipe updateDetailEquipe(DetailEquipe dE) {
		DetailEquipe dEq = new DetailEquipe();
		dEq.setIdDetailEquipe(dE.getIdDetailEquipe());
		return detailEquipeRepository.save(dEq);
	}

	@Override
	public DetailEquipe retrieveDetailEquipe(Integer idDetailEquipe) {
		return detailEquipeRepository.findById(idDetailEquipe).get();
	}

	@Override
	public void removeDetailEquipe(Integer idDetailEquipe) {
		detailEquipeRepository.deleteById(idDetailEquipe);
	}
}
