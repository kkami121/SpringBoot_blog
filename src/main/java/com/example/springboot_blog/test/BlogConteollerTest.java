package com.example.springboot_blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 스프링이 com.example.springboot_blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는 것이 아닌
// 특정 어노테이션이 붙어있는 클래스 파일들을 new해서(IOC) 스프링 컨테이너에 관리해줌
public class BlogConteollerTest {

    //   http://localhost:8080/test/hello
    @GetMapping("test/hello")
    public String hello(){
        return "<h1> hello sping boot</h1>";
    }
}