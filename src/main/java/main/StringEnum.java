package main;


public enum StringEnum {
   EMPTY("");
   
   String text;

   private StringEnum(String text) {
       this.text = text;
   }
   
}