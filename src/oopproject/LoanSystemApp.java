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
        GUILoanSystem loanSystem = new GUILoanSystem ();
        loanSystem.setVisible(true); 
        LoanApplication loanApplication = new LoanApplication();
        /*loanApplication.run(); */
        }
}
