package com.jamar.hc;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ClientPasswordCallback implements CallbackHandler {

    @Value("${app.wss.signature_user}")
    public  String SIGNATURE_USER;
    @Value("${app.wss.signature_pass}")
    public  String SIGNATURE_PASS;
    @Value("${app.wss.key_pass}")
    public  String KEY_PASS;


    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
//        System.out.println("ENTRÓ AL CALLBACK");
//        System.out.println("OBJECTO WSPC: " + pc.getUsage() + "-" + pc.getIdentifier() + "-" + pc.getPassword());

        switch (pc.getUsage()) {
            case WSPasswordCallback.USERNAME_TOKEN:
                pc.setIdentifier(SIGNATURE_USER);
                pc.setPassword(SIGNATURE_PASS);
                break;
            case WSPasswordCallback.SIGNATURE:
            // you can source the username and password from
                // other sources like login context, LDAP, DB etc
                pc.setPassword(KEY_PASS);
                break;
            default:
                break;
        }
    }

}