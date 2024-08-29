package org.example.e106;

public class E106StringBuilder {
    public static void main(String[] args) {
        // Instantiate StringBuffer
        StringBuffer stringBuffer = new StringBuffer();

        // Append Values
        stringBuffer.append("Hello"+ " ");
        stringBuffer.append("World");

        // Print in Uppercase
        System.out.println(stringBuffer.toString().toUpperCase()) ;
    }
}

