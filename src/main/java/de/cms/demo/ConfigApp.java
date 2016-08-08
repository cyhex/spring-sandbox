package de.cms.demo;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.charset.Charset;

@Configuration
@PropertySource({"classpath:properies/application.properties", "classpath:properies/application.${env:local}.properties"})
public class ConfigApp {

    @Autowired
    private Environment env;

    @Value("classpath:text.txt")
    private Resource textFile;


    @Bean
    Service getService() throws IOException {
        Service service = new Service();
        String s = IOUtils.toString(textFile.getInputStream(), Charset.forName("UTF-8"));
        service.setXxx(s);
        return service;
    }

}
