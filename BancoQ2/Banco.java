import java.util.ArrayList;

public class Banco {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        cadastrarClientes(clientes);
        operacoes(clientes);

    }

    public static void cadastrarClientes(ArrayList<Cliente> clts) {
        clts.add(new Cliente("Alan Turing", "000.000.000-00", 12345678));
        clts.add(new Cliente("Ada Love", "000.000.000-00", 87654321));
    }

    public static void operacoes(ArrayList<Cliente> clts) {
        for (Cliente cliente : clts) {
            cliente.saque(10000);
            cliente.deposito(5000);
            if(cliente.extrato() < 0) {
                cliente.setSaldo(0);
            }
        }

        clts.get(1).setNome("Ada Lovelace");
        clts.get(1).setCpf("123.456.789-00");

        for (Cliente cliente : clts) {
            System.out.println(cliente.toString());
        }
    }
}