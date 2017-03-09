package com.mkyong;

import java.util.UUID;

/**
 * Generate a unique number
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        App obj = new App();
        System.out.println("sdadasd");
        System.out.println("Unique ID123: " + obj.generateUniqueKey());
    }
    
    public String generateUniqueKey(){
    	
    	String id = UUID.randomUUID().toString();
    	id = UUID.randomUUID().toString();
    	id = UUID.randomUUID().toString();
    	System.out.println("sdadasd");
    	
    	return id;
    }

 public String generateUniqueKey2(){
    	
    	String id = UUID.randomUUID().toString();    	
    	
    	return id;
    	
    }
}
