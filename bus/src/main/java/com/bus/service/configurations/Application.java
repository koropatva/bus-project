package com.bus.service.configurations;

import java.sql.SQLException;

import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.bus.service")
@PropertySource("classpath:/application.properties")
@ImportResource({ "classpath:/META-INF/spring/spring-context.xml" })
public class Application {

	@Bean(initMethod = "start", destroyMethod = "stop")
	Server createServer() {
		Server server = null;
		try {
			server = Server.createTcpServer("-tcp", "-tcpAllowOthers",
					"-tcpPort", "8043");
		} catch (SQLException e) {
			throw new IllegalArgumentException(e.getMessage()
					+ "Issue with server. H2 server can't start");
		}
		return server;
	}
}
