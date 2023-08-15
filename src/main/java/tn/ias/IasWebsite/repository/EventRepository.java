package tn.ias.IasWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.ias.IasWebsite.entities.Event;


@Repository
public interface EventRepository extends JpaRepository<Event, Long> {


	

}
