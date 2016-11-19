package pe.com.ccpl.siconc.web.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BELIEVER_BINNACLES")
public class BelieverBinnacle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8408966487734699606L;

	@Id
	@Column(name = "binnacle_id")
	@GeneratedValue
	private Integer binnacleId;
	
	@ManyToOne
	@JoinColumn(name = "believer_id")
	private Believer believer;

	@Column(name = "start_date")
	private String startDate;

	@Column(name = "close_date")
	private String closeDate;
	
	@Column(name = "type")
	private Integer type;
	
	@Column(name = "creation_user")
	private String creationUser;

	@Column(name = "last_update_user")
	private String lastUpdateUser;

	@Column(name = "creation_date")
	private String creationDate;

	@Column(name = "last_update_date")
	private String lastUpdateDate;

	public Integer getBinnacleId() {
		return binnacleId;
	}

	public void setBinnacleId(Integer binnacleId) {
		this.binnacleId = binnacleId;
	}

	public Believer getBeliever() {
		return believer;
	}

	public void setBeliever(Believer believer) {
		this.believer = believer;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(String closeDate) {
		this.closeDate = closeDate;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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
