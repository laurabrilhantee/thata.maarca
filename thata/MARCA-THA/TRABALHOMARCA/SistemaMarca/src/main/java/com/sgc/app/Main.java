package main.java.com.sgc.app;

import java.util.ArrayList;
import java.util.Scanner;

import main.java.com.sgc.modelos.Marca;

public class Main {

    private static ArrayList<Marca> marcas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean executando = true;

        while (executando) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> cadastrarMarca();
                case 2 -> listarMarcas();
                case 3 -> buscarMarca();
                case 0 -> executando = false;
                default -> System.out.println("Opção inválida!");
            }
        }

        scanner.close();
        System.out.println("Sistema encerrado.");
    }

    private static void exibirMenu() {
        System.out.println("\n=== SISTEMA DE MARCAS ===");
        System.out.println("1 - Cadastrar Marca");
        System.out.println("2 - Listar Marcas");
        System.out.println("3 - Buscar Marca por nome");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarMarca() {
        System.out.println("\n=== CADASTRAR MARCA ===");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Fundador: ");
        String fundador = scanner.nextLine();

        System.out.print("Ano de Fundação: ");
        int anoFundacao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Segmento: ");
        String segmento = scanner.nextLine();

        Marca marca = new Marca(nome, fundador, anoFundacao, segmento);
        marcas.add(marca);

        System.out.println("Marca cadastrada com sucesso!");
    }

    private static void listarMarcas() {
        System.out.println("\n=== LISTA DE MARCAS ===");

        if (marcas.isEmpty()) {
            System.out.println("Nenhuma marca cadastrada.");
            return;
        }

        for (Marca marca : marcas) {
            System.out.println(marca);
        }
    }

    private static void buscarMarca() {
        System.out.println("\n=== BUSCAR MARCA ===");

        if (marcas.isEmpty()) {
            System.out.println("Nenhuma marca cadastrada.");
            return;
        }

        System.out.print("Digite o nome da marca: ");
        String nomeBusca = scanner.nextLine();

        for (Marca marca : marcas) {
            if (marca.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Marca encontrada:");
                System.out.println(marca);
                return;
            }
        }

        System.out.println("Marca não encontrada.");
    }
}