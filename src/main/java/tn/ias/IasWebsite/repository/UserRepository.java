package tn.ias.IasWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.ias.IasWebsite.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
