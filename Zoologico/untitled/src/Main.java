import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("#################################");
        System.out.println("Bem vindo ao Zoológico do ArtWill");
        System.out.println("##################################");
        System.out.println("\n");

        Zoologico zoo = new Zoologico();

        // Criando animais
        Animal leao = new Mamifero("Leão", 5, "Felino");
        Animal elefante = new Mamifero("Elefante", 10, "Elefantídeo");

        // Criando pessoas
        Pessoa funcionario = new Funcionario("Carlos", "Zelador");
        Pessoa visitante = new Visitante("Ana", 30);

        // Adicionando ao zoológico
        zoo.adicionarAnimal(leao);
        zoo.adicionarAnimal(elefante);
        zoo.adicionarPessoa(funcionario);
        zoo.adicionarPessoa(visitante);

        Scanner entrada = new Scanner(System.in);
        String escolha = null;

        while (escolha != "0") {
            System.out.println("O que você gostaria fazer?");
            System.out.println(" 1- Ver lista dos animais do zoológico");
            System.out.println(" 2- Ver as pessoas que estam no zoológico");
            System.out.println(" 3- Ver o que os animal estam fazendo");
            System.out.println(" 4- Ver o que as pessoas estam fazendo");

            System.out.println("Escolha a ação a ser executada ");
            escolha = entrada.nextLine();
            System.out.println("\n");

            switch (escolha) {
                case "1":
                    zoo.listarAnimais();
                    System.out.println("\n\n");
                    break;

                case "2":
                    zoo.listarPessoas();
                    System.out.println("\n\n");
                    break;
                case "3":
                    leao.emitirSom();
                    elefante.banho();
                    System.out.println("\n\n");
                    break;
                case "4":
                    funcionario.movimentar();
                    visitante.entrarNoZoologico();
                    visitante.observarAnimais();
                    funcionario.cuidarAnimais();
                    System.out.println("\n\n");
                    break;
                default:
                    System.out.println("Obrigado, volte sempre");
                    System.exit(0);

            }
        }


//        // Listar animais e pessoas
//        zoo.listarAnimais();
//        zoo.listarPessoas();
//
//        // Ações
//        leao.emitirSom();
//        elefante.banho();
//        funcionario.movimentar();
//        visitante.entrarNoZoologico();
//        visitante.observarAnimais();
//        funcionario.cuidarAnimais();
    }
}
