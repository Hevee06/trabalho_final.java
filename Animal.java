package trabalho_final;

public class Animal {
    private String nome;
    private char porte; // tamanho do animal: (P / M / G).
    private String especie; // cão ou gato
    private char sexo; // F ou M
    private Cliente dono; // dados do dono
    private String servicoPrestado; // ultimo serviço fornecido ao pet

    public Animal() { // construtor padrão
        this.nome = "";
        this.porte = '\0';
        this.especie = "";
        this.sexo = '\0';
        this.dono = null;
        this.servicoPrestado = "";
    }

    public Animal(String nome, char porte, String especie, char sexo, Cliente dono, String servico) {
        this.nome = nome;
        this.porte = porte;
        this.especie = especie;
        this.sexo = sexo;
        this.dono = dono;
        this.servicoPrestado = servico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getPorte() {
        return porte;
    }

    public void setPorte(char porte) {
        this.porte = porte;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public String getServicoPrestado() {
        return servicoPrestado;
    }

    public void setServicoPrestado(String servicoPrestado) {
        this.servicoPrestado = servicoPrestado;
    }

    @Override
    public String toString() {
        return "\nNome: " + this.nome +
                "\nPorte: " + this.porte +
                "\nEspecie: " + this.especie +
                "\nSexo: " + this.sexo +
                "\nNome do dono: " + this.dono.getNome() +
                "\nÚltimo serviço prestado: " + this.servicoPrestado;
    }

}