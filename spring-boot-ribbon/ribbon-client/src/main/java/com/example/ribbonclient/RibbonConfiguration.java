package com.example.ribbonclient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;


/**
 * There are three configurable load balancing rules RoundRobinRule, 
 * AvailabilityFilteringRule and WeightedResponseTimeRule.
 */
public class RibbonConfiguration {

    @Autowired
    IClientConfig config;

    /**
     * PingUrl will ping a URL to check the status of each server.
     * @param  config Client configuration
     * @return The URL to be used for the Ping
     */
    @Bean
    public IPing ribbonPing(IClientConfig config) {
        return new PingUrl();
    }

    /**
     * This rule will skip servers that are deemed "circuit tripped".
     */
    @Bean
    public IRule ribbonRule(IClientConfig config) {
        return new AvailabilityFilteringRule();
    }
}