package Service;

import Entidad.Account;
import java.util.Scanner;
public class ServiceAccount {   
    //c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
    public Account ac(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your account number: ");
            int acnum = sc.nextInt();
            System.out.println("Enter your DNI: ");
            long dni = sc.nextLong();
            System.out.println("What is your current balance?: ");
            int curbal = sc.nextInt();
            return new Account(acnum, dni, curbal);
        } 
    }
    //d) Método ingresar(double ingreso): el método recibe una cantidad
    //de dinero a ingresar y se la sumara a saldo actual.
    public void income(Account ac) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the amount to deposit: ");
            int income = sc.nextInt();
            ac.setCurrentBalance(ac.getCurrentBalance() + income);
        }
    }
    //e) Método retirar(double retiro): el método recibe una cantidad de dinero
    //a retirar y se la restará al saldo actual. Si la cuenta no tiene la cantidad
    //de dinero a retirar, se pondrá el saldo actual en 0.
    public void withdraw(Account ac){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the amount to withdraw: ");
            int withD = sc.nextInt();
            if (ac.getCurrentBalance() >= withD) {
                ac.setCurrentBalance(ac.getCurrentBalance() - withD);
            } else {
                int balance = 0;
                System.out.println("You do not have enough balance: " + balance);
            }
        }
    }
    //f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo.
    //Validar que el usuario no saque más del 20%.
    public void quickWd(Account ac){
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("You can withdraw up to 20% of your balance \n - Enter the amount to withdraw:");
            double quickW = sc.nextDouble();
            double balance=(double)ac.getCurrentBalance();
            if (quickW > balance*0.20) {
                System.out.println("You cannot withdraw the suggested amount");
            } else {
                //int intNum = (int) num;
                ac.setCurrentBalance((int)(balance - quickW));
                System.out.println("Successful retirement\n - Your balance is: "+ac.getCurrentBalance());
            }
        }
    }
    //g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void consultBalance(Account ac){
        System.out.println("Your balance is: "+ac.getCurrentBalance());
    }
    //h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
    public void dataQ(Account ac){
        System.out.println(ac.toString());
    }
}
