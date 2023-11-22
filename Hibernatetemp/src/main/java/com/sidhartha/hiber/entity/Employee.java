package com.sidhartha.hiber.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	     @Id
	     @GeneratedValue(strategy = GenerationType.AUTO)
	     private int id;
	     
	     @Column
	     private String name;
	     
	     @Column
	     private String gender;
	     
	     @Column
	     private String address;
	     
	     @Column
	     private String phonenumber;

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(int id, String name, String gender, String address, String phonenumber) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.address = address;
			this.phonenumber = phonenumber;
		}

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

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhonenumber() {
			return phonenumber;
		}

		public void setPhonenumber(String phonenumber) {
			this.phonenumber = phonenumber;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address
					+ ", phonenumber=" + phonenumber + "]";
		}	
}