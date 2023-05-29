package org.example.solid.d;

public class Main {
    public static void main(String[] args) {
        DataSource databaseDataSource = new DatabaseDataSource();
        DataProcessor databaseDataProcessor = new DataProcessor(databaseDataSource);
        databaseDataProcessor.processData();

        DataSource webServiceDataSource = new WebServiceDataSource();
        DataProcessor webServiceDataProcessor = new DataProcessor(webServiceDataSource);
        webServiceDataProcessor.processData();
    }
}
