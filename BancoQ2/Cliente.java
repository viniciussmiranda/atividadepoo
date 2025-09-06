public class Cliente {
    private String nome, cpf;
    private int saldo, numConta;

    public Cliente(String nome, String cpf, int numConta) {
        setNome(nome);
        setCpf(cpf);
        setNumConta(numConta);
        setSaldo(0);
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getNumConta() {
        return numConta;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public int extrato() {
        return getSaldo();
    }

    public void saque(int val) {
        System.out.println(getNome() + "Realizou um saque no valor de " + val);
        setSaldo(getSaldo() - val);
    }

    public void deposito(int val) {
        System.out.println(getNome() + "Realizou um depósito no valor de " + val);
        setSaldo(getSaldo() + val);
    }

    public String toString() {
        return "Cliente: " + getNome() + "\n CPF: " + getCpf() + "\n N Conta: " + getNumConta() + "Saldo: " + getSaldo();
    }
}