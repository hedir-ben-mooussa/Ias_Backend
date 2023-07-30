package tn.ias.IasWebsite.Services;

import org.springframework.beans.factory.annotation.Autowired;

import tn.ias.IasWebsite.entities.User;
import tn.ias.IasWebsite.repository.UserRepository;

public class UserServiceImpl implements IUserService {

	@Autowired
	UserRepository userRep;
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRep.save(user);
	}
	
	
}
 