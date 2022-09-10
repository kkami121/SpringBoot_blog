package com.example.springboot_blog.test;

import org.springframework.web.bind.annotation.*;

// 사용자가 요청 -> 응답(HTML 파일)
// @Controller

// 사용자가 요청 -> 응답(Data)
@RestController
public class HttpControllerTest {

    @GetMapping("/http/get") // id=1&username=abc&password=1234&email=kkami121@naver.com 등 postman에서 요청시 적어서 보냄
    public String getTest(Member m){ // Member 클래스에 만들어서 한번에 받는다.
        return "get 요청 " +m.getId()+ ", " + m.getUsername() + ", " +m.getPassword()+ ", " + m.getEmail();
    }

    @PostMapping("/http/post") // 자동으로 파싱해서 오브젝트에 넣어줌 (MessageConverter가 해줌) => get에서 오브젝트에 쿼리스트링을 맵핑해주는 것도 포함
    public String postTest(@RequestBody Member m) { // application/json 형식으로 받기 위해서는 입력을 json형식으로
        return "post 요청 " +m.getId()+ ", " + m.getUsername() + ", " +m.getPassword()+ ", " + m.getEmail();
    }

    @PutMapping("/http/put")
    public String putTest(){
        return "put 요청";
    }

    @DeleteMapping("/http/delete")
    public String deleteTest(){
        return "delete 요청";
    }
}
