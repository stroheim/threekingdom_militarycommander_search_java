package com.example.demo.entity;

import java.sql.Timestamp;

import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;

@Entity
public class MilitaryCommander {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer militaryCommanderId;
	private String militaryCommanderName;
	private String phonetic;
	private Integer sexDivId;
	private String sexDivName;
	private Integer birthYear;

	private Integer deathYear;
	private Integer leadership;
	private Integer militaryForce;
	private Integer intellect;
	private Integer politics;
	private Boolean isDynastyWarriorsAppeared;
	private Integer displayOrder;
	private Boolean isDisabled;
	private Timestamp createdAt;
	private String createdUser;
	private Timestamp updatedAt;
	private String updatedUser;

	// private Byte[] versionNo;
	public Integer getMilitaryCommanderId() {
		return militaryCommanderId;
	}

	public void setMilitaryCommanderId(Integer militaryCommanderId) {
		this.militaryCommanderId = militaryCommanderId;
	}

	public String getMilitaryCommanderName() {
		return militaryCommanderName;
	}

	public void setMilitaryCommanderName(String militaryCommanderName) {
		this.militaryCommanderName = militaryCommanderName;
	}

	public String getPhonetic() {
		return phonetic;
	}

	public void setPhonetic(String phonetic) {
		this.phonetic = phonetic;
	}

	public Integer getSexDivId() {
		return sexDivId;
	}

	public void setSexDivId(Integer sexDivId) {
		this.sexDivId = sexDivId;
	}

	public String getSexDivName() {
		return sexDivName;
	}

	public void setSexDivName(String sexDivName) {
		this.sexDivName = sexDivName;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public Integer getDeathYear() {
		return deathYear;
	}

	public void setDeathYear(Integer deathYear) {
		this.deathYear = deathYear;
	}

	public Integer getLeadership() {
		return leadership;
	}

	public void setLeadership(Integer leadership) {
		this.leadership = leadership;
	}

	public Integer getMilitaryForce() {
		return militaryForce;
	}

	public void setMilitaryForce(Integer militaryForce) {
		this.militaryForce = militaryForce;
	}

	public Integer getIntellect() {
		return intellect;
	}

	public void setIntellect(Integer intellect) {
		this.intellect = intellect;
	}

	public Integer getPolitics() {
		return politics;
	}

	public void setPolitics(Integer politics) {
		this.politics = politics;
	}

	public Boolean getIsDynastyWarriorsAppeared() {
		return isDynastyWarriorsAppeared;
	}

	public void setIsDynastyWarriorsAppeared(Boolean isDynastyWarriorsAppeared) {
		this.isDynastyWarriorsAppeared = isDynastyWarriorsAppeared;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public Boolean getIsDisabled() {
		return isDisabled;
	}

	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUpdatedUser() {
		return updatedUser;
	}

	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}

}
