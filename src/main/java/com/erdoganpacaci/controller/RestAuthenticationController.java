package com.erdoganpacaci.controller;

import com.erdoganpacaci.dto.AuthRequest;
import com.erdoganpacaci.dto.AuthResponse;
import com.erdoganpacaci.dto.DtoUser;
import com.erdoganpacaci.dto.RefreshTokenRequest;
import com.erdoganpacaci.model.RefreshToken;

public interface RestAuthenticationController {

    public RootEntity<DtoUser> register(AuthRequest input);

    public RootEntity<AuthResponse> authenticate( AuthRequest input);

    public RootEntity<AuthResponse> refreshToken(RefreshTokenRequest input);

}
