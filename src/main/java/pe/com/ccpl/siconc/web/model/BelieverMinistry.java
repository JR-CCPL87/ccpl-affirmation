package pe.com.ccpl.siconc.web.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BELIEVER_MINISTRIES")
public class BelieverMinistry implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3630961808526108637L;

	@Id
	@ManyToOne
	@JoinColumn(name = "ministry_id")
	private Ministry ministry;

	@Id
	@ManyToOne
	@JoinColumn(name = "believer_id")
	private Believer believer;

	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "start_date")
	private String startDate;
	
	@Column(name = "end_date")
	private String endDate;
	
	@Column(name = "creation_user")
	private String creationUser;
	
	@Column(name = "last_update_user")
	private String lastUpdateUser;
	
	@Column(name = "creation_date")
	private String creationDate;
	
	@Column(name = "last_update_date")
	private String lastUpdateDate;

	public Ministry getMinistry() {
		return ministry;
	}

	public void setMinistry(Ministry ministry) {
		this.ministry = ministry;
	}

	public Believer getBeliever() {
		return believer;
	}

	public void setBeliever(Believer believer) {
		this.believer = believer;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
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
