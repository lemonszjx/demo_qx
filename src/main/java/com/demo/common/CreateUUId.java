package com.demo.common;

import java.util.UUID;

public class CreateUUId {

	public static String getUUId() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
}
