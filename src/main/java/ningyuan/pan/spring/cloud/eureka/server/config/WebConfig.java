/**
 * 
 */
package ningyuan.pan.spring.cloud.eureka.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * @author ningyuan
 *
 */
@Configuration
public class WebConfig extends WebSecurityConfigurerAdapter{
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		super.configure(http);
		http.csrf().disable();
    }
}
