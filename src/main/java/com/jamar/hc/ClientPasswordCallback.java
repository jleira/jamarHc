package com.jamar.hc;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class ClientPasswordCallback implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
        System.out.println("ENTRÓ AL CALLBACK");
        System.out.println("OBJECTO WSPC: " + pc.getUsage() + "-" + pc.getIdentifier() + "-" + pc.getPassword());

        switch (pc.getUsage()) {
            case WSPasswordCallback.USERNAME_TOKEN:
                pc.setIdentifier("2-900461448.001");
                pc.setPassword("D4t4cr3d1t0");
                break;
            case WSPasswordCallback.SIGNATURE:
            // you can source the username and password from
                // other sources like login context, LDAP, DB etc
                pc.setPassword("Jamar01");
                break;
            default:
            System.out.println("NO ES USERNAME NI SIGNATURE");
                break;
        }
    }

}