import java.util.Scanner;
class Main {
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
        System.out.println("Witaj w programie przeliczającym kody liczbowe");
     System.out.println("Aby przeliczyć  liczbę dziesiętną wpisz 1");
     System.out.println("Aby przeliczyć na  liczbę dziesiętną wpisz 2");
    int wersja =scan.nextInt();
    if(wersja==1)
    {
     zDEC();

    }
    else
    {
      
    }
    scan.close();
  }
  
  public static void zDEC()
  {
    int wariant;
    int i=0;
    int[] wynik= new int[100];
    char[] wynikh= new char[100];
    int j;
    System.out.println("Podaj liczę dziesiętną dodatnią");
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
         System.out.println("Liczba to : "+ liczba);
        
        break;
      case 4:
         System.out.println("Liczba to :");
         while(liczba>0)
          {                                                 
             if(liczba%16==1)
          {
          wynikh[i]='1';
          }
            else if(liczba%16==2)
          {
          wynikh[i]='2';
          }
            else if(liczba%16==3)
          {
          wynikh[i]='3';
          }
            else if(liczba%16==4)
          {
          wynikh[i]='4';
          }
            else if(liczba%16==5)
          {
          wynikh[i]='5';
          }
            else if(liczba%16==6)
          {
          wynikh[i]='6';
          }
            else if(liczba%16==7)
          {
          wynikh[i]='7';
          }else if(liczba%16==8)
          {
          wynikh[i]='8';
          }
            else if(liczba%16==9)
          {
          wynikh[i]='9';
          }
           else if(liczba%16==10)
          {
           wynikh[i]='A';
            
          }
          else if(liczba%16==11)
          {
          wynikh[i]='B';
          }
          else if(liczba%16==12)
          {
          wynikh[i]='C';
          }
          else if(liczba%16==13)
          {
          wynikh[i]='D';
          }
          else if(liczba%16==14)
          {
          wynikh[i]='E';
          }
          else if(liczba%16==15)
          {
          wynikh[i]='F';
          }
          else 
          {
          wynikh[i]='0';
          
          }
            liczba=liczba/16;
            i++;
            }
        for (j=i-1;j>=0;j--)
          {
            System.out.print(wynikh[j]); 
          }
          
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

        