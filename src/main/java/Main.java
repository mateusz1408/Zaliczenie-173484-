// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    

    int [][] tablica = new int [3][3];
      for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
          tablica[i][j] = (i+1)*(j+1);
        }
      }
        for(int i = 0; i<3; i++){
          for(int j = 0; j<3; j++){
            System.out.print(tablica[i][j] + "\t");
          }
        }
      System.out.println();
      int iloczyn = 1;
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
          if(tablica[i][j] % 2 != 0){
            iloczyn *= tablica[i][j];
          }
        }
    }  
      System.out.println(iloczyn);
        
      
    
    }
}