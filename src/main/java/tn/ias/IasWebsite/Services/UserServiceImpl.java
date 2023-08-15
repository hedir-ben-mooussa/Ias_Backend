package tn.ias.IasWebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.ias.IasWebsite.entities.User;
import tn.ias.IasWebsite.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepo;

	@Override
	public User create(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public void DeleteUser(Long id) {
		userRepo.deleteById(id);
		
	}

	@Override
	public User updateUser(Long id, User user) {	
		return null;
	}

}
