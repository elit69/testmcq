package com.mcq.app.helper;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DebugHelper {
	public static String toJson(Object obj){
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void printJson(Object obj){
		System.out.println("###############################################");
		System.out.println("####"+obj.getClass());
		System.out.println(toJson(obj));
		System.out.println("###############################################");
	}
}
