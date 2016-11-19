package pe.com.ccpl.siconc.web.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.com.ccpl.siconc.web.dao.RoleDAO;
import pe.com.ccpl.siconc.web.model.Role;

@Repository
public class RoleDAOImpl implements RoleDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	private Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public Role getRole(int id) {
		Role role= (Role) getCurrentSession().load(Role.class,id);
		return role;
	}

}
