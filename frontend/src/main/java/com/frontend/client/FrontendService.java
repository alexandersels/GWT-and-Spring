package com.frontend.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("frontendService")
public interface FrontendService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use frontendService.App.getInstance() to access static instance of frontendServiceAsync
     */
    public static class App {
        private static FrontendServiceAsync ourInstance = GWT.create(FrontendService.class);

        public static synchronized FrontendServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
