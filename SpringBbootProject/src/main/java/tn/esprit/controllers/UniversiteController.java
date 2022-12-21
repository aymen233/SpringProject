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

import tn.esprit.persistence.entity.Universite;
import tn.esprit.services.interfaces.IUniversiteService;

@RestController
public class UniversiteController {

	@Autowired
	IUniversiteService universiteService;

	@GetMapping("retrieveAllUniversities")
	public List<Universite> retrieveAllUniversities() {
		return universiteService.retrieveAllUniversities();
	}

	@GetMapping("/retrieveUniversity/{id}")
	public Universite retrieveUniversity(@PathVariable Integer id) {
		return universiteService.retrieveUniversity(id);
	}

	@PostMapping("/addUniversity")
	public Universite addUniversity(@RequestBody Universite e) {
		return universiteService.addUniversity(e);
	}

	@PutMapping("/updateUniversity")
	public Universite updateUniversity(@RequestBody Universite e) {
		return universiteService.updateUniversity(e);
	}

	@DeleteMapping("/removeUniversity/{id}")
	public void removeUniversity(@PathVariable Integer id) {
		universiteService.removeUniversity(id);
	}
}
