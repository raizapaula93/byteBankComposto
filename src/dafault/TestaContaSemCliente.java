package dafault;

public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDoGuilherme = new Conta();
        System.out.println(contaDoGuilherme.getSaldo());

        contaDoGuilherme.titular = new Cliente();
        System.out.println(contaDoGuilherme.titular);

        contaDoGuilherme.titular.nome = "Guilherme Silveira";
        System.out.println( contaDoGuilherme.titular.nome);
    }
}
