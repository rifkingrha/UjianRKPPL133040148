package com.artivisi.quickstart.log4j;

import org.apache.log4j.Logger;

public class Ujian {
	

static Logger logger = Logger.getLogger(Ujian.class);

	public static void main(String[] args) {
		
		String param = "Contoh Log4j";

		logger.debug("Ini adalah debug message : " + param);
		logger.info("Ini adalah info message : " + param);
		logger.warn("Ini adalah fatal message : " + param);
		logger.error("Ini adalah warn message : " + param);
		logger.fatal("Ini adalah error message : " + param);

	}
}