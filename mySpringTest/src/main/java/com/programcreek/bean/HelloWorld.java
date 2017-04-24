package com.programcreek.bean;


public class HelloWorld {
   private String message;

   public void setMessage(String message){
      this.message  = message;
   }

   public String getMessage(){
//      System.out.println("Your Message : " + message);
	   return "Your message : " + message;
   }
}