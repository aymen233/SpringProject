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

import tn.esprit.persistence.entity.Contrat;
import tn.esprit.persistence.entity.Departement;
import tn.esprit.persistence.entity.DetailEquipe;
import tn.esprit.services.interfaces.IContratService;
import tn.esprit.services.interfaces.IDetailEquipeService;

@RestController
public class DetailEquipeController {

	@Autowired
	IDetailEquipeService detailEquipeService;
	
	@GetMapping("retrieveAllDetailsEquipes")
	public List<DetailEquipe> retrieveAllDetailsEquipes() {
		return detailEquipeService.retrieveAllDetailsEquipes();
	}

	@GetMapping("/retrieveDetailEquipe/{id}")
	public DetailEquipe retrieveDetailEquipe(@PathVariable Integer id) {
		return detailEquipeService.retrieveDetailEquipe(id);
	}

	@PostMapping("/addDetailEquipe")
	public DetailEquipe addDetailEquipe(@RequestBody DetailEquipe d) {
		return detailEquipeService.addDetailEquipe(d);
	}

	@PutMapping("/updateDetailEquipe")
	public DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe d) {
		return detailEquipeService.updateDetailEquipe(d);
	}

	@DeleteMapping("/removeDetailEquipe/{id}")
	public void removeDetailEquipe(@PathVariable Integer id) {
		detailEquipeService.removeDetailEquipe(id);
	}
}
