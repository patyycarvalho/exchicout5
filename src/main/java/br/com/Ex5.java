package br.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Ex5 {
    public static void main(String[] args) {
        String nomeArquivoOrigem = "meuarquivo.txt";
        String nomeArquivoDestino = "meuarquivo_python.txt";
        String palavraOrigem = "Java";
        String palavraDestino = "Python";

        try {
            // Abre o arquivo para leitura
            BufferedReader reader = new BufferedReader(new FileReader(nomeArquivoOrigem));

            // Cria um novo arquivo para escrita
            FileWriter fileWriter = new FileWriter(nomeArquivoDestino);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Lê cada linha do arquivo e substitui a palavra
            String linha = null;
            while ((linha = reader.readLine()) != null) {
                String linhaModificada = linha.replaceAll(palavraOrigem, palavraDestino);
                writer.write(linhaModificada);
                writer.newLine();
            }

            // Fecha o BufferedReader e o BufferedWriter
            reader.close();
            writer.close();

            // Exibe uma mensagem de sucesso
            System.out.println("A palavra " + palavraOrigem + " foi substituída por " + palavraDestino + " em " + nomeArquivoDestino);
        } catch (IOException e) {
            System.err.println("Erro ao ler ou escrever no arquivo: " + e.getMessage());
        }
    }
}