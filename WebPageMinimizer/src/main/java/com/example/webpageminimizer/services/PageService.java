package com.example.webpageminimizer.services;

import com.example.webpageminimizer.Result;
import com.example.webpageminimizer.processors.PageMinimizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PageService {
    @Autowired
    PageMinimizer pageMinimizer;
    public Result convertString (String a) {
    return new Result(a, pageMinimizer.string1tostring2(a));
    }
}
