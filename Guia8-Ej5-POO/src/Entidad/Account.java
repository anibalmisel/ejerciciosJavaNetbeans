package Entidad;
public class Account {
//    5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
//Las operaciones asociadas a dicha clase son:
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//b) Agregar los métodos getters y setters correspondientes
    
    //atributos
    private int numberAccount;
    private long dni;
    private int currentBalance;
    //Constructor por defecto
    public Account() {
    }
    //Constructor por parametros
    public Account(int numberAccount, long dni, int currentBalance){
        this.numberAccount=numberAccount;
        this.dni=dni;
        this.currentBalance=currentBalance;
    }
    //getters & setters
    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }
    //toString
    @Override
    public String toString() {
        return "Account{" + "numberAccount=" + numberAccount + ", dni=" + dni + ", currentBalance=" + currentBalance + '}';
    }
}
