package com.erdoganpacaci.controller.impl;

import com.erdoganpacaci.controller.RestAuthenticationController;
import com.erdoganpacaci.controller.RestBaseController;
import com.erdoganpacaci.controller.RootEntity;
import com.erdoganpacaci.dto.AuthRequest;
import com.erdoganpacaci.dto.AuthResponse;
import com.erdoganpacaci.dto.DtoUser;
import com.erdoganpacaci.dto.RefreshTokenRequest;
import com.erdoganpacaci.service.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAuthenticationControllerImpl extends RestBaseController implements RestAuthenticationController {


    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/register")
    @Override
    public RootEntity<DtoUser> register(@Valid @RequestBody AuthRequest input) {
        return ok(authenticationService.register(input));
    }

    @PostMapping("/authenticate")
    @Override
    public RootEntity<AuthResponse> authenticate(@Valid @RequestBody AuthRequest input) {
        return ok(authenticationService.authenticate(input));
    }

    @PostMapping("/refreshToken")
    @Override
    public RootEntity<AuthResponse> refreshToken(@Valid @RequestBody RefreshTokenRequest input) {
        return ok(authenticationService.refreshToken(input));
    }
}
