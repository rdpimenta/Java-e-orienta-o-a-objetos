public class TesteIR {
    public static void main(String[] args) {
        double salario = 3300.0;
        double impostoRenda = 0;
        int valorDeduzido = 0;

        if (salario >= 1900.00 && salario <= 2800.0) {
            impostoRenda = 7.5;
            valorDeduzido = 142;
        } else if (salario >= 2800.01 && salario < 3751.0) {
            impostoRenda = 15;
            valorDeduzido = 350;
        } else if(salario >= 3751.01 && salario <= 4664.0) {
            impostoRenda = 22.5;
            valorDeduzido = 636;
        }

        System.out.println("O imposto é de " + impostoRenda + "% e o valor deduzido é de R$" + valorDeduzido);
    }
}
