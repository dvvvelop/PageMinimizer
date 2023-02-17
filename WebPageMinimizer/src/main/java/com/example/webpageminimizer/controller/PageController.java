package com.example.webpageminimizer.controller;

import com.example.webpageminimizer.Result;
import com.example.webpageminimizer.services.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
    @Autowired
    PageService pageService;


    @GetMapping("/reducedPageNumbers")
    public Result convertString (@RequestParam("rawPageNumbers") String a){
    return pageService.convertString(a);
    }

}
