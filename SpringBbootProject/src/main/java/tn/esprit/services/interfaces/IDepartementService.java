package tn.esprit.services.interfaces;

import java.util.List;

import tn.esprit.persistence.entity.Departement;

public interface IDepartementService {

	public List<Departement> retrieveAllDepartements();
	public Departement addDepartement(Departement d);
	public Departement updateDepartement(Departement d);
	public Departement retrieveDepartement(Integer idDepart);
	public void removeDepartement (Integer idDepart);
	public Departement assignUniversityToDepartement(Integer idUniversite, Integer idDepartement);
	public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite);
}
