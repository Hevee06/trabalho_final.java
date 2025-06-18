package trabalho_final;

public class MainTeste {
    public static void main(String[] args) {
        PetShop ttClientes = new PetShop();
        Cliente clienteTeste = new Cliente();

        Animal petTeste = new Animal("juca", 'M', "Gato", 'M', clienteTeste, "Tosa");
        Animal petTeste2 = new Animal("jaca", 'P', "Cão", 'F', clienteTeste, "Banho");

        clienteTeste.setNome("Luiz");
        clienteTeste.setCpf("12312312312");
        clienteTeste.setTelefone("27992736384");
        clienteTeste.setEmail("Luiz@gmail.com");
        clienteTeste.setPet(petTeste2);
        clienteTeste.setPet(petTeste);

        ttClientes.setCliente(clienteTeste);

        System.out.print(clienteTeste.toString());
        System.out.print(petTeste.toString() + "\n" + petTeste2.toString());
        System.out.println(ttClientes.toString());
    }

}