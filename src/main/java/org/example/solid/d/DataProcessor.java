package org.example.solid.d;

// Classe de alto nível que depende de uma fonte de dados abstrata
public class DataProcessor {
    private DataSource dataSource;

    public DataProcessor(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void processData() {
        String data = dataSource.fetchData();
        // Lógica para processar os dados
        // ...
        System.out.println("Dados processados: " + data);
    }
}
