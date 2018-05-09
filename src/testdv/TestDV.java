/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdv;

import java.util.Scanner;

/**
 *
 * @author tiago.lucas
 */
public class TestDV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "n";
        while (a.equals("n")){
            // TODO code application logic here
            Scanner sc = new Scanner(System.in);
            long number = sc.nextLong();
            number = 98-(number*100)%97;
            String dv = String.valueOf(number);
            if(dv.length()<2){
                System.out.println("DV = 0"+dv);
            }else{
                System.out.println("DV = "+dv);
            }
            System.out.println();
            //System.out.println("Sair? (s ou n)");            
            //a = sc.next();
        }        
    }
}
