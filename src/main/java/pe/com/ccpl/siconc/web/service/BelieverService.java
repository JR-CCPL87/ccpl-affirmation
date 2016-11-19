package pe.com.ccpl.siconc.web.service;

import java.util.List;

import pe.com.ccpl.siconc.web.model.Believer;

public interface BelieverService {

	public Believer getUser(String username);
	public List<Believer> getBelievers();
	public Integer saveBeliever(Believer believer);
}
