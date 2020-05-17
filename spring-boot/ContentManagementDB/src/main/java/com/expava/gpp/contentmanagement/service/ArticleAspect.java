package com.expava.gpp.contentmanagement.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ArticleAspect {
	
	@Before("execution(* ArticleServiceImpl.getArticleById(..))")         //point-cut expression	
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("ArticleService:getArticleById:logBefore:: " + joinPoint.getSignature().getName());
        return;
    }
}