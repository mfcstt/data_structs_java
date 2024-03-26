package circular;

import validacao.Validar;


public class Atendimento {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Bem vindo ao sistema de atendimento!");

        boolean sair = false;
        int opcaoEscolhida = 0;

        while (!sair) {

            System.out.println("Escolha uma opção:");

            opcaoEscolhida = Validar.validaOpcaoMenu(
            "  1 - Inserir paciente na fila de atendimento" + "\n" + 
            "  2 - Chamar paciente" + "\n" +
            "  3 - Imprimir fila de atendimento" + "\n" + 
            "  4 - Sair do sistema",
             "Digite um valor inteiro!", 
             true);
            
            switch (opcaoEscolhida){
                case 1:
                    FunçõesAtendimento.inserirPaciente();
                    break;
                case 2:
                    FunçõesAtendimento.chamarPaciente();
                    break;
                case 3:
                    FunçõesAtendimento.imprimirFilaAtendimento();
                    break;
                case 4:
                    System.out.println("Saindo do sistema");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
    