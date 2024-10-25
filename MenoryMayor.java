import java.util.Scanner;

public class MenoryMayor
{
    public static Scanner leer= new Scanner(System.in);
    
    public static void main ()
    {
        int a, b, c;
        
        System.out.println("ingrese el primer numero: ");
        a= leer.nextInt();
        
        System.out.println("ingrese el segundo numero: ");
        b= leer.nextInt();

        System.out.println("ingrese el tercer numero: ");
        c= leer.nextInt();
        
        
        if(a<=b&&a<=c)
        {
            System.out.println( a + " Menor");
        }
        if (b<=c)
        {
            System.out.println( b + " Medio");
            System.out.println( c + " Mayor");
        }
        else
        {
            System.out.println( c + " Medio");
            System.out.println( b + " Mayor");
        }
            
        if(b<=c&&b<=a)
        {
            System.out.println( b + " Menor");
        }
        if (c<=a)
        {
            System.out.println( c + " Medio");
            System.out.println( a + " Mayor");
        }
        else
        {
            System.out.println( a + " Medio");
            System.out.println( c + " Mayor"); 
        }
            
        
    }
}    