package org.springframework.github;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author Marcin Grzejszczak
 */
@Configuration
class DbConfiguration {

	@Bean
	@Profile("reset")
	public Flyway flyway(DataSource theDataSource) {
		Flyway flyway = new Flyway();
		flyway.setDataSource(theDataSource);
		flyway.setLocations("classpath:db/migration");
		flyway.clean();
		flyway.migrate();
		return flyway;
	}
}
