package com.study.crypto;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {

	public static void main(String[] args) throws Exception {
		String encoded = new BCryptPasswordEncoder().encode("1234");
		System.out.println(encoded);
		
		boolean check = false;
		check = new BCryptPasswordEncoder().matches("1234", "$2a$10$.ycNwHrQU/mDRLWRq.t1LeiV8kiVOav2cmYJDJa2cmiWVLWuBEc92");
		System.out.println(check);
		check = new BCryptPasswordEncoder().matches("1234", "$2a$10$npRSBzQIxQqiqsrOTmS0X.OsA3bdxyzC2ZZ2IdeRMnmiwyE/ynyZO");
		System.out.println(check);
	}

}
