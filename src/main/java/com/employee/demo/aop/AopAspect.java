package com.employee.demo.aop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Configuration
@Component
public class AopAspect {
	
	private static final Logger LOGGER = LogManager.getLogger(AopAspect.class.getName());

	@Before("execution(* com.employee.demo.empservices.EmpService.*(..))")
	public void beforeMethods(JoinPoint joinPoint) {
		
		LOGGER.info(" execute Employee Details ");
		LOGGER.info(joinPoint.getSignature().getName());
		
	}
	
	@After("execution(* com.employee.demo.empservices.EmpService.*(..))")
	public void afterMethods(JoinPoint joinPoint) {
		
		LOGGER.info(" Finished execution of Employee Details ");
		LOGGER.info(joinPoint.getSignature().getName());
		
	}
}
