package org.example.design_patterns.structural.composite;

// Exemplo de uso do padrão Composite
public class ExemploComposite {
    public static void main(String[] args) {
        Departamento vendas = new Departamento("Vendas");
        Departamento marketing = new Departamento("Marketing");

        Componente gerenteVendas = new Funcionario("Gerente de Vendas");
        Componente vendedor1 = new Funcionario("Vendedor 1");
        Componente vendedor2 = new Funcionario("Vendedor 2");

        Componente gerenteMarketing = new Funcionario("Gerente de Marketing");
        Componente analistaMarketing = new Funcionario("Analista de Marketing");

        vendas.adicionar(gerenteVendas);
        vendas.adicionar(vendedor1);
        vendas.adicionar(vendedor2);

        marketing.adicionar(gerenteMarketing);
        marketing.adicionar(analistaMarketing);

        vendas.exibirDados(); // Exibe os dados do departamento de vendas e seus funcionários
        System.out.println("-------------------");
        marketing.exibirDados(); // Exibe os dados do departamento de marketing e seus funcionários
    }
}

