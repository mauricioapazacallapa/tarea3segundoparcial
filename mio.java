

public class mio
{
   
    
    public void caracol( ){
          String [][] matriz = new String [5][5];
          int q=0;
          int w=4;
          int valor=1;
    
          for(int j=0; j< matriz.length;j++){
                  for(int i=q; i<=w;i++){
                         matriz[q][i] = valor++ +"\t";
                }
                for(int i=q+1; i<=w;i++){
                         matriz[i][w]=valor++ +"\t";   
                } 
                for(int i=w-1; i>=q;i--){
                         matriz[w][i]=valor++ +"\t";  
                }
                for(int i=w-1; i>=q+1;i--){
                         matriz[i][q] = valor++ +"\t";
                }
                q++; 
                w--;
          }
          
          for(int k=0; k<matriz.length;k++){
              for(int h=0; h< matriz[k].length; h++){
                  System.out.print(matriz[k][h]);  
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

