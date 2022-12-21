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

import tn.esprit.persistence.entity.DetailEquipe;
import tn.esprit.persistence.entity.Equipe;
import tn.esprit.services.interfaces.IDetailEquipeService;
import tn.esprit.services.interfaces.IEquipeService;

@RestController
public class EquipeController {

	@Autowired
	IEquipeService equipeService;
	
	@GetMapping("retrieveAllEquipes")
	public List<Equipe> retrieveAllEquipes() {
		return equipeService.retrieveAllEquipes();
	}

	@GetMapping("/retrieveEquipe/{id}")
	public Equipe retrieveEquipe(@PathVariable Integer id) {
		return equipeService.retrieveEquipe(id);
	}

	@PostMapping("/addEquipe")
	public Equipe addEquipe(@RequestBody Equipe e) {
		return equipeService.addEquipe(e);
	}

	@PutMapping("/updateEquipe")
	public Equipe updateEquipe(@RequestBody Equipe e) {
		return equipeService.updateEquipe(e);
	}

	@DeleteMapping("/removeEquipe/{id}")
	public void removeEquipe(@PathVariable Integer id) {
		equipeService.removeEquipe(id);
	}
}
