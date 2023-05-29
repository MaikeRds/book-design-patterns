package org.example.solid.s;

public class Main {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        DataProcessor dataProcessor = new DataProcessor();

        String filePath = "data.txt";
        String data = fileManager.readFile(filePath);

        dataProcessor.process(data);

        String processedData = processData(data);

        fileManager.saveFile("output.txt", processedData);
    }

    private static String processData(String data) {
       String processedData = "";
        // Lógica para processar os dados
        // ...
        return processedData;
    }
}
