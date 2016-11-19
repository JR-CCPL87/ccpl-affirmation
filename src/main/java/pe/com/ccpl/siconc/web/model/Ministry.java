package pe.com.ccpl.siconc.web.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "MINISTRIES")
public class Ministry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7874380477779504891L;

	@Id
	@Column(name = "ministry_id")
	@GeneratedValue
	private Integer ministryId;

	@Column(name = "name")
	private String name;
	
	@Column(name = "status")
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "leader")
	private Believer leader;
	
	@Column(name = "creation_user")
	private String creationUser;

	@Column(name = "last_update_user")
	private String lastUpdateUser;

	@Column(name = "creation_date")
	private String creationDate;

	@Column(name = "last_update_date")
	private String lastUpdateDate;
	
	@OneToMany(mappedBy = "ministry")
    private List<BelieverMinistry> believers = new ArrayList<BelieverMinistry>();

	public List<BelieverMinistry> getBelievers() {
		return believers;
	}

	public void setBelievers(List<BelieverMinistry> believers) {
		this.believers = believers;
	}

	public Integer getMinistryId() {
		return ministryId;
	}

	public void setMinistryId(Integer ministryId) {
		this.ministryId = ministryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Believer getLeader() {
		return leader;
	}

	public void setLeader(Believer leader) {
		this.leader = leader;
	}

	public String getCreationUser() {
		return creationUser;
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
