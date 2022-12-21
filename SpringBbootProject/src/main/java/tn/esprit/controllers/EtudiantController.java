package tn.esprit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.persistence.entity.Etudiant;
import tn.esprit.services.interfaces.IEtudiantService;

@RestController
public class EtudiantController {
	
	@Autowired
	IEtudiantService etudiantService;
	
	@GetMapping("/retrieveAllEtudiants")
	public List<Etudiant> retrieveAllEtudiants() {
		return etudiantService.retrieveAllEtudiants();
	}
	
	@GetMapping("/retrieveEtudiant/{id}")
	public Etudiant retrieveEtudiant(@PathVariable Integer id) {
		return etudiantService.retrieveEtudiant(id);
	}
	
	@PostMapping("/addEtudiant")
	public Etudiant addEtudiant(@RequestBody Etudiant o) {
		return etudiantService.addEtudiant(o);
	}
	
	@PutMapping("/updateEtudiant") 
	public Etudiant updateEtudiant(@RequestBody Etudiant o) {
		return etudiantService.updateEtudiant(o);
	}
	
	@DeleteMapping("/removeEtudiant/{id}")
	public void removeEtudiant (@PathVariable Integer id) {
		etudiantService.removeEtudiant(id);
	}
	
	@GetMapping("/getEtudiantsByDepartement/{idDepartement}")
	public List<Etudiant> getEtudiantsByDepartement(@PathVariable Integer idDepartement){
		return etudiantService.getEtudiantsByDepartement(idDepartement);
	}
	@PostMapping("/assignEtudiantToDepartement/{etudiantId}/{departementId}")
	public void assignEtudiantToDepartement(@PathVariable Integer etudiantId, @PathVariable Integer departementId) {
		etudiantService.assignEtudiantToDepartement(etudiantId, departementId);
	}
	@PostMapping("/addAssignEtudiantToEquipeAndContrat/{idContrat}/{idEquipe}")
	public Etudiant addAssignEtudiantToEquipeAndContrat(@RequestBody Etudiant e, @PathVariable Integer idContrat, @PathVariable Integer idEquipe) {
		return etudiantService.addAssignEtudiantToEquipeAndContrat(e, idContrat, idEquipe);
	}
	
	


}
