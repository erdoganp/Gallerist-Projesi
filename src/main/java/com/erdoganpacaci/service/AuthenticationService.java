package com.erdoganpacaci.service;

import com.erdoganpacaci.dto.AuthRequest;
import com.erdoganpacaci.dto.AuthResponse;
import com.erdoganpacaci.dto.DtoUser;
import com.erdoganpacaci.dto.RefreshTokenRequest;

public interface AuthenticationService {


    public DtoUser register(AuthRequest input);

    public AuthResponse authenticate(AuthRequest input);

    public AuthResponse refreshToken(RefreshTokenRequest input);
}
