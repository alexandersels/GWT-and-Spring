package com.frontend.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface FrontendServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
