package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void AdicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void RemoverItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();

        if (!itemList.isEmpty()){

            for (Item i : itemList){
                if (i.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(i);
                }
            }
            itemList.removeAll(itemParaRemover);
        }
        else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;

        if(!itemList.isEmpty()){

            for (Item item : itemList){
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }

            return valorTotal;
        }
        else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){

        if(!itemList.isEmpty()){

            for (Item exibir : itemList){
                System.out.println(this.itemList);
            }
        }
        else{
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();

        //Adicionando itens no carrinho
        compras.AdicionarItem("Leite", 7d, 3);
        compras.AdicionarItem("Arroz", 14d, 2);
        compras.AdicionarItem("Feijao", 11d, 3);
        compras.AdicionarItem("Chocolate", 6d, 3);
        compras.AdicionarItem("Carne", 23d, 1);

        //Exibindo compras no carrinho
        compras.exibirItens();

        //Removendo compras do carrinho
        compras.RemoverItem("Feijao");
        System.out.println("Feijão Retirado!");

        //Exibindo compras no carrinho
        compras.exibirItens();

        //Calculando o valor total da compra
        System.out.println("\nO valor total da compra é " + compras.calcularValorTotal());
    }



}
