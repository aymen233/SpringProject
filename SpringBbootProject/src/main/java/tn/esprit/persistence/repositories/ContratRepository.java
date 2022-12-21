package tn.esprit.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.persistence.entity.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Integer> {

}
