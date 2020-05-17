package com.expava.gpp.springcloud;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.expava.gpp.springcloud.zuul.ErrorFilter;
import com.expava.gpp.springcloud.zuul.PostFilter;
import com.expava.gpp.springcloud.zuul.PreFilter;
import com.expava.gpp.springcloud.zuul.RouteFilter;

@Configuration
public class ZuulConfiguration {

	@Bean
	public PreFilter preFilter() {
	    return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
	    return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
	    return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
	    return new RouteFilter();
	}
}
