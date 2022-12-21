package tn.esprit.controllers;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.persistence.entity.Contrat;
import tn.esprit.persistence.entity.Departement;
import tn.esprit.services.interfaces.IDepartementService;

@RestController
public class DepartementController implements Serializable {
	
	@Autowired
	IDepartementService departementService;
	
	@GetMapping("retrieveAllDepartements")
	public List<Departement> retrieveAllDepartements() {
		return departementService.retrieveAllDepartements();
	}
	
	@GetMapping("retrieveDepartement/{idDepart}")
	public Departement retrieveDepartement(@PathVariable Integer idDepart) {
		return departementService.retrieveDepartement(idDepart);
	}
	
	@PostMapping("/addDepartement")
	public Departement addDepartement(@RequestBody Departement d) {
		return departementService.addDepartement(d);
	}
	
	@PutMapping("/updateDepartement")
	public Departement updateDepartement(@RequestBody Departement d) {
		return departementService.updateDepartement(d);
	}
	
	@DeleteMapping("/removeDepartement/{id}")
	public void removeDepartement(@PathVariable Integer id) {
		departementService.removeDepartement(id);
	}
	
	@GetMapping("/getDepartementByUniversiteId/{idUniv}")
	public List<Departement> getDepartementByUniversiteId(@PathVariable Integer idUniv){
		return departementService.retrieveDepartementsByUniversite(idUniv);
	}
	

}
