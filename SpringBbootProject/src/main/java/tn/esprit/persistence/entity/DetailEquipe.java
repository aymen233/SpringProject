package tn.esprit.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class DetailEquipe implements Serializable {
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	int idDetailEquipe;
	int salle;
	String thematique;
	@OneToOne (mappedBy="detailEquipe")
	Equipe equipe;
	
	
}
