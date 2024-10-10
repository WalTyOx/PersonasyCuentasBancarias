import clases.CuentaBancaria;
import clases.Persona;

public class Aplicacion {
    public static void main(String[] args) {

        //Personas
        Persona julian = new Persona("Julian ", "Casablancas ", 46);
        Persona thom = new Persona("Thom ", "Yorke ", 56);
        Persona jeff = new Persona("Jeff ","Buckley ", 57);

        //Cuentas
        CuentaBancaria cuentaJulian = new CuentaBancaria(2000.0, julian);
        CuentaBancaria cuentaThom = new CuentaBancaria(6000.0, thom);
        CuentaBancaria cuentaJeff = new CuentaBancaria(10000.0, jeff);

        //Depositos
        cuentaJulian.depositar(1500.0);
        cuentaJeff.depositar(5000.0);

        //Retiros
        cuentaThom.retirar(8000.0);
        cuentaJeff.retirar(5000.0);

        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();

    }
}