package com.project.socializingApp.dataLayer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserUpdateDetails {
    private String userName;
    private String email;
    private String oldPassword;
    private String newPassword;
}
