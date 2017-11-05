package org.jacoco.examples.maven.java;

public class HelloWorld {
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello this is the Universe!";
		} else {
			return "Hello World!";
		}
	}

}
