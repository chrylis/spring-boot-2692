package com.chrylis.sprboot2692;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorController {

    @RequestMapping("/{status}")
    public String errorPage(@PathVariable String status) {
        return "/" + status;
    }
}
