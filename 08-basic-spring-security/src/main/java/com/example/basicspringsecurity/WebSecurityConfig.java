package com.example.basicspringsecurity;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity // enable spring security web support
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    Logger logger = LoggerFactory.getLogger(WebSecurityConfig.class);

    /**
     * The configure(HttpSecurity) method defines which URL paths should be secured and which should not.
     * Specifically, the / and /home paths are configured to not require any authentication.
     * All other paths must be authenticated.
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/", "/home")
                    .permitAll()
                    .anyRequest()
                    .authenticated()
                    .and()
                .formLogin()
                    .loginPage("/login")
                    .permitAll()
                    .and()
                .logout()
                    .permitAll();
    }

    /**
     * The userDetailsService() method sets up an in-memory user store with a single user.
     * That user is given a user name of user, a password of password, and a role of USER.
     */
    @Bean
    @SuppressWarnings("ddeprecated")
    @Override
    public UserDetailsService userDetailsService() {
        UserDetails user1 = User.withUsername("lzd")
                .password(bcryptPasswordEncoder().encode("123"))
                .roles("USER")
                .build();

        UserDetails user2 = User.withUsername("lyc")
                .password(bcryptPasswordEncoder().encode("123"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user1, user2);
    }

    @Bean
    public PasswordEncoder bcryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
