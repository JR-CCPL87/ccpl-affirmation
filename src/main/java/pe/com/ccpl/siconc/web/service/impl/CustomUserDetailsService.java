package pe.com.ccpl.siconc.web.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.ccpl.siconc.web.dao.BelieverDAO;
import pe.com.ccpl.siconc.web.model.Believer;
import pe.com.ccpl.siconc.web.model.Role;

@Service
@Transactional(readOnly=true)
public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private BelieverDAO userDAO;	

	public UserDetails loadUserByUsername(String login)
			throws UsernameNotFoundException {
		
		Believer domainUser = userDAO.getUser(login);
		
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;

		return new User(
				domainUser.getUsername(), 
				domainUser.getPassword(), 
				enabled, 
				accountNonExpired, 
				credentialsNonExpired, 
				accountNonLocked,
				getAuthorities(domainUser.getProfile().getRoles())
		);
	}
	
	public Collection<? extends GrantedAuthority> getAuthorities(List<Role> roles) {
		List<GrantedAuthority> authList = getGrantedAuthorities(getRoles(roles));
		return authList;
	}
	
	public List<String> getRoles(List<Role> roles) {

		List<String> springRoles = new ArrayList<String>();

		if (roles!=null){
			for (Role role:roles){
				if (role.getRoleId().intValue() == 1) {
					springRoles.add("ROLE_ADMIN");
				} else if (role.getRoleId().intValue() == 2) {
					springRoles.add("ROLE_MODERATOR");
				}	
			}
		}
		
		return springRoles;
	}
	
	public static List<GrantedAuthority> getGrantedAuthorities(List<String> roles) {
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		for (String role : roles) {
			authorities.add(new SimpleGrantedAuthority(role));
		}
		return authorities;
	}

}