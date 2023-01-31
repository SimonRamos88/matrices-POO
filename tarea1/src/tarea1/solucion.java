package tarea1;

public class solucion {

	public static void main(String[] args){
        int [][] cervezas = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] cafe = {{97,98,99,100},{101,102,103,104},{105,106,107,108},{109,110,111,112}};
        int [] controlcer = ControlCerveza(cervezas);
        int [] controlcaf = ControlCafe(cafe);
        System.out.println("Caja de cervezas");
        System.out.println(imprimirmatriz(cervezas,true));
        System.out.println("Revision de calidad cervezas");
        System.out.println(imprimircalidad(controlcer,true));
        System.out.println("\nCaja de cafe");
        System.out.println(imprimirmatriz(cafe,false));
        System.out.println("Revision de calidad café");
        System.out.println(imprimircalidad(controlcaf,false));
    }
	
    public static int[] ControlCerveza(int [][] matriz){
        int [] array = new int[3];
        for(int i = 0; i<3; i++){
            array[i] = matriz[i][i];
        }
        return array;

    }
    
    public static int [] ControlCafe (int [][] matriz){
        int n = matriz.length;
        int [] a = new int[4];
        for(int i =0; i<n; i++){
            a[i] = matriz[i][n-1-i];
        }
        return a;
    }
    
    public static String imprimirmatriz (int [][] matriz, boolean bandera){
        int n = matriz[0].length;
        String fin = "" ;
        for(int i= 0; i<n; i++) {
            String aux = "[ ";
            for (int j = 0; j < n; j++) {
            	if (bandera) {
            		aux += matriz[i][j] + " ";
            	}
            	else {
            		aux += Character.toString(matriz[i][j]) + " ";
            	}
            }
            aux += "] \n";
            fin += aux;
        }
        return fin;
    }
    
    public static String imprimircalidad (int[] a, boolean bandera){
        int n = a.length;
        String fin = "[ ";
        for(int i=0; i<n; i++){
        	if (bandera) {
        		fin += a[i] + " ";
        	}else {
        		fin += Character.toString(a[i]) + " ";
        	}
            
        }
        fin += "]";
        return fin;
    }

}
