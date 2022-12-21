package tn.esprit.services.interfaces;

import java.util.List;

import tn.esprit.persistence.entity.Etudiant;

public interface IEtudiantService {
	
	public List<Etudiant> retrieveAllEtudiants();
	public Etudiant addEtudiant(Etudiant o);
	public Etudiant updateEtudiant(Etudiant o);
	public Etudiant retrieveEtudiant(Integer idEtudiant);
	public void removeEtudiant (Integer idEtudiant);
	public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId);
	public Etudiant addAssignEtudiantToEquipeAndContrat(Etudiant e, Integer idContrat, Integer idEquipe);
	public List<Etudiant> getEtudiantsByDepartement(Integer idDepartement);
}
