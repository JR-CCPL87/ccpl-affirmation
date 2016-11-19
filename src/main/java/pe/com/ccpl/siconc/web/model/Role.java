package pe.com.ccpl.siconc.web.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROLES")
public class Role  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1748735422288581669L;

	@Id
	@Column(name="role_id")
	@GeneratedValue
	private Integer roleId;
	
	@Column(name="name")
	private String name;

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
