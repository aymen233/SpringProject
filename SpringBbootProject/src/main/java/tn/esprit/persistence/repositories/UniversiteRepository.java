package tn.esprit.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.persistence.entity.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Integer> {

}
