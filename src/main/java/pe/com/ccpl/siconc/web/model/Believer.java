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
@Table(name="BELIEVERS")
public class Believer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8353013550768971676L;

	@Id
	@Column(name="believer_id")
	@GeneratedValue
	private Integer believerId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="names")
	private String names;
	
	@Column(name="father_name")
	private String fatherName;

	@Column(name="mother_name")
	private String motherName;
	
	@Column(name="marital_status")
	private String maritalStatus;
	
	@ManyToOne
	@JoinColumn(name="profile_id")
	private Profile profile;
	
	@Column(name="type")
	private Integer type;
	
	@Column(name="birth_date")
	private String birthDate;
	
	@Column(name="children_info")
	private String childrenInfo;
	
	@Column(name="address")
	private String address;
	
	@Column(name="home_phone")
	private String homePhone;
	
	@Column(name="cell_phone")
	private String cellPhone;
	
	@Column(name="email")
	private String email;
	
	@Column(name="born_again")
	private String bornAgain;
	
	@ManyToOne
	@JoinColumn(name = "invited_by")
	private Believer invitedBy;
	
	@Column(name="important_info")
	private String importantInfo;
	
	@ManyToOne
	@JoinColumn(name = "counselor")
	private Believer counselor;
	
	@ManyToOne
	@JoinColumn(name = "consolidator")
	private Believer consolidator;
	
	@Column(name="counsel_date")
	private String counselDate;
	
	@ManyToOne
	@JoinColumn(name = "network")
	private Network network;
	
	@Column(name="title")
	private Integer title;
	
	@ManyToOne
	@JoinColumn(name = "leader")
	private Believer leader;
	
	@Column(name="status")
	private Integer status;
	
	@OneToMany(mappedBy = "believer")
    private List<BelieverMinistry> ministries = new ArrayList<BelieverMinistry>();
	
	@Column(name = "creation_user")
	private String creationUser;

	@Column(name = "last_update_user")
	private String lastUpdateUser;

	@Column(name = "creation_date")
	private String creationDate;

	@Column(name = "last_update_date")
	private String lastUpdateDate;

	public Integer getBelieverId() {
		return believerId;
	}

	public void setBelieverId(Integer believerId) {
		this.believerId = believerId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getChildrenInfo() {
		return childrenInfo;
	}

	public void setChildrenInfo(String childrenInfo) {
		this.childrenInfo = childrenInfo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBornAgain() {
		return bornAgain;
	}

	public void setBornAgain(String bornAgain) {
		this.bornAgain = bornAgain;
	}

	public Believer getInvitedBy() {
		return invitedBy;
	}

	public void setInvitedBy(Believer invitedBy) {
		this.invitedBy = invitedBy;
	}

	public String getImportantInfo() {
		return importantInfo;
	}

	public void setImportantInfo(String importantInfo) {
		this.importantInfo = importantInfo;
	}

	public Believer getCounselor() {
		return counselor;
	}

	public void setCounselor(Believer counselor) {
		this.counselor = counselor;
	}

	public Believer getConsolidator() {
		return consolidator;
	}

	public void setConsolidator(Believer consolidator) {
		this.consolidator = consolidator;
	}

	public String getCounselDate() {
		return counselDate;
	}

	public void setCounselDate(String counselDate) {
		this.counselDate = counselDate;
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	public Integer getTitle() {
		return title;
	}

	public void setTitle(Integer title) {
		this.title = title;
	}

	public Believer getLeader() {
		return leader;
	}

	public void setLeader(Believer leader) {
		this.leader = leader;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public List<BelieverMinistry> getMinistries() {
		return ministries;
	}

	public void setMinistries(List<BelieverMinistry> ministries) {
		this.ministries = ministries;
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
