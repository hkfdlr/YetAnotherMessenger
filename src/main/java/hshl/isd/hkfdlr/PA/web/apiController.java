package hshl.isd.hkfdlr.PA.web;

import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/{user}")
public class apiController {

    @OnOpen
    public void onOpen(Session session, @PathParam("user") String user) {
        System.out.println("connected to user: " + user);
    }
}
