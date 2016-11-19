package pe.com.ccpl.siconc.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.ccpl.siconc.web.dao.RoleDAO;
import pe.com.ccpl.siconc.web.model.Role;
import pe.com.ccpl.siconc.web.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDAO roleDAO;
	
	public Role getRole(int id){
		return roleDAO.getRole(id);
	}
	
}
