package com.anti.Jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}
//Maven commands
//target>mvn archetype:generate -DgroupId=com.bharath -DartifactId=hellomaven -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
// mvn intall

// java -cp   target/hellomaven-1.0-SNAPSHOT.jar com.bharath.App

//summaven>java -cp target\summaven-1.0-SNAPSHOT.jar com.anti.App 12 56