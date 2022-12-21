package tn.esprit.services.interfaces;

import java.util.List;

import tn.esprit.persistence.entity.Contrat;


public interface IContratService {

	public List<Contrat> retrieveAllContrats();
	public Contrat addContrat(Contrat c);
	public Contrat updateContrat(Contrat c);
	public Contrat retrieveContrat(Integer idContrat);
	public void removeContrat (Integer idContrat);
	public Contrat assignContratToEtudiant (Contrat ce,String nomE ,String prenomE);
}
