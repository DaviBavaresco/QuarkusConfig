package quarkusConfig;

import java.util.Optional;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {

    @Inject
    @ConfigProperty(name = "ifrs.pw2",  defaultValue="" )
    String message;

    @ConfigProperty(name = "ifrs.message")
    String name;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello " +name;
    }

    
}
