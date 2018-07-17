package com.example.demo.entity;

import java.sql.Timestamp;

import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;

@Entity
public class SexDiv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sexDivId;
	private String sexDivName;
	private Boolean isDisabled;
	private Timestamp createdAt;
	private String createdUser;
	private Timestamp updatedAt;
	private String updatedUser;
	// private Byte[] versionNo;

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

	// public Byte[] getVersionNo() {
	// return versionNo;
	// }
	//
	// public void setVersionNo(Byte[] versionNo) {
	// this.versionNo = versionNo;
	// }

}
