/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keyboardinput;

/**
 *
 * @author fabia
 */
import java.io.*;
public class Keyboardinput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Instantiate a bridge stream and pass the object instantiated by System.in to
// its constructor.
InputStreamReader isr = new InputStreamReader( System.in );
// Instantiate a buffered stream and pass the InputStreamReader to its
// constructor.
BufferedReader kbd = new BufferedReader( isr );
try
{
System.out.print( "Enter some characters and press" + " enter when finished: " );
String s = kbd.readLine( ); 
System.out.println( "The String was: " + s );
// Close the initial stream; this will close all streams connected to it.
kbd.close( );
}
catch( IOException e )
{
e.printStackTrace( );
} 
    }
    
}
