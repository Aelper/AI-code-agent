package com.zeko.codeagent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
public class CodeAgentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeAgentApplication.class, args);
    }

}
