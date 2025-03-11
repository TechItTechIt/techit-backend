package com.techit.llm.testcontroller;

import com.techit.common.testservice.CommonTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestController {

    private final CommonTestService commonTestService;

    @GetMapping("/llm/test")
    public ResponseEntity<?> testPrint() {
        System.out.println("LLM");
        commonTestService.testPrint();
        return ResponseEntity.ok("LLM");
    }


}
