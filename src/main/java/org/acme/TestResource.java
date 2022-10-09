package org.acme;

import org.acme.service.HelloService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author WuF
 * @date 2022/10/9
 * @ApiNote
 * @time 16:20
 */
@Path("/test")
public class TestResource {

    @Inject
    HelloService testService;

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return testService.hello();
    }
}
