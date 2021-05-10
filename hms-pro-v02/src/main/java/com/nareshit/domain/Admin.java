package com.nareshit.domain;

import java.io.Serializable;

import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="admin")
public class Admin extends User implements Serializable {
     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
     @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer aid;
     @OneToOne
     private Hospital hospital;
     @OneToMany
     private Set<Doctor> doctors;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public Hospital getHospital() {
		return hospital;
	}
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", hospital=" + hospital + ", doctor=" + doctors + "]";
	}
	public Set<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(Set<Doctor> doctors) {
		this.doctors = doctors;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((aid == null) ? 0 : aid.hashCode());
		result = prime * result + ((doctors == null) ? 0 : doctors.hashCode());
		result = prime * result + ((hospital == null) ? 0 : hospital.hashCode());
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
		Admin other = (Admin) obj;
		if (aid == null) {
			if (other.aid != null)
				return false;
		} else if (!aid.equals(other.aid))
			return false;
		if (doctors == null) {
			if (other.doctors != null)
				return false;
		} else if (!doctors.equals(other.doctors))
			return false;
		if (hospital == null) {
			if (other.hospital != null)
				return false;
		} else if (!hospital.equals(other.hospital))
			return false;
		return true;
	}
	
}
