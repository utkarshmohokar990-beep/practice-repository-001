package com.practice.zero;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log {
	private static final Logger logger = LogManager.getLogger(log.class);

	public static void main(String[] args) {
		logger.info("Application started");

		int a = 10;
		int b = 0;

		try {
			int result = a / b;
			logger.info("Result is: " + result);
		} catch (Exception e) {
			logger.error("Exception occurred while dividing numbers", e);
		}

		
		logger.info("Application finished");
	}
}
