package org.acme.service;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author WuF
 * @date 2022/10/9
 * @ApiNote
 * @time 15:58
 */
@ApplicationScoped
public class HelloService {
   public String hello() {
        return "Hello!";
    }
}
