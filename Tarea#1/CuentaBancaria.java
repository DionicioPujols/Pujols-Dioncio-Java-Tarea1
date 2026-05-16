import java.util.*;

public class CuentaBancaria{
    private String titular;
    private String tipocuenta;
    private String moneda;
    private String numerocuenta;
    private double saldo;

    public CuentaBancaria(){
        setTitular(titular);
        setTipoCuenta(tipocuenta);
        setMoneda(moneda);
        setNumeroCuenta(numerocuenta);
        setSaldo(0);
    }

    public CuentaBancaria(String titular, String tipocuenta, String moneda, String numerocuenta, double saldo){
        this.titular = titular;
        this.tipocuenta = tipocuenta;
        this.moneda = moneda;
        this.numerocuenta = numerocuenta;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }

    public String getTipoCuenta(){
        return tipocuenta;
    }

    public String getMoneda(){
        return moneda;
    }

    public String getNumeroCuenta(){
        return numerocuenta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setTipoCuenta(String tipocuenta){
        this.tipocuenta = tipocuenta;
    }
    public void setMoneda(String moneda){
        this.moneda = moneda;
    }
    public void setNumeroCuenta(String numerocuenta){
        this.numerocuenta = numerocuenta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}
    