/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nextmonth;

import java.time.*;

public class NextMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int day;
        int daysTilNextMo;
        System.out.println("Today is " + today);
        day = today.getDayOfMonth();
        System.out.println(day);
        daysTilNextMo = today.lengthOfMonth() - day;
        System.out.println("There are " + daysTilNextMo +" days until " + today.plusMonths(1).getMonth() + " starts");
    }
    
}
