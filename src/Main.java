
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dram-
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***********************");
        System.out.println("1. Accessor Method");
        System.out.println("2. Mutator Method");
        System.out.println("3. Static Method");
        System.out.println("4. Constructors");
        System.out.println("***********************");
        System.out.print("Places choice : ");
        switch(input.nextInt()){
            case 1 :
                Accessor ac = new Accessor();       //Accessor Method
                System.out.println("---Example Accessor Method---");
                System.out.print("Places Enter Fristname : ");
                ac.fristName = input.next();
                System.out.print("Places Enter Surname : ");
                ac.surName = input.next();
                System.out.println("Your name :"+ac.getName());  //Accessor Method
                break;
            case 2 :
                Mutator mu  = new Mutator();    //Mutator Method
                System.out.println("---Example Mutator Method---");
                System.out.print("Places Enter Fristname : ");   //Mutator Method
                mu.set_fristName(input.next());
                System.out.print("Places Enter Surname : ");     //Mutator Method
                mu.set_surName(input.next());
                System.out.println("Your name :"+mu.getName());
                break;
            case 3 :
                System.out.println("---Example Static Method---");
                System.out.print("Places Enter Fristname : ");
                String FristName = input.next();
                System.out.print("Places Enter Surname : ");
                String SurName = input.next();
                System.out.println(" Triangle Area : "+member(FristName,SurName));  //Static Method
                break;
            case 4 :
                System.out.println("---Example Constructors---");
                Constructors con = new Constructors();
                System.out.print("Places Enter Fristname : "); 
                String fname = input.next();
                System.out.print("Places Enter Surname : ");
                String Sname = input.next();
                Constructors conn = new Constructors(fname,Sname);
                break;
            default :
                System.out.println("Fail");
        }
    }
    public static String member (String fname ,String Sname){
        return fname+" "+Sname;
    }
}
