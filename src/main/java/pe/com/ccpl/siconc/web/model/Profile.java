package pe.com.ccpl.siconc.web.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="PROFILES")
public class Profile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4428643265685130256L;

	@Id
	@Column(name="profile_id")
	@GeneratedValue
	private Integer profileId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="creation_user")
	private String creationUser;
	
	@Column(name="last_update_user")
	private String lastUpdateUser;
	
	@Column(name="creation_date")
	private String creationDate;
	
	@Column(name="last_update_date")
	private String lastUpdateDate;
	
	@ManyToMany(cascade= {CascadeType.ALL})
	@JoinTable(name="PROFILES_ROLES", joinColumns={@JoinColumn(name="profile_id")}, inverseJoinColumns={@JoinColumn(name="role_id")})
	private List<Role> roles=new ArrayList<Role>();
	
	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreationUser() {
		return creationUser;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public void setCreationUser(String creationUser) {
		this.creationUser = creationUser;
	}

	public String getLastUpdateUser() {
		return lastUpdateUser;
	}

	public void setLastUpdateUser(String lastUpdateUser) {
		this.lastUpdateUser = lastUpdateUser;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(String lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	
}
