package com.chrylis.sprboot2692;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/throw")
public class ThrowController {

    @RequestMapping("/runtime")
    public String throwRuntimeException() {
        throw new RuntimeException();
    }

    @RequestMapping("/customWith")
    public String throwCustomExceptionWith() {
        throw new CustomExceptionWithAnnotation();
    }
    @RequestMapping("/customWithout")
    public String throwCustomExceptionWithout() {
        throw new CustomExceptionWithoutAnnotation();
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public static class CustomExceptionWithAnnotation extends RuntimeException {
        private static final long serialVersionUID = 1L;
    }

    public static class CustomExceptionWithoutAnnotation extends RuntimeException {
        private static final long serialVersionUID = 1L;
    }
}
