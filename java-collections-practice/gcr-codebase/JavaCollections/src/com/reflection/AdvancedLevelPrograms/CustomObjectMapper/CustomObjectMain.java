package com.reflection.AdvancedLevelPrograms.CustomObjectMapper;
import java.util.*;

public class CustomObjectMain {
	public static void main(String[] args) {
		Map<String, Object> map = Map.of("name", "Harshal", "age", 22);
		User user = ObjectMapperUtil.toObject(User.class, map);
		System.out.println(user);

	}
}
