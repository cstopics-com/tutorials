package com.expava.gpp.contentmanagement.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ArticleAspect {
	
	@Before("execution(* ArticleServiceImpl.getArticleById(..))")         //point-cut expression	
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("ArticleAspect - logBefore - " + joinPoint.getSignature().getName());
        return;
    }
	
	@Around("execution(* com.expava.gpp.contentmanagement.service.Article*.*(..))")         //point-cut expression	
    public Object monitor(ProceedingJoinPoint pjp) throws Throwable {
		long start = System.currentTimeMillis();
		try {
			return pjp.proceed();
		} finally {
			long duration = System.currentTimeMillis() - start;
			System.out.println("ArticleAspect - monitor - the call of the method " + pjp.getTarget().getClass().getName() + "."
					+ pjp.getSignature().getName() + " took " + duration + " ms");
		}
    }

}