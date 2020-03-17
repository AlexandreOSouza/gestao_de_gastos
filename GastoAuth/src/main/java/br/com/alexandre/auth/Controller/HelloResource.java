package br.com.alexandre.auth.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * HelloResource
 */
@RestController
public class HelloResource {

    @RequestMapping({ "/hello" })
    public String hello() {
        return "Hollo world";
    }
}