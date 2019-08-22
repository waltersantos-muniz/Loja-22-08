
package loja;


public class Principal {

    public static void main(String[] args) {
       Doces p1 = new Doces();
       p1.setNome("Rabanete");
       p1.setQuantidade(200);
       p1.setValor(2.99);
       
       Frios p2 = new Frios();
       p2.setNome("Mortadela");
       p2.setQuantidade(400);
       p2.setValor(4.99);
       
       Pao p3 = new Pao();
       p3.setNome("Pão de Queijo");
       p3.setQuantidade(1000);
       p3.setValor(1.99);
       
       Pedido p = new Pedido();
       p.setP1(p1);
       p.setP2(p2);
       p.setP3(p3);
       
       System.out.println("Produtos: "+ p1.getNome()+" Quantidade: "+p1.getQuantidade()+" Valor: "+p1.getValor());
       System.out.println("Produtos: "+ p2.getNome()+" Quantidade: "+p2.getQuantidade()+" Valor: "+p2.getValor());
       System.out.println("Produtos: "+ p3.getNome()+" Quantidade: "+p3.getQuantidade()+" Valor: "+p3.getValor());
       
    }
    
}
