package com.asd.demom.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


public class Tests {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Test2.class);

    @Configuration
    static class Test2{

        @Bean
        public String a(){
            return new String();
        }
    }

    @Test
    public void test(){
        ac.getBean("a");
    }


}
