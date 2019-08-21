package spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages = "spring")
public class AppConfig {
public ResourceBundleMessageSource messageSource()
{
	ResourceBundleMessageSource resource=new ResourceBundleMessageSource();
	resource.setBasename("name");
	return resource;
}
}
