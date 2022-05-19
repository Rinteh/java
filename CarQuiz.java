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
        
        Scanner br = new Scanner(System.in);
        String b1 = new String("BMW");
        
                
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
        
        String q6 = "What year was the first BMW 3 series released?\n"
                +"(a)1975\n(b)1981\n(c)2000\n";
        String q7 = "What was first BMW model?\n"
                +"(a)3/15\n(b)M2\n(c)2002";
        String q8 = "What year did BMW attain Rolls Royce\n"
                +"(a)1996\n(b)1999\n(c)1993\n";
        String q9 = "What is the latest BMW model?\n"
                +"(a)m8\n(b)m5cs\n(c)m240i\n";
        String q10 = "What was the first BMW M car ?\n"
                +"(a)M1\n(b)M3\n(c)M8\n";
        
        
        Question [] questions1 = {
        new Question(q1,"a"),
        new Question(q2,"c"),
        new Question(q3,"c"),
        new Question(q4,"a"),
        new Question(q5,"b")      
        };
         Question[] questions2 = {
        new Question(q6,"a"),
        new Question(q7,"c"),
        new Question(q8,"c"),
        new Question(q9,"a"),
        new Question(q10,"b")      
        };
         Question[] questions3 = {
        new Question(q6,"a"),
        new Question(q7,"c"),
        new Question(q8,"c"),
        new Question(q9,"a"),
        new Question(q10,"b")      
        };
        
        System.out.println("Please Enter a Car Brand of the following\n BMW, Toyota, Ferrari");
        String BRA = br.next();
        
        if(BRA.equals("Toyota")){
        takeTest1(questions1);
        }else if(BRA.equals("BMW")){
        takeTest2(questions2);
        }else if(BRA.equals("Ferrari")){
        takeTest3(questions3);
        }else{
        System.out.println("Please Select One of the Provided Car Brands");
    }
    }
    
public static void takeTest1(Question [] questions1){
int score = 0;
Scanner keyin = new Scanner(System.in);
for(int i=0;i<questions1.length;i++){
System.out.println(questions1[i].prompt);
String answer = keyin.nextLine();
if(answer.equals(questions1[i].answer)){
score++;}
}
System.out.println("You got"+score+"/"+questions1.length);
}
public static void takeTest2(Question [] questions2){
int score = 0;
Scanner keyin = new Scanner(System.in);
for(int i=0;i<questions2.length;i++){
System.out.println(questions2[i].prompt);
String answer = keyin.nextLine();
if(answer.equals(questions2[i].answer)){
score++;}
}
System.out.println("You got"+score+"/"+questions2.length);
}

public static void takeTest3(Question [] questions3){
int score = 0;
Scanner keyin = new Scanner(System.in);
for(int i=0;i<questions3.length;i++){
System.out.println(questions3[i].prompt);
String answer = keyin.nextLine();
if(answer.equals(questions3[i].answer)){
score++;}
}
System.out.println("You got"+score+"/"+questions3.length);
}
    
}
