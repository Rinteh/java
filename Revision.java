/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package revision;


public class Revision {

    
    public static void main(String[] args) {
       String animals[] = new String [6];
       
       animals [0] = "cat";
       animals [1] = "Dog";
       animals [2] = "Elephant";
       animals [3] = "Ostrich";
       animals [4] = "Snake";
       animals [5] = "Rabbit";
       
       for(int myanimals = 0; myanimals<animals.length;
               myanimals++ ){
       if(animals[myanimals]=="Elephant"){
       animals[myanimals] = "crocodile";}
       System.out.println("This is a list of animals"+animals[0]);
       }
    }
    
}
