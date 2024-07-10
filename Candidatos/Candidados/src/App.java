import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class App {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe", "Marcia", "Jullia", "Paulo", "Augusto"};
        for(String candidato: candidatos){
            entrandoEmContato(candidato);
            }
        }
        static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu=false;
            do {
                atendeu = atender();
                continuarTentando = !atendeu;
                if(continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("Contato Realizado com Sucesso");

            }while(continuarTentando && tentativasRealizadas <3);

            if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " NA " + tentativasRealizadas + " Tentativas");
            else System.out.println("Não Conseguimos contato com " + candidato + ", Número máximo de tentativas " + tentativasRealizadas + " Realizadas" );

    }

    //método auxiliar 
        static boolean atender(){
            return new Random().nextInt(3)==1;
        }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia", "Jullia", "Paulo", "Augusto",};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice=0; indice < candidatos.length; indice++){
        System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de interação for each");

        for(String candidato: candidatos ){
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Felipe", "Marcia", "Jullia", "Paulo", "Augusto", "Monica", "Fabrico", "Mirela", "João", "Ana" };
    
        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        double salarioBase=2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados ++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
        System.out.println("Ligar para o Candidato");
    }else if(salarioBase == salarioPretendido)
        System.out.println("Ligar para o Candidato com Contra Proposta");
    else {
        System.out.println("Aguardando o Resultado dos demais candidatos");
        }
    }
}