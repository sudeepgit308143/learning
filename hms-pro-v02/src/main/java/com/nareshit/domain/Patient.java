package com.nareshit.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="patient")
public class Patient extends User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
  private Integer pId;
	@ManyToOne
	private Doctor doctor;
	@OneToMany
	private Set<Nurse> nurses;
	@OneToOne
	private Bed bed;
	@ManyToOne
	private PatientType patienttype;
	
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public Set<Nurse> getNurses() {
		return nurses;
	}
	public void setNurses(Set<Nurse> nurses) {
		this.nurses = nurses;
	}
	
}
