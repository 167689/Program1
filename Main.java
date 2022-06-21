import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int wariant;
    int i=0;
    int[] wynik= new int[100];
    int j;

    
        System.out.println("Witaj w programie przeliczającym kody liczbowe");

    System.out.println("Podaj liczę dziesiętną dodatnią");
     Scanner scan = new Scanner(System.in);
    int liczba =scan.nextInt();
    if(liczba<0){
      wariant =5;
    }
    else if(liczba == 0)
    {
    wariant =6;
    }
    else 
    {
    System.out.println("Wybierz na jaki kod chcesz przeliczyć");
     System.out.println("1 Dwójkowy (BIN)");
    System.out.println("2 Ósemkowy (OCT)");
    System.out.println("3 Dziesiętny (DEC)");
    System.out.println("4 Szesnastkoy (HEX)");
    wariant =scan.nextInt();
    }
    
     
    
    switch(wariant){
      case 1:
        while(liczba>0)
          {
            wynik[i]=liczba%2;
            liczba=liczba/2;
            i++;
          }
       System.out.println("Liczba to :");
        for (j=i-1;j>=0;j--)
          {
            System.out.print(wynik[j]); 
          }
        break;
        case 2:
         while(liczba>0)
          {
            wynik[i]=liczba%8;
            liczba=liczba/8;
            i++;
          }
       System.out.println("Liczba to :");
        for (j=i-1;j>=0;j--)
          {
            System.out.print(wynik[j]); 
          }
        
        break;
      case 3:
         
        
        break;
      case 4:
         
        break;
        case 5:
          System.out.println("Nieprawidłowa liczba");
        break;
        case 6:
          System.out.println("Liczba to 0");
        break;
  }
  }
  
}
        