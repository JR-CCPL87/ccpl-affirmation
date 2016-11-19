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
@Table(name = "NETWORKS")
public class Network implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7750673295654036631L;

	@Id
	@Column(name = "network_id")
	@GeneratedValue
	private Integer networkId;

	@Column(name = "name")
	private String name;

	@Column(name = "network_info")
	private String networkInfo;

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

	public Integer getNetworkId() {
		return networkId;
	}

	public void setNetworkId(Integer networkId) {
		this.networkId = networkId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNetworkInfo() {
		return networkInfo;
	}

	public void setNetworkInfo(String networkInfo) {
		this.networkInfo = networkInfo;
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
