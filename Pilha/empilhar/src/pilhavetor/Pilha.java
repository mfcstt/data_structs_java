
package pilhavetor;

import java.util.Scanner;

public class Pilha {

    static Scanner teclado = new Scanner(System.in);
    
    static char[] pilha = new char[50]; 
    static int top = -1;


    
    public static boolean estaCheia(){
        return top == pilha.length - 1;
    }

    public static boolean estaVazia(){
        return top == -1;
    }


    public static void empilhar(char pilha[]){
            if (!estaCheia()){
                System.out.println("Digite uma frase:");
                //converte a frase para char
                String frase = teclado.nextLine();
                char[] fraseVetor = frase.toCharArray();
                for (int i = 0; i < fraseVetor.length; i++) {
                    pilha[++top] = fraseVetor[i];
                }
            }
            else{
                throw new RuntimeException("Pilha Cheia.");
            }
        }
    
    public static char desempilha(char pilha[]){
        char letra = '\0';
        if (!estaVazia()){
            letra = pilha[top];
            pilha[top] = '\0';
            top--;   
        }
        else{
            throw new RuntimeException("Pilha vazia.");
        }
        return letra;
    }
    
    public static char consultaTop(char pilha[]){
        if (!estaVazia()){
            return pilha[top];

        }
        else{
            throw new RuntimeException("Pilha vazia.");
        }
    }
    
    public static String avaliar(){
        String aux = "";
        for (char valor : pilha) {
            aux += valor + " -> ";
        }
        return aux;
    }
    
}
