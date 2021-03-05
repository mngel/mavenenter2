package com.mycompany;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Test
 */
@Stateless
@LocalBean
public class NewSessionBean {

    public String sayHello(String testname) {
        return "Hello " + testname;
    }
}
