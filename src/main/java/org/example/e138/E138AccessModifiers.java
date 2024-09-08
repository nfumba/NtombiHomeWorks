package org.example.e138;
public class E138AccessModifiers {
       public static void main(String[] args) {
              AnotherClass obj = new AnotherClass();
              System.out.println(obj.defaultMethod());
              System.out.println(obj.protectedMethod());
              System.out.println(obj.publicMethod());
       }
}

class AnotherClass {
       private String privateMethod() {
              return "private";
       }

       String defaultMethod() {
              return "default";
       }

       protected String protectedMethod() {
              return "protected";
       }

       public String publicMethod() {
              return "public";
       }
}

