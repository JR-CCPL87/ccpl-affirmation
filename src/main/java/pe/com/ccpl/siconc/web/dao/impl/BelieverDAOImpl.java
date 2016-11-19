package pe.com.ccpl.siconc.web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.ccpl.siconc.web.dao.BelieverDAO;
import pe.com.ccpl.siconc.web.model.Believer;

@Repository
public class BelieverDAOImpl implements BelieverDAO {

	@Autowired
	private SessionFactory sessionFactory;
	Logger logger = LoggerFactory.getLogger(BelieverDAOImpl.class);
	
	private Session openSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public Believer getUser(String username) {
		List<Believer> userList = new ArrayList<Believer>();
		try{
	        Query query = openSession().createQuery("from Believer u where u.username = :username");  
	        query.setParameter("username", username);  
	        userList = query.list();
		}
		catch(Exception ex){
			logger.error("Error",ex);
		}
        if (userList.size() > 0)  
            return userList.get(0);  
        else  
            return null;
	}

	@Override
	public List<Believer> getBelievers() {
		List<Believer> userList = new ArrayList<Believer>();
		try{
	        Query query = openSession().createQuery("from Believer u");  
	        //query.setParameter("username", username);  
	        userList = query.list();
		}
		catch(Exception ex){
			logger.error("Error",ex);
		}
        return userList;
	}

	@Override
	public Integer saveBeliever(Believer believer) {
		Session session=openSession();
		Integer result=new Integer(0);
		try{
			result=(Integer)session.save(believer);
		}
		catch(Exception ex){
			logger.error("Error",ex);
		}
		return result;
		
	}

}
