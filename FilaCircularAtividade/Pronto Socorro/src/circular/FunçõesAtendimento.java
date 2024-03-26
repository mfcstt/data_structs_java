package circular;

import validacao.Validar;

public class FunçõesAtendimento {

    static void inserirPaciente() {
        int tipoDeAtendimento = Validar.validaOpcaoMenu( 
                    "Digite o tipo de atendimento:" + "\n" + 
                    "1 - Prioritário" + "\n" + 
                    "2 - Padrão",
                    "Digite um valor inteiro!", true);
        try {
            String paciente = Validar.validaPaciente(
                "Digite o nome do paciente",
                "Digite um nome válido!",
                true);
            if (tipoDeAtendimento == 1) {
                if (!AtendimentoPrioritario.estaCheia()) {
                    AtendimentoPrioritario.inserir(paciente);
                    System.out.println("Paciente inserido no atendimento prioritário");
                } else if (!AtendimentoPadrao.estaCheia()) {
                    System.out.println("Não foi possível inserir o paciente no atendimento prioritário" + "\n" + 
                    "Paciente inserido no atendimento padrão");
                    AtendimentoPadrao.inserir(paciente);
                }
                else {
                    throw new RuntimeException("Atendimento Prioritário cheio");
                }
            } else if (tipoDeAtendimento == 2) {
                if (!AtendimentoPadrao.estaCheia()) {
                    AtendimentoPadrao.inserir(paciente);
                    System.out.println("Paciente inserido no atendimento padrão");
                } else if (!AtendimentoPrioritario.estaCheia()){
                    System.out.println("Não foi possível inserir o paciente no atendimento padrão" + "\n" + 
                    "Paciente inserido no atendimento prioritário");
                    AtendimentoPrioritario.inserir(paciente);
                }
                else {
                    throw new RuntimeException("Atendimento Padrão cheio");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Atendimentos cheios");
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
                System.out.println("Opção inválida");
                break;
        }
    }

    static void imprimirFilaAtendimento() {
        System.out.println("Atendimento prioritário: " + AtendimentoPrioritario.imprimir());
        System.out.println("Atendimento padrão: " + AtendimentoPadrao.imprimir());
    }
}

