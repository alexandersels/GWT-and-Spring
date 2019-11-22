package com.frontend.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.frontend.client.FrontendService;

public class FrontendServiceImpl extends RemoteServiceServlet implements FrontendService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}