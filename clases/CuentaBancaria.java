package clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    private double saldo;
    private Persona titular;
    private int numeroCuenta;
    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

    // constructor
    public CuentaBancaria(double saldo, Persona titular) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroCuentaRandom();
        listaDeCuentasBancarias.add(this);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void depositar(double deposito) {
        saldo += deposito;
        System.out.println("Señor(a) " + titular.getNombre());
        System.out.println("Se Hizo Un Deposito de: $" + deposito);
        System.out.println("Su nuevo saldo es: $" + saldo);
        System.out.println("----------------------------");
    }

    public void retirar(double retiro) {
        if (saldo >= retiro) {
            saldo -= retiro;
            System.out.println("Señor(a) " + titular.getNombre());
            System.out.println("Se Hizo Un Retiro de: $" + retiro);
            System.out.println("Su nuevo saldo es: $" + saldo);
        } else {
            System.out.println("Saldo Insuficiente, Su Saldo es: $" + saldo);
        }
        System.out.println("----------------------------");
    }

    public int numeroCuentaRandom() {
        Random random = new Random();
        return 100000 + random.nextInt(899999);
    }

    public void displaInfo() {
        System.out.println("Numero de Cuenta: " + numeroCuenta);
        titular.displayInfo();
        System.out.println("Su Saldo Es: $" + saldo);
    }

    public static void imprimeInformacionDeTodasLasCuentas() {
        System.out.println("Cuentas Activas Actualmente:");
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.displaInfo();
            System.out.println("----------------------------");
        }
    }
}
