/**
 * 
 */
package ningyuan.pan.spring.cloud.eureka.server.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * @author ningyuan
 *
 */
@EnableEurekaServer
@Configuration
@EnableAutoConfiguration
@ComponentScan
@Import({WebConfig.class})
public class ApplicationConfig {

}
