package com.nebula.dropwizard;

import com.nebula.dropwizard.health.TemplateHealthCheck;
import com.nebula.dropwizard.resources.HelloWorldResource;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class NebulaApplication extends Application<NebulaConfiguration> {

    public static void main(final String[] args) throws Exception {
        new NebulaApplication().run(args);
    }

    @Override
    public String getName() {
        return "Dropwizard";
    }

    @Override
    public void initialize(final Bootstrap<NebulaConfiguration> bootstrap) {
    	bootstrap.addBundle(new AssetsBundle("/assets/", "/theme/"));
    }

    @Override
    public void run(final NebulaConfiguration configuration,
                    final Environment environment) {
    	
        final HelloWorldResource resource = new HelloWorldResource(
                configuration.getTemplate(),
                configuration.getDefaultName()
            );
        final TemplateHealthCheck healthCheck =
                new TemplateHealthCheck(configuration.getTemplate());
            environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }

}
