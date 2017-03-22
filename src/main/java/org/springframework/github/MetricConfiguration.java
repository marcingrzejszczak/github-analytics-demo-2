package org.springframework.github;

import org.springframework.context.annotation.Configuration;

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;

/**
 * @author Marcin Grzejszczak
 */
@Configuration
@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
class MetricConfiguration {

}