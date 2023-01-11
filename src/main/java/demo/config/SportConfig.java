package demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//tell spring this is a configuration
@Configuration
//tell spring to scan package and find all classes that copy @component and register in spring container
@ComponentScan("demo")
public class SportConfig {
}
