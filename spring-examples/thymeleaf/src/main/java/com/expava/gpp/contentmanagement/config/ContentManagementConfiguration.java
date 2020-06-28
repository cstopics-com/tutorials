package com.expava.gpp.contentmanagement.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.expava.gpp.contentmanagement.formatter.NameFormatter;
import com.expava.gpp.contentmanagement.service.UserService;
import com.expava.gpp.contentmanagement.service.UserServiceImpl;

@Configuration
@EnableWebMvc
public class ContentManagementConfiguration implements WebMvcConfigurer {

	@Bean
	public UserService userService() {
		return new UserServiceImpl();
	}
	
	@Bean(name = "messageSource")
    public MessageSource getMessageResource() {
        ReloadableResourceBundleMessageSource messageResource = new ReloadableResourceBundleMessageSource();
        messageResource.setBasename("classpath:messages");
        messageResource.setDefaultEncoding("UTF-8");
        return messageResource;
    }
	
	@Override
    @Description("Custom Conversion Service")
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new NameFormatter());
    }
}
