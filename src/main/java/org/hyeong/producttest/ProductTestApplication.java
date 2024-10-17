package org.hyeong.producttest;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Log4j2
public class ProductTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductTestApplication.class, args);
    }
    // 새로운 REST 컨트롤러를 추가해보자
    @RestController
    @RequestMapping("/product")
    public class ProductController {

        // 간단한 GET 요청에 대한 응답을 반환
        @GetMapping("/hello")
        public String sayHello() {
            return "안녕하세요~~~~~~~~~~~~~~~~~!";
        }
    }

}
