package tn.ias.IasWebsite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.ias.IasWebsite.entities.Comment;


@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> { 

}
