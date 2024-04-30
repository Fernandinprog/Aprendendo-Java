import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
        String []  candidatos = {"Joao", "Maria", "Pedro", "Ana", "Fernando", "Paulo", "Diego", "Marcia", "Marcelo", "Carlos", "Daniela", "Marcela", "Claudia", "Gustavo", "Luciana"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
        
  }  
  static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{ 
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
            tentativasRealizadas++;
        }while(continuarTentando && tentativasRealizadas < 3);
        if(atendeu)
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
            else
            System.out.println("Não conseguimos contato com " + candidato + " após 3 tentativas");
    }

   static boolean atender(){
        return new Random().nextInt(3)==1;
   }

    static void imprimirSelecionados (){
        String [] candidatos = {"Fernando", "Paulo", "Diego", "Marcia", "Marcelo", "Carlos"};
        System.out.println("Candidatos selecionados:");
        for (int indice =0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n" + (indice+1) + " é " + candidatos[indice]);
        }
    }
  

  static void selecaoCandidatos(){

            String [] candidatos = {"Joao", "Maria", "Pedro", "Ana", "Fernando", "Paulo", "Diego", "Marcia", "Marcelo", "Carlos", "Daniela", "Marcela", "Claudia", "Gustavo", "Luciana"};
            int candidatosSelecionados = 0;
            int candidatosAtual = 0;
            double salarioBase = 2000.0;
            while (candidatosSelecionados <5 && candidatosAtual < candidatos.length) {
                String candidato = candidatos[candidatosAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O candidato " + candidato + " pretende um salário de R$ " + salarioPretendido);
                if(salarioBase >= salarioPretendido) {
                    System.out.println("O candidato" + candidato +"  foi selecionado para a vaga!");
                    candidatosSelecionados++;
                }
                candidatosAtual++;
     }
 }

        static double valorPretendido() {
            return ThreadLocalRandom.current().nextDouble(1800, 2200);
        }

  

static void analisandoCandidato(double salarioPretendido){
    double salarioBase = 2000.0;
    if(salarioBase > salarioPretendido ){
        System.out.println("Ligar para candidato");
    }
    else if(salarioBase == salarioPretendido) {
        System.out.println("Ligar para candidato com contra proposta");

    }
    else{
        System.out.println("Aguardando o resultado dos demais candidatos");
    }
  }
}
