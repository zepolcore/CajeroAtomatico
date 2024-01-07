import java.util.Scanner;
/*
*Aca esta el ejecutable
* */
public class Interfaz {
    public static void main(String[] args) {
        System.out.println("introduzca su numero de identificacion");
        Scanner scanner = new Scanner(System.in);
        String identificador = scanner.nextLine();
        System.out.println("introduzca su contraseña");
        String contrasena = scanner.nextLine();
        CajeroAutomatico cajero = new CajeroAutomatico(identificador, contrasena);

        //falta hacer un dowhile !!
        int opcionSeleccionada = scanner.nextInt();

        System.out.println("Indique");
        switch (opcionSeleccionada){
            case 1:
                cajero.mostrarSaldo();
                break;
            case 2:
                cajero.ingresarDinero();
                break;
            case 3:
                cajero.sacarDinero();
                break;
            case 4:
                cajero.consultarUltimosMovimientos();
                break;
            default:
                cajero.salir();
        }
    }
}