package com.example.helloworld;

import io.dropwizard.Application;
import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.migrations.MigrationsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloWorldApplication extends Application<HelloWorldConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "HelloWorld!";
    }

    @Override
    public void initialize(final Bootstrap<HelloWorldConfiguration> bootstrap) {
        bootstrap.addBundle(new MigrationsBundle<HelloWorldConfiguration>() {
        	@Override
        	public PooledDataSourceFactory getDataSourceFactory(HelloWorldConfiguration configuration) {        		
        		return configuration.getDataSourceFactory();
        	}        	
		});
    }

    @Override
    public void run(final HelloWorldConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
