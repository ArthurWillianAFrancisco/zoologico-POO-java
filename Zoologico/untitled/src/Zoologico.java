import java.util.ArrayList;
import java.util.List;

class Zoologico {
    List<Animal> animais = new ArrayList<>();
    List<Pessoa> pessoas = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            System.out.println(animal.nome + " da espécie " + animal.especie);
        }
    }

    public void listarPessoas() {
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Funcionario) {
                System.out.println("Funcionário: " + ((Funcionario) pessoa).nome);
            } else if (pessoa instanceof Visitante) {
                System.out.println("Visitante: " + ((Visitante) pessoa).nome);
            }
        }
    }
}
