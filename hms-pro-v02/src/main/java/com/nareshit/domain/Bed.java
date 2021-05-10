package com.nareshit.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="bed")
public class Bed implements Serializable {
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
   @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer  bId;
   @Column(nullable=false)
   @OneToOne
   private Patient patient;
public Integer getbId() {
	return bId;
}
public void setbId(Integer bId) {
	this.bId = bId;
}
public Patient getPatient() {
	return patient;
}
public void setPatient(Patient patient) {
	this.patient = patient;
}
@Override
public String toString() {
	return "Bed [bId=" + bId + ", patient=" + patient + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((bId == null) ? 0 : bId.hashCode());
	result = prime * result + ((patient == null) ? 0 : patient.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Bed other = (Bed) obj;
	if (bId == null) {
		if (other.bId != null)
			return false;
	} else if (!bId.equals(other.bId))
		return false;
	if (patient == null) {
		if (other.patient != null)
			return false;
	} else if (!patient.equals(other.patient))
		return false;
	return true;
}

}
