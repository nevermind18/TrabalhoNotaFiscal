/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notafiscal;

/**
 *
 * @author Bruno
 */
public class ItensNotaFiscal {

    private int item;
    private int quantidadeItem;
    private String descricao;
    private double valor;

    public ItensNotaFiscal(int item, int quantidadeItem, String descricao, double valor) {
        this.item = item;
        this.quantidadeItem = quantidadeItem;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double valorTotal(){
        
        return valor * quantidadeItem;
                
    }
    
    public double valorDescontado(){
        
        return valorTotal() * 0.85;
        
    }

    @Override
    public String toString() {
        return "item = " + item + " \n" +
                "quantidadeItem = " + quantidadeItem + " \n"  +
                " descricao = " + descricao + " \n"  + 
                " valo r= " + valor + " \n" +
                " Valor total da compra = " + valorTotal() + " \n" +
                " valor com desconto = " + valorDescontado();
    }

    
    
}
