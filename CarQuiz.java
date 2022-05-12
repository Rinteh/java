/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car.quiz;

/**
 *
 * @author fabia
 */
import java.util.*;
public class CarQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String q1 = "What year was the first Toyota corolla released?\n"
                +"(a)1966\n(b)1998\n(c)2005\n";
        String q2 = "What was first flagship Toyota model?\n"
                +"(a)Corolla\n(b)Supra\n(c)Land Cruiser";
        String q3 = "What year did the first Toyota Supra come out?\n"
                +"(a)1996\n(b)1999\n(c)1993\n";
        String q4 = "What is the latest Toyota model?\n"
                +"(a)Supra MK5\n(b)Yaris 2021\n(c)Hilux Legend 50\n";
        
        String q5 = "What year was the first Toyota released?\n"
                +"(a)1920\n(b)1936\n(c)1956\n";
        
        
        Question [] questions = {
        new Question(q1,"a"),
        new Question(q2,"c"),
        new Question(q3,"c"),
        new Question(q4,"a"),
        new Question(q5,"b")      
        };
        takeTest(questions);
    }
    public static void takeTest(Question [] questions){
int score = 0;
Scanner keyin = new Scanner(System.in);
for(int i=0;i<questions.length;i++){
System.out.println(questions[i].prompt);
String answer = keyin.nextLine();
if(answer.equals(questions[i].answer)){
score++;}
}
System.out.println("You got"+score+"/"+questions.length);
}
    
}
