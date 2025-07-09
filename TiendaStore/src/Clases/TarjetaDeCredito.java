package Clases;

import java.util.*;

public class TarjetaDeCredito  {
    private double limite;
    private double saldo;
    private List<Compra> listaDeCompras;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = saldo;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean volverCompra(Compra compra1){
        if(this.saldo >compra1.getValor()){
            this.saldo -= compra1.getValor();
            this.listaDeCompras.add(compra1);
            return true;
        }
        else{
            return false;
        }
    }


    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaDeCompras() {
        return listaDeCompras;
    }
}
