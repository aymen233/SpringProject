package tn.esprit.services.interfaces;

import java.util.List;

import tn.esprit.persistence.entity.Universite;

public interface IUniversiteService {

	public List<Universite> retrieveAllUniversities();
	public Universite addUniversity(Universite u);
	public Universite updateUniversity(Universite u);
	public Universite retrieveUniversity(Integer idUniv);
	public void removeUniversity (Integer idUniv);
}
