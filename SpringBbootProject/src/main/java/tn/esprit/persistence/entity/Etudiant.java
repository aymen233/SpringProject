package tn.esprit.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {

	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idEtudiant;
	private String prenomE;
	private String nomE;
	@Enumerated (EnumType.STRING)
	private Option op;
	@ManyToOne 
	private Departement departement;
	@ManyToMany
	private List<Equipe> equipe;
	@OneToMany (mappedBy="etudiant")
	private List<Contrat> contrat;
	
	
}
