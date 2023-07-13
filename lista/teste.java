package lista;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
    int aux; 
    Scanner sc = new Scanner(System.in);
    Fila<String> fila = new Fila<>();
    while (true){

        System.out.println("Digite uma das Opções");
        System.out.println("Opção 1: Adicionar Elemento");
        System.out.println("Opção 2: Remover Elemento");
        System.out.println("Opção 3: Listar Elemento");
        System.out.println("Opção 4: Sair");
    aux = sc.nextInt();
        if(aux==1){
            System.out.println("Digite um elemento: ");
            String elemento;
            elemento = sc.next();
            fila.enfileirar(elemento);
        }

        if(aux==2){
            fila.desenfileirar();
        }

        if(aux==3){
            System.out.println(fila.listarElementos());
        }

        if(aux==4){
            System.exit(0);
        }

    }

    }

}
