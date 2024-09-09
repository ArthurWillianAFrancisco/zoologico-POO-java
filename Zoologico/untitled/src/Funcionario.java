class Funcionario implements Pessoa {
    String nome;
    String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public void movimentar() {
        System.out.println(nome + " está se movendo para trabalhar.");
    }

    public void alimentar() {
        System.out.println(nome + " está se alimentando no intervalo.");
    }

    public void entrarNoZoologico() {
        System.out.println(nome + " entrou no zoológico para trabalhar.");
    }

    public void cuidarAnimais() {
        System.out.println(nome + " está cuidando dos animais.");
    }

    @Override
    public void observarAnimais() {

    }
}

class Visitante implements Pessoa {
    String nome;
    int idade;

    public Visitante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void movimentar() {
        System.out.println(nome + " está passeando pelo zoológico.");
    }

    public void alimentar() {
        System.out.println(nome + " está comendo no restaurante do zoológico.");
    }

    public void entrarNoZoologico() {
        System.out.println(nome + " entrou no zoológico para visitar.");
    }

    @Override
    public void cuidarAnimais() {

    }

    public void observarAnimais() {
        System.out.println(nome + " está observando os animais.");
    }

}
