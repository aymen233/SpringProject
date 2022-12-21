package tn.esprit.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.persistence.entity.DetailEquipe;

@Repository
public interface DetailEquipeRepository extends JpaRepository<DetailEquipe, Integer>{

}
