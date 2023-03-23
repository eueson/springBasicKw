package com.eueson.springmvc.annotation.componentscan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanAnnoTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentScanAnno.class);
        String[] definitions = applicationContext.getBeanDefinitionNames();
        for(String definition: definitions) {
            System.out.println(definition);
        }
    }
}
