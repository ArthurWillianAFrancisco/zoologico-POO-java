public abstract class Animal implements SerVivo {
    String nome;
    int idade;
    String especie;

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public void alimentar() {
        System.out.println(nome + " foi alimentado.");
    }

    public void movimentar() {
        System.out.println(nome + " está se movendo.");
    }
    public void banho() {
        System.out.println(nome + " está no banho.");
    }

    public abstract void emitirSom();
}

class Mamifero extends Animal {
    public Mamifero(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    public void amamentar() {
        System.out.println(nome + " está amamentando.");
    }

    public void emitirSom() {
        System.out.println(nome + " rugiu.");
    }

}
