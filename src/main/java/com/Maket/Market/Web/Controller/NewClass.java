package com.Maket.Market.web.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("yo")
public class NewClass {
    @GetMapping("yo")
    public String a(){
        return "asdfa";
    }
}
