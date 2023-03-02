package com.managerbff.managerbff.controller;

import com.managerbff.managerbff.viewmodel.AuthInfo;
import java.security.Principal;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticateController {

  @GetMapping(path = "/authenticate/{flag}")
  public ResponseEntity<AuthInfo> login(@PathVariable String flag) {
    AuthInfo auth = new AuthInfo(flag, "hello@gmmail.com", "fighting");
    return ResponseEntity.ok(auth);
  }

  @GetMapping(path = "/authenticate/google")
  public Principal user(Principal principal) {
    return principal;
  }


}
