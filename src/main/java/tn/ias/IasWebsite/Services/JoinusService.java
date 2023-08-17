package tn.ias.IasWebsite.services;

import java.util.List;

import tn.ias.IasWebsite.entities.Joinus;

public interface JoinusService {
	public Joinus create(Joinus joinus);
	public List<Joinus> getallJoinus();
	public void deleteJoinus (Integer id);
	public Joinus updateJoinus(Integer id,Joinus joinus);

}
