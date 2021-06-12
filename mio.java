

public class mio
{
   
    
    public void caracol( ){
          int n=5;
          String [][] matriz = new String [n][n];
          int a=0;
          int b= n-1;
          int valor=1;
    
          for(int j=0; j< matriz.length;j++){
                  for(int i=a; i<=b;i++){
                         matriz[a][i] = valor++ +"\t";
                }
                for(int i=a+1; i<=b;i++){
                         matriz[i][b]=valor++ +"\t";   
                } 
                for(int i=b-1; i>=a;i--){
                         matriz[b][i]=valor++ +"\t";  
                }
                for(int i=b-1; i>=a+1;i--){
                         matriz[i][a] = valor++ +"\t";
                }
                a++; 
                b--;
          }
          
          for(int f=0; f<matriz.length;f++){
              for(int i=0; i< matriz[f].length; i++){
                  System.out.print(matriz[f][i]);  
              }      
              System.out.println();
          }
    }

    
    public void cruz(int parametro){
        int x=1;
        int n=parametro;
        int a=n;
        int b=n-1;
        int matriz[][] = new int[n][n];


       for(int fila=0; fila<n;fila++ ){
              for(int columna=0;columna < n;columna++){
                  if(fila==columna){
                         matriz[fila][columna]=x++;
                         matriz[fila][b] =a;         
 
                  }
              }
              a--;
              b--;
       }
         for(int i= 0; i<n;i++){
              for(int j=0; j<n; j++){
                    System.out.print(matriz[i][j]+"\t");
              }
           System.out.println();
         }
    }
        
        
}

