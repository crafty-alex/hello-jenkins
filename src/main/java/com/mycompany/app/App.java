package com.mycompany.app;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        Service service = new Service();
        System.out.println( "The answer is : " );
        System.out.println(service.whatsTheAnswer());
    }
}
