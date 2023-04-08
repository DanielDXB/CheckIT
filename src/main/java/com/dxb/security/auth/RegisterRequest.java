package com.dxb.security.auth;

import com.dxb.security.user.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String userFullName;
    private String userEmail;
    private String userPassword;
    private String userGroup;
    private Date userBirthDate;
    private Role role;
}
