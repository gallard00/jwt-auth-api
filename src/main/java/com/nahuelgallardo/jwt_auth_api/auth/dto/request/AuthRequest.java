package com.nahuelgallardo.jwt_auth_api.auth.dto.request;

import lombok.Data;

@Data
public class AuthRequest {
    private String email;
    private String password;
}
