package cafecommerce;

import java.util.Scanner;

public class CafeCommerce {
    private int quantidadeVendida;
    private double precoUnitario;
    private double despesaProdutos;

   
    public CafeCommerce() {
    
    }

    // Get e Set
    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public void setQuantidadeVendida(int quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double getDespesaProdutos() {
        return despesaProdutos;
    }

    public void setDespesaProdutos(double despesaProdutos) {
        this.despesaProdutos = despesaProdutos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        CafeCommerce cafe = new CafeCommerce();

       
        System.out.print("Digite a quantidade vendida: ");
        int quantidade = scanner.nextInt();
        cafe.setQuantidadeVendida(quantidade);

      
        System.out.print("Digite o preço unitário: ");
        double preco = scanner.nextDouble();
        cafe.setPrecoUnitario(preco);


        System.out.print("Digite a despesa de produtos: ");
        double despesa = scanner.nextDouble();
        cafe.setDespesaProdutos(despesa);
      
        
        scanner.close();

       
        System.out.println("Quantidade vendida: " + cafe.getQuantidadeVendida());
        System.out.println("Preço Unitário: " + cafe.getPrecoUnitario());
        System.out.println("Despesa de Produtos: " + cafe.getDespesaProdutos());
    }
}
