package trabalho_final;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private ArrayList<Animal> pets; // armazenamento de todos os pets

    public Cliente() {
        this.nome = "";
        this.cpf = "";
        this.telefone = "";
        this.email = "";
        this.pets = new ArrayList<>();
    }

    public Cliente(String nome, String cpf, String telefone, String email, ArrayList<Animal> pets) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.pets = pets;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Animal getPet(int indice) {
        return this.pets.get(indice);
    }

    public void setPet(int index, Animal petNovo) {
        this.pets.set(index, petNovo);
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nCPF: " + cpf +
                "\nTelefone: " + telefone +
                "\nE-mail: " + email +
                "\nNúmero de Pets: " + this.pets.size();

    }
}
