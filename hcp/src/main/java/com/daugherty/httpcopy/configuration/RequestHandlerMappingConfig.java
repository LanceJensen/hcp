package com.daugherty.httpcopy.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * RequestHandlerMappingConfig overrides the standard Spring Web MVC configuration by
 * changing the suffix pattern matching so that url path parameters will be passed through without
 * having the suffix stripped.
 * @author Lance.Jensen@Daugherty.com
 *
 */
@Configuration
public class RequestHandlerMappingConfig extends WebMvcConfigurationSupport  {

	
	@Override
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        final RequestMappingHandlerMapping mapping = super.requestMappingHandlerMapping();
        mapping.setUseSuffixPatternMatch(false);
        return mapping;
    }
}
