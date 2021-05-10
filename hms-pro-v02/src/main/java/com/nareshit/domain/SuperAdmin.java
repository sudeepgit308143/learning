package com.nareshit.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="superadmin")
public class SuperAdmin extends User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer sid;
	@OneToMany
	private Set<Hospital> hospitals;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public Set<Hospital> getHospitals() {
		return hospitals;
	}
	public void setHospitals(Set<Hospital> hospitals) {
		this.hospitals = hospitals;
	}
	@Override
	public String toString() {
		return "SuperAdmin [sid=" + sid + ", hospitals=" + hospitals + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((hospitals == null) ? 0 : hospitals.hashCode());
		result = prime * result + ((sid == null) ? 0 : sid.hashCode());
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
		SuperAdmin other = (SuperAdmin) obj;
		if (hospitals == null) {
			if (other.hospitals != null)
				return false;
		} else if (!hospitals.equals(other.hospitals))
			return false;
		if (sid == null) {
			if (other.sid != null)
				return false;
		} else if (!sid.equals(other.sid))
			return false;
		return true;
	}

}
