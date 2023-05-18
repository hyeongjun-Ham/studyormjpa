package com.study.p6spy;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final TestService testService;

    @GetMapping("/")
    public void test(){
        String name = "test";
        testService.testSave(name);

    }

}
