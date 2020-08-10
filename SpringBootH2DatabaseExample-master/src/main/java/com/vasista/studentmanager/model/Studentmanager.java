package com.vasista.studentmanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Studentmanager {

	    @Id
	    @GeneratedValue
	    private int id;
	    private String name;
	    private String discription;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getdiscription() {
			return discription;
		}
		public void setdiscription(String discription) {
			this.discription = discription;
		}
}
