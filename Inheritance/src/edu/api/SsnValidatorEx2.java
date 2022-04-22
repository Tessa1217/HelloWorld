package edu.api;

import java.time.LocalDateTime;
import java.util.Date;

public class SsnValidatorEx2 {

	public static void main(String[] args) {
		String ssn = "961219-2444444";
		ssn = ssn.replace("-", "");
		System.out.println(ssn);
		String year = ssn.substring(0, 2);
		System.out.println(year);

	}

}
