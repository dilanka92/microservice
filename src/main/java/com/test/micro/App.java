package com.test.micro;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import java.util.Date;

@ApplicationPath("/trivia")
@Path("")
public class App extends Application {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getDirectory(@Context UriInfo uri) {
        Link selfLink = Link.fromUri(uri.getBaseUri())
                .rel("self").type(MediaType.APPLICATION_JSON)
                .build();
        Link questionsLink = Link.fromUri(uri.getBaseUri() + "questions")
                .rel("questions").type(MediaType.APPLICATION_JSON)
                .build();

        return Response.ok()
                .lastModified(new Date())
//                .header("trivia-version", RepositoryUtils.getGitRepositoryState().getBuildVersion())
                .location(uri.getRequestUri())
                .links(selfLink, questionsLink)
                .build();
    }
}
