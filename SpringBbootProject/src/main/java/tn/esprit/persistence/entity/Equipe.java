package tn.esprit.persistence.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
public class Equipe implements Serializable {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEquipe;
	private String nomEquipe;
	@Enumerated(EnumType.STRING)
	private Niveau niveau;
	@JsonIgnore
	@ManyToMany(mappedBy = "equipe")
	private List<Etudiant> etudiant;
	@JsonIgnore
	@OneToOne 
	DetailEquipe detailEquipe;
	
}
