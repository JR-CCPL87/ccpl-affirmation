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
@Table(name = "BINNACLE_EVENTS")
public class BinnacleEvent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8435545897324312899L;

	@Id
	@Column(name = "event_id")
	@GeneratedValue
	private Integer eventId;

	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "binnacle_id")
	private BelieverBinnacle binnacle;
	
	@Column(name = "creation_user")
	private String creationUser;

	@Column(name = "last_update_user")
	private String lastUpdateUser;

	@Column(name = "creation_date")
	private String creationDate;

	@Column(name = "last_update_date")
	private String lastUpdateDate;

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BelieverBinnacle getBinnacle() {
		return binnacle;
	}

	public void setBinnacle(BelieverBinnacle binnacle) {
		this.binnacle = binnacle;
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
