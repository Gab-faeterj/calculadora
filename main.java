package br.com.faeterj;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int v2 = 0;
        String op;
        
        do {
        	
        System.out.println("digite a operacao desejada\n\nsoma[+]\nsubtracao[-]\nmultiplicacao[*]"
        		+ "divisao[/]\nseno[seno]\ncoseno[coseno]\nraiz[raiz]\n\nou digite [fim] para fechar"
        		+ "o programa");
            
        op = sc.next();	
        
      
        
        if (op.equals("+")||op.equals("-")||op.equals("*")||op.equals("/")) {
        	
        System.out.println("digite o valor de v1");
        
        int v1 = sc.nextInt();
        
        System.out.println("valor de v1: " + v1);
        
        System.out.println("digite o valor de v2");
        
        v2 = sc.nextInt();
        System.out.println("valor de v2: " + v2);
        
        double resultado = calculadora.decide(v1, v2, op);
       
        System.out.println("resultado de v1 " + op + " v2 : " + resultado);
        
        }else {
        	
        System.out.println("digite o valor de v1");
             
        int v1 = sc.nextInt();
        
        double resultado = calculadora.decide(v1, v2, op);
        	
        
        System.out.println("resultado de " + op + "de v1 :" + resultado);
        }
        }while (op != "fim");
	}

}
