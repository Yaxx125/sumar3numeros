import java.util.Scanner;
//Crear un codigo que sume tres números, evitar que el ususario coloco numeros repetidos y saber cual es numero mayor 
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Usamos un try-catch para que el usuario no ingrese numeros repetidos ni un string
        try{
            System.out.println("Ingrese el primer numero:");
            int num1 = scanner.nextInt();
            System.out.println("Ingrese el segunfo numero:");
            int num2 = scanner.nextInt();
            System.out.println("Ingrese el tercer numero:");
            int num3 = scanner.nextInt();

            if (num1 == num2 ||  num1 == num3 || num2 == num3 );
             System.out.println("Ingrese numeros distintos");   

             int suma = sumarNumeros(num1, num2, num3);
            System.out.println("La suma de los numeros es: "+suma);

            int mayor = encontrarMayor(num1, num2, num3);
            System.out.println("El numero mayor es: "+mayor);
            }catch(Exception e){
            System.out.println("Error: ingrese solo numeros enteros.");
            }
        }
        //creamos una clase que sume los tres numeros
    public static int sumarNumeros (int num1, int num2, int num3){
        return num1+num2+num3;
        }
        //Creamos otra clase que encuentre los el numero mayor
    public static int encontrarMayor ( int num1, int num2, int num3){
        int mayor = num1;
        if (num2 > mayor){
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        return mayor;
        }
        //me fui a tres cybers pa hacer el codigo asi que espero que lo haya convencido, sin más que decir pase buen día :)
    } 


