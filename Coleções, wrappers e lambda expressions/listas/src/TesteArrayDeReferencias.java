public class TesteArrayDeReferencias {
    public static void main(String[] args) {
        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(22, 22);
        contas[1] = cc2;

        System.out.println(cc2.getNumero());
        System.out.println(contas[1].getNumero());
    }
}
