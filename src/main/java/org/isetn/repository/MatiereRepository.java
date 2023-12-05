package org.isetn.repository;

import org.isetn.entities.Matiere;
import org.isetn.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MatiereRepository extends JpaRepository<Matiere, Long> {
	
}
