package dafault;

public class TestaBanco {

    public static void main(String[] args) {
        Cliente raiza = new Cliente();
        raiza.nome = "Raiza de Paula";
        raiza.cpf = "111.111.111-11";
        raiza.profissao = "programadora";

        Conta contaDaRaiza = new Conta();
        contaDaRaiza.deposita(100);

        //associa a cliente raiza à conta contaDaRaiza
        contaDaRaiza.titular = raiza;
        System.out.println(contaDaRaiza.titular.nome);
    }

}
