package com.nahuelgallardo.jwt_auth_api.auth.service;

import com.nahuelgallardo.jwt_auth_api.auth.dto.request.AuthRequest;
import com.nahuelgallardo.jwt_auth_api.auth.dto.request.RegisterRequest;
import com.nahuelgallardo.jwt_auth_api.auth.dto.response.AuthResponse;

public interface IAuthService {
    void register(RegisterRequest request);
    AuthResponse login(AuthRequest request);
}
