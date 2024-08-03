package com.dailycodebuffer.example.component;

import com.dailycodebuffer.example.config.ConfigPrefix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldComponent {

    Logger log = LoggerFactory.getLogger(HelloWorldComponent.class);


    @Value("${custom.property.message}")
    private String message;

    @Value("${custom.yaml.message}")
    private String yamlMessage;

    @Autowired
    private ConfigPrefix prefix;

    @Autowired
    private DBComponent dbComponent;

    public String sayHello() {
        log.debug("Debug from Application Component");
        log.trace("Trace from Application Component");
        log.error("Error from Application Component");
        log.info("Info from Application Components");
        dbComponent.performDbOperation();
        return message + " from " + prefix.getFirstName() + " " + prefix.getLastName();
    }

    public String sayHelloYaml() {
        return yamlMessage;
    }
}
