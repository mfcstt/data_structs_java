package circular;

import validacao.Validar;

public class FunçõesAtendimento {
    
    static void inserirPaciente() {
        int tipoDeAtendimento = Validar.validaOpcaoMenu( 
            "Digite o tipo de atendimento:" + "\n" + 
            "1 - Prioritário" + "\n" + 
            "2 - Padrão",
            "Digite um valor inteiro!", true);

        switch (tipoDeAtendimento) {
            case 1:
            case 2:
                String paciente = Validar.validaPaciente(
                    "Digite o nome do paciente",
                    "Digite um nome válido!", true);
                try {
                if (tipoDeAtendimento == 1 && !AtendimentoPrioritario.estaCheia()) {
                        AtendimentoPrioritario.inserir(paciente);
                        System.out.println("Paciente inserido no atendimento prioritário");
                
                    } else if (!AtendimentoPadrao.estaCheia()) {
                        System.out.println("Não foi possível inserir o paciente no atendimento prioritário" + "\n" + 
                        "Paciente inserido no atendimento padrão");
                        AtendimentoPadrao.inserir(paciente);
                    } else {
                        throw new RuntimeException("Atendimento Prioritário cheio");
                    }
                    break;
                    
                } catch (Exception e) {
                    System.out.println("Não foi possível inserir o paciente no" + tipoDeAtendimento );
                }
                
            default:
                System.out.println("Opção inválida! Por favor, digite 1 para Atendimento Prioritário ou 2 para Atendimento Padrão.");
                break;
        }
    }
      

    static void chamarPaciente() {
        int chamarPaciente = Validar.validaOpcaoMenu(
            "Qual fila deseja chamar? "+ "\n" +
             "1 - Atendimento Prioritário" + "\n" + 
             "2 - Atendimento Padrão", 
             "Digite um valor inteiro!", true);
        switch (chamarPaciente) {
            case 1:
                if(!AtendimentoPrioritario.estaVazia()){
                    System.out.println("Paciente chamado: " + AtendimentoPrioritario.remover());
                } else {
                    System.out.println("Não há pacientes na fila");
                }
                break;
            case 2:
                if(!AtendimentoPadrao.estaVazia()){
                    System.out.println("Paciente chamado: " + AtendimentoPadrao.remover());
                } else {
                    System.out.println("Não há pacientes na fila");
                }
                break;
            default:
                break;
        }
    }

    static void imprimirFilaAtendimento() {
        System.out.println("Atendimento prioritário: " + AtendimentoPrioritario.imprimir());
        System.out.println("Atendimento padrão: " + AtendimentoPadrao.imprimir());
    }
}

