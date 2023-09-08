package livingfantasy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests()
                .anyRequest().authenticated()
               /* .antMatchers("/register").permitAll()
                .antMatchers("/getStudentRoles").hasAuthority("ROLE_WRITE")*/
                .and()
                .httpBasic();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {

        //return new BCryptPasswordEncoder();
        return NoOpPasswordEncoder.getInstance();
    }

}