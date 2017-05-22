package com.serlization;

import java.io.Serializable;

public class SerTest implements Serializable{

	byte[] name;

	public byte[] getName() {
		return name;
	}

	public void setName(byte[] name) {
		this.name = name;
	}
	
}
