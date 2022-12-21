package tn.esprit.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.persistence.entity.Equipe;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Integer> {

}
