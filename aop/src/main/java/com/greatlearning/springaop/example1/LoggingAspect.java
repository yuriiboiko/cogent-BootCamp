package com.greatlearning.springaop.example1;

import java.util.logging.Logger;

public class LoggingAspect {
	
	private Logger logger=Logger.getLogger(LoggingAspect.class.getName());
	
	public void before()
	{
		logger.info("Enter method");
	}
	public void after()
	{
		logger.info("Exiting  method");
	}

}
