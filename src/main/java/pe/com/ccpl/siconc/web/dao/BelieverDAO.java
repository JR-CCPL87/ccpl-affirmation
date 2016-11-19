package pe.com.ccpl.siconc.web.dao;

import java.util.List;

import pe.com.ccpl.siconc.web.model.Believer;

public interface BelieverDAO {

	Believer getUser(String username);
	
	List<Believer> getBelievers();
	
	Integer saveBeliever(Believer believer);
	
}
