package com.example.hibernatedemo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.example.hibernatedemo.resource.HostelResource;

import jakarta.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class JerseyAppConfig extends ResourceConfig {

	public JerseyAppConfig() {
		register(HostelResource.class);
	}

}
