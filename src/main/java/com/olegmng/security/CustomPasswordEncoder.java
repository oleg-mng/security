package com.olegmng.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CustomPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        return String.valueOf(rawPassword);
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
//        return rawPassword.equals(encodedPassword);
//        пароли в db храняться в захэшированном виде поэтому сначала нужно применить encode()
        return encode(rawPassword).equals(encodedPassword);
    }
}
