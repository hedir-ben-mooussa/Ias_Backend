package tn.ias.IasWebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.ias.IasWebsite.entities.Joinus;
import tn.ias.IasWebsite.repository.JoinusRepository;

@Service
public class JoinusServiceImpl implements JoinusService {
	@Autowired
	JoinusRepository joinusRepo;

	@Override
	public Joinus create(Joinus joinus) {
		
		return joinusRepo.save(joinus);
	}

	@Override
	public List<Joinus> getallJoinus() {
		
		return joinusRepo.findAll();
	}

	@Override
	public void deleteJoinus(Integer id) {
		joinusRepo.deleteById(id);
		
	}

	@Override
	public Joinus updateJoinus(Integer id, Joinus joinus) {
		// TODO Auto-generated method stub
		return null;
	}

}
