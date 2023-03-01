package com.managerbff.managerbff.controller;

import com.managerbff.managerbff.viewmodel.AuthInfo;
import java.security.Principal;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticateController {

  @GetMapping(path = "/authenticate")
  public ResponseEntity<AuthInfo> login(){
    AuthInfo auth = new AuthInfo("Hello", "hello@gmmail.com", "fighting");
    return ResponseEntity.ok(auth);
  }

  @GetMapping(path = "/authenticate/google")
  public Principal user(Principal principal) {
    return principal;
  }


}
