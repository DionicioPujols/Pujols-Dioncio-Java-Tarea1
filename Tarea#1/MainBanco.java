import java.util.*;

public class MainBanco{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n|| Bienvenido al Banco |\n|");

        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();

        System.out.print("Ingrese la cantidad de cuentas bancarias que desea crear: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("\n|| Creando cuenta bancaria #" + (i+1) + " ||");
            System.out.println("----------------------------------");
            System.out.print("Ingrese el nombre del titular: ");
            String titular = sc.nextLine();
            System.out.print("Ingrese el tipo de cuenta (Ahorros o Corriente): ");
            String tipocuenta = sc.nextLine();
            System.out.print("Ingrese el tipo de moneda: ");
            String moneda = sc.nextLine();
            System.out.print("Ingrese su numero de cuenta: ");
            String numerocuenta = sc.nextLine();
            System.out.print("Ingrese su saldo inicial: ");
            double saldo = sc.nextDouble();
            CuentaBancaria cuenta = new CuentaBancaria(titular, tipocuenta, moneda, numerocuenta, saldo);
            cuentas.add(cuenta);
        }

        System.out.println("\n\n||------------------------------------------------||");
        System.out.println("|| ---- Tabla de informacion de las cuentas  ---- ||");
        System.out.println("||------------------------------------------------||");

        for(CuentaBancaria cuenta : cuentas){
            System.out.println("Titular: " + cuenta.getTitular());
            System.out.println("Tipo de cuenta: " + cuenta.getTipoCuenta());
            System.out.println("Moneda: " + cuenta.getMoneda());
            System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
            System.out.println("Saldo: " + cuenta.getSaldo() + " DOP$");
            System.out.println("-----------------------------------------------");
        }
    }
}