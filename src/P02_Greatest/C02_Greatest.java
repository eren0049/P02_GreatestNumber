/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P02_Greatest;

import java.util.Scanner;

public class C02_Greatest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number1 : ");
        int zahl1 = scanner.nextInt();
        System.out.println("Give a number2 : ");
        int zahl2 = scanner.nextInt();
        System.out.println("Give a number3 : ");
        int zahl3 = scanner.nextInt();
        
        if(zahl1>zahl2 && zahl1>zahl3){
            System.out.println("Greatest zahl: " + zahl1);
        }else if (zahl2>zahl1 &&zahl2>zahl3){
            System.out.println("Greatest zahl: " + zahl2);  
        }else if(zahl3>zahl1 &&zahl3>zahl2){
            System.out.println("Greatest zahl: " + zahl2); 
        }
        
        if(zahl1 == zahl2){
            System.out.println("zahl1 = zahl2"); 
        }else if(zahl1==zahl3){
            System.out.println("zahl1 = zahl3"); 
        }else if(zahl2==zahl3){
            System.out.println("zahl2 = zahl3"); 
        }
        
        if(zahl1==zahl2 && zahl1==zahl3){
            System.out.println("zahl2 = zahl3=zahl1"); 
        }
    } 
}
