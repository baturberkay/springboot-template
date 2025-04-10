package com.template.springboottemplate.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Tag(name = "Springboot-template API", description = "API to verify the application has started successfully")
@RequestMapping("/api/v1/springboot-template")
public class SpringbootTemplateController {

  @GetMapping("/hello")
  public ResponseEntity<String> getTemplateExample() {
    return new ResponseEntity<>("Successful response", HttpStatus.OK);
  }
}
