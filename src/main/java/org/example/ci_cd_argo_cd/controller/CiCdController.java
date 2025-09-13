package org.example.ci_cd_argo_cd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ci-cd/")
public class CiCdController {
    @GetMapping
    public ResponseEntity<String> helloController(){
        return ResponseEntity.ok("Auto sync working");
    }
}
