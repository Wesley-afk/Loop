/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_8;

/**
 *
 * @author w.rocha
 */
import java.util.Scanner;
public class PROJETO_8 {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
         int Medalhas_de_ouro;
         int Medalhas_de_prata;
         int Medalhas_de_bronze;
         int Total;
          
       System.out.println("Quantiade de medalhas de ouro");
       Medalhas_de_ouro = ler.nextInt();
       
       System.out.println("Quantiade de medalhas de prata");
       Medalhas_de_prata = ler.nextInt();
       
       System.out.println("Quantidade de medalhas de bronze");
        Medalhas_de_bronze = ler.nextInt();
         Total = Medalhas_de_ouro + Medalhas_de_prata + Medalhas_de_bronze;
       
       if( Medalhas_de_ouro > 10){
           System.out.println("Ótimo desempenho!");
       }
       else if(Medalhas_de_ouro == 5 & Medalhas_de_ouro <= 10){
           System.out.println("Bom desempenho!");
       }
       else if(Medalhas_de_ouro < 5 & Total > 20){
           System.out.println("Desempenho regular.");
       }
       else if(Total == 20){
           System.out.println("Desempenho fraco");
       }
       else if(Medalhas_de_ouro > 5 & Total > 30){
           System.out.println("Desempenho extraordinário!");
       }
    }
}
