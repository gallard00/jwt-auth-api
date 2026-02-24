package com.nahuelgallardo.jwt_auth_api.auth.service;

import com.nahuelgallardo.jwt_auth_api.auth.dto.request.AuthRequest;
import com.nahuelgallardo.jwt_auth_api.auth.dto.request.RegisterRequest;
import com.nahuelgallardo.jwt_auth_api.auth.dto.response.AuthResponse;
import com.nahuelgallardo.jwt_auth_api.auth.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements IAuthService{

    private final IUserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    @Override
    public void register(RegisterRequest request) {

    }

    @Override
    public AuthResponse login(AuthRequest request) {
        return null;
    }
}
