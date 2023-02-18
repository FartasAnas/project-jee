package com.project.randomordergenerator.feign;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KeycloakResponse {
    private  String access_token;
    private String refresh_token;
}

