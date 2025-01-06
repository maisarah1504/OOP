/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopproject;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class LoanSystemApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" << WELCOME TO LOAN APPLICATION SYSTEM >> ");
        System.out.println(" Enter ID: ");
        
        Scanner scanner = new Scanner(System.in);
        String ID = scanner.nextLine();
        
        LoanApplication newUser = new LoanApplication(); 
        if(newUser.getID(ID) == 1){
            System.out.println(" WELCOME " + newUser.getName());
        }
        else{
            System.out.println(" ERROR!! NO USER FOUND");
            System.out.println(" Enter 1- Create new acc, 2- Exit");
            Scanner choice = new Scanner(System.in);
            int c = choice.nextInt();
            switch(c){
                case 1:
                    LoanApplication User = new Applicant();
                case 2:
                    break;
            }
            
    
        }
        
        
    }
    
}
