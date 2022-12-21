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
import tn.esprit.services.interfaces.IContratService;

@RestController
public class ContratController {
	
	@Autowired
	IContratService contratService;
	
	@GetMapping("retrieveAllContrats")
	public List<Contrat> retrieveAllContrats() {
		return contratService.retrieveAllContrats();
	}

	@GetMapping("/retrieveContrat/{id}")
	public Contrat retrieveContrat(@PathVariable Integer id) {
		return contratService.retrieveContrat(id);
	}

	@PostMapping("/addContrat")
	public Contrat addContrat(@RequestBody Contrat c) {
		return contratService.addContrat(c);
	}

	@PutMapping("/updateContrat")
	public Contrat updateContrat(@RequestBody Contrat c) {
		return contratService.updateContrat(c);
	}

	@DeleteMapping("/removeContrat/{id}")
	public void removeContrat(@PathVariable Integer id) {
		contratService.removeContrat(id);
	}
}
