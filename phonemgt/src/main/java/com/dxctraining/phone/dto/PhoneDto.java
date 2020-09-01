package com.dxctraining.phone.dto;

public class PhoneDto {
	private int id;

	private String name;

	private int storageSize;

	private int supplierId;


	public PhoneDto() {
	}

	public PhoneDto(int id, String name, int storageSize) {
		this.id = id;
		this.name = name;
		this.storageSize = storageSize;
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
	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public int getStorageSize() {
		return storageSize;
	}

	public void setStorageSize(int storageSize) {
		this.storageSize = storageSize;
	}

}
