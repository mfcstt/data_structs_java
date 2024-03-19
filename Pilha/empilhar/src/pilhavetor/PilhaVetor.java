
package pilhavetor;


public class PilhaVetor {
    
    public static void main(String[] args) {

        char[] pilha = new char[20]; 
        Pilha.empilhar(pilha);
        
        while (!Pilha.estaVazia()) {
        System.out.println("Desempilhando: " + Pilha.desempilha(pilha));   
        }
}
}
