package br.com.faeterj;

public class calculadora {
   
	public static float Soma (int v1, int v2) {
		
		return v1 + v2;
		
	}
	
	public static float Subtrai (int v1, int v2) {
		
		return v1 - v2;
		
	}
	
	public static float multiplica (int v1, int v2) {
		
		return v1 * v2;
		
	}
	
	public static float divide (int v1, int v2) {
		
		return v1 / v2;
		
	}
	
	public static double seno (int v1) {
		
		return java.lang.Math.sin(v1);
	};
	
    public static double coseno (int v1) {
		
		return java.lang.Math.cos(v1);
		
	};
	public static double raiz (int v1) {
		
		return java.lang.Math.sqrt(v1); 
		
	}
	
	public static double decide (int v1, int v2, String op) {
		
		double resultado = 0;
		if (op.equals("+")) {
			
			resultado = Soma(v1,v2);
			
		}else if (op.equals("-")) {
			
			resultado = Subtrai(v1,v2);
			
		}else if (op.equals("*")) {
			
			resultado = multiplica(v1,v2);
			
		}else if (op.equals("/")) {
			
			resultado = divide(v1,v2);
			
		}else if (op.equals("seno")) {
			
			resultado = seno (v1);
			
		}else if (op.equals("coseno")) {
			
			resultado = coseno(v1);
			
		}else if (op.equals("raiz")) {
			
			resultado = raiz(v1);
			
		}
		return resultado;
		
	}
	
}
