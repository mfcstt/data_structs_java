package circular;

import validacao.Validar;

public class FunçõesAtendimento {
    
    static void inserirPaciente() {
        int tipoDeAtendimento = Validar.validaOpcaoMenu( 
            "Digite o tipo de atendimento:" + "\n" + 
            "1 - Prioritário" + "\n" + 
            "2 - Padrão",
            "Digite um valor inteiro!", true);

            String paciente = Validar.validaPaciente(
                "Digite o nome do paciente",
                "Digite um nome válido!", true);

        switch (tipoDeAtendimento) {
            case 1:
                    if (!AtendimentoPrioritario.estaCheia()) {
                        AtendimentoPrioritario.inserir(paciente);
                        System.out.println("Paciente inserido no atendimento prioritário");
                        break;
                    } else if (!AtendimentoPadrao.estaCheia()) {
                        System.out.println("Não foi possível inserir o paciente no atendimento prioritário" + "\n" + 
                        "Paciente inserido no atendimento padrão");
                        AtendimentoPadrao.inserir(paciente);
                        break;
                    }
                    else{
                        System.out.println("Não foi possível inserir o paciente, os atendimentos estão cheios");
                    }
                    break;
              

            case 2:
                    if (!AtendimentoPadrao.estaCheia()) {
                        AtendimentoPadrao.inserir(paciente);
                        System.out.println("Paciente inserido no atendimento padrão");
                        break;
                    } 
                    else{
                        System.out.println("Não foi possível inserir o paciente, o atendimento padrão esta cheio");
                    
                    }
                    break;
                    }
              
        }
    
      
    static void chamarPaciente() {
        if(!AtendimentoPrioritario.estaVazia()){
            System.out.println("Paciente chamado: " + AtendimentoPrioritario.remover());
        } else if(!AtendimentoPadrao.estaVazia()){
            System.out.println("Paciente chamado: " + AtendimentoPadrao.remover());
        } else {
            System.out.println("Não há pacientes para chamar");
        }
    }

    static void imprimirFilaAtendimento() {
        System.out.println("Atendimento prioritário: " + AtendimentoPrioritario.imprimir());
        System.out.println("Atendimento padrão: " + AtendimentoPadrao.imprimir());
    }
}

