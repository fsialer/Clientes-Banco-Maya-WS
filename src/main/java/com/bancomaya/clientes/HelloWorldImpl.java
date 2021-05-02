
package com.bancomaya.clientes;

import javax.jws.WebService;

@WebService(endpointInterface = "com.bancomaya.clientes.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String nombre) {
        return "Hello " + nombre+" Bienvenido ala comunidad Codigo Rupstre = SpaceNative";
    }
}

