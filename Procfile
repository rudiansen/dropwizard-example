web: java $JAVA_OPTS -jar target/dropwizard-example-1.0-SNAPSHOT.jar db migrate config.yml && java $JAVA_OPTS -Ddw.server.connector.port=$PORT -jar target/dropwizard-example-1.0-SNAPSHOT.jar server config.yml