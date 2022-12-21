package tn.esprit.services.interfaces;

import java.util.List;

import tn.esprit.persistence.entity.DetailEquipe;

public interface IDetailEquipeService {
	public List<DetailEquipe> retrieveAllDetailsEquipes();
	public DetailEquipe addDetailEquipe(DetailEquipe dE);
	public DetailEquipe updateDetailEquipe(DetailEquipe dE);
	public DetailEquipe retrieveDetailEquipe(Integer idDetailEquipe);
	public void removeDetailEquipe (Integer idDetailEquipe);
}
