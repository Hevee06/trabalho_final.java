package trabalho_final;

import java.util.ArrayList;

public class PetShop {
    private ArrayList<Cliente> clientes; // clientes do petshop
    private ArrayList<Funcionario> funcionarios; // funcionarios do petshop

    public PetShop() { // construtor padrão
        this.clientes = new ArrayList();
        this.funcionarios = new ArrayList();
    }

    public PetShop(ArrayList<Cliente> clientes, ArrayList<Funcionario> funcionarios) {
        this.clientes = clientes;
        this.funcionarios = funcionarios;
    }

    public Cliente getCliente(int indice) {
        return this.clientes.get(indice);
    }

    public void setCliente(int index, Cliente novoCliente) {
        this.clientes.set(index, novoCliente);
    }

    public Cliente getFuncionario(int indice) { // busca por indice
        return this.funcionarios.get(indice);
    }

    public void setFuncionarios(int index, Funcionario novoFunc) {
        this.funcionarios.set(index, novoFunc);
    }

    @Override
    public String toString() {
        return "\nTotal de funcionários: " + funcionarios.size() +
                "\nTotal de Clientes registrados: " + clientes.size();
    }
}
