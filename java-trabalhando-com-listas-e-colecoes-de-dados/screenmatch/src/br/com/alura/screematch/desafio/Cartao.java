package br.com.alura.screematch.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cartao {

    private double limite;
    private double saldo;
    private List<Compra> compras;

    public Cartao(Double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public boolean addCompra(Compra compra) {

        if(this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;

        } else {
            return false;
        }
    }
}
