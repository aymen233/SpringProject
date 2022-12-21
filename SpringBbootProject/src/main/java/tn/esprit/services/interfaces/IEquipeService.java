package tn.esprit.services.interfaces;

import java.util.List;

import tn.esprit.persistence.entity.Equipe;

public interface IEquipeService {

	public List<Equipe> retrieveAllEquipes();
	public Equipe addEquipe(Equipe e);
	public Equipe updateEquipe(Equipe e);
	public Equipe retrieveEquipe(Integer idEquipe);
	public void removeEquipe (Integer idEquipe);
}
