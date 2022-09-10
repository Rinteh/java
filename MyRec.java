/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question.pkg2b;

import java.awt.Point;

 class MyRec {

   
 int x1 = 0;
 int y1 =0;
 int x2 =0;
 int y2 =0;
         
//"Builds" The rectangle giving it structure and returning the given values
MyRec buildRec(int x1, int y1, int x2, int y2)
{
this.x1 = x1;
this.y1 = y1;
this.x2 = x2;
this.y2 = y2;
return this;
}

MyRec buildRec(Point upperLeft,Point LowerRight)
{
x1 = upperLeft.x;
y1 = upperLeft.y;
x2 = LowerRight.x;
y2 = LowerRight.y;
return this;
}

MyRec buildRec(Point upperLeft, int w, int h)
{
x1 = upperLeft.x;
y1 = upperLeft.y;
x2 = (x1+w);
y2 =(y1+h);
return this;
}
//Prints the rectangle
void printRec()
{
System.out.print("MyRect: <" + x1 + "," + y1);
System.out.print("," + x2 + "," + y2 + ">"+"\n");
}    

 
 public static void main(String[] args) {
        MyRec rect= new MyRec();
        
        
 //Prints out the coordinates of the rectangle on the cartesian plane with the given values       
System.out.println("Calling buildRect with coordinates 15,15,50,50:");
rect.buildRec(15,15,25,25);
rect.printRec();
System.out.println("<--------->");



System.out.println("Calling builfRect w/points (5,5), (15,15):");
rect.buildRec(new Point(5,5), new Point(15,15));
rect.printRec();
System.out.println("<--------->");



System.out.print("Calling buildRect w/ point(5,5),");
System.out.println("width (50) and height (50)");
rect.buildRec(new Point(5,5),50,50);
rect.printRec();
System.out.println("<--------->");
    }
 }

