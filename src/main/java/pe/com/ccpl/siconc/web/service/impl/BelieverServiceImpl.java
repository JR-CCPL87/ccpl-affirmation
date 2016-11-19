package pe.com.ccpl.siconc.web.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.ccpl.siconc.web.dao.BelieverDAO;
import pe.com.ccpl.siconc.web.model.Believer;
import pe.com.ccpl.siconc.web.service.BelieverService;

@Service
@Transactional
public class BelieverServiceImpl implements BelieverService {

	@Autowired
	private BelieverDAO userDAO;
	
	public Believer getUser(String username){
		return userDAO.getUser(username);
	}

	@Override
	public List<Believer> getBelievers() {
		return userDAO.getBelievers();
	}

	@Override
	public Integer saveBeliever(Believer believer) {
		return userDAO.saveBeliever(believer);
	}
}
