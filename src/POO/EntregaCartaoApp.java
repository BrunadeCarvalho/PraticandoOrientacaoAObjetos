package POO;

import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "000000";


        Cliente cliente = new Cliente();

        cliente.adicionarEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso!");
        }
    }

