package com.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
 

class Soundcard {
	
}
public class MaskingTest {
	private Optional<Soundcard> soundcard;  

      private static final Logger logger = LogManager.getLogger(MaskingTest.class);
      public static void myTest(){
             logger.info("this is my info message");
             logger.debug("This is debug message");
             logger.debug("Passed to server::0084USER:17603,IP:0:0:0:0:0:0:0:1,3425,Credit Card 1:1000002367844224,3425,Credit Card2:1000002367844224 , CVV:234,SSN:123456789");
 
      }
      public static void main(String[] args) {
//             myTest();
    		   /* Comparator<String> c =
    		      (String lhs, String rhs) ->
    		        {
    		          System.out.println("I am comparing" +
    		                             lhs + " to " + rhs);
    		          return lhs.compareTo(rhs);
    		        };
    		    int result = c.compare("Hello", "World");
		          System.out.println("I am comparing" + result);*/
    	  
    	  Optional<Soundcard> p = Optional.empty(); 
    	  System.out.println( p);
    	  
    	  Soundcard pp = null;
    	  Optional<Soundcard> op = Optional.of(pp); 

      }
     
}
