package com.nareshit.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="doctor")
public class Doctor extends User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private Integer dId;
	@ManyToOne
	private Admin admin;
	@OneToMany
	private Set<Nurse> nurses;
	@Override
	public String toString() {
		return "Doctor [dId=" + dId + ", admin=" + admin + ", nurses=" + nurses + ", patients=" + patients + "]";
	}
	@OneToMany
	private Set<Patient> patients;
	public Integer getdId() {
		return dId;
	}
	public void setdId(Integer dId) {
		this.dId = dId;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	public Set<Nurse> getNurses() {
		return nurses;
	}
	public void setNurses(Set<Nurse> nurses) {
		this.nurses = nurses;
	}
	public Set<Patient> getPatients() {
		return patients;
	}
	public void setPatients(Set<Patient> patients) {
		this.patients = patients;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((admin == null) ? 0 : admin.hashCode());
		result = prime * result + ((dId == null) ? 0 : dId.hashCode());
		result = prime * result + ((nurses == null) ? 0 : nurses.hashCode());
		result = prime * result + ((patients == null) ? 0 : patients.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (admin == null) {
			if (other.admin != null)
				return false;
		} else if (!admin.equals(other.admin))
			return false;
		if (dId == null) {
			if (other.dId != null)
				return false;
		} else if (!dId.equals(other.dId))
			return false;
		if (nurses == null) {
			if (other.nurses != null)
				return false;
		} else if (!nurses.equals(other.nurses))
			return false;
		if (patients == null) {
			if (other.patients != null)
				return false;
		} else if (!patients.equals(other.patients))
			return false;
		return true;
	}
}
