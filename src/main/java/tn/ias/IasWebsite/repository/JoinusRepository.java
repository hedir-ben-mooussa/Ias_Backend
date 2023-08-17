package tn.ias.IasWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.ias.IasWebsite.entities.Joinus;

@Repository
public interface JoinusRepository extends JpaRepository<Joinus, Integer> {

}
