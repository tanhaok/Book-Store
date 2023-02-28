package com.managerbff.managerbff.controller;

import com.managerbff.managerbff.viewmodel.AuthInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authenticate")
public class ManagerBffController {

  @GetMapping("/google")
  public ResponseEntity<AuthInfo> login(){
    AuthInfo auth = new AuthInfo("Hello", "hello@gmmail.com", "fighting");
    return ResponseEntity.ok(auth);
  }

}
