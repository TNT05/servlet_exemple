package com.servlet_exemple;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );

        // Create a Tomcat server instance
        Tomcat tomcat = new Tomcat();
        
        // Set the port before starting the server
        tomcat.setPort(8080);

        // Add the HelloServlet to the context and map it to /hello URL
        Context context = tomcat.addContext("", null);
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        context.addServletMappingDecoded("/hello", "HelloServlet");

        // Start the server
        tomcat.start();
        tomcat.getServer().await();
    }
}
