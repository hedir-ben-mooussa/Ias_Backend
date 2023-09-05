package tn.ias.IasWebsite.services;

import java.util.List;



import tn.ias.IasWebsite.entities.User;

public interface UserService {
	
	public User create(User user);
	public List<User> getAllUsers();
	public void DeleteUser(Long id);
	public User updateUser(Long id,User user);
	public boolean login(String email  , String password );
	
}
