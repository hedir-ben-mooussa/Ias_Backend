package tn.ias.IasWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.ias.IasWebsite.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
