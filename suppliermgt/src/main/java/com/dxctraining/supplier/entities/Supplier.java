package com.dxctraining.supplier.entities;

import javax.persistence.*;


@Entity
@Table(name = "employees")
public class Supplier {

	@Id
	@GeneratedValue
	public int id;

	private String name;
	
	private String password;

	public Supplier(String name,String password) {
		this.name = name;
		this.password=password;
	}

	public Supplier() {

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
	 @Override
	    public int hashCode() {
	        return id;
	    }

	  @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }
	        Supplier that = (Supplier) obj;
	        return id == that.id;
	    }

	   }
