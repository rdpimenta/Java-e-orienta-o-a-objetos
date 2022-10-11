public class TestaLacos {
    public static void main(String[] args) {
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            StringBuilder linha = new StringBuilder();
            for (int contador = 0; contador <= 10; contador++) {
                int numero = multiplicador * contador;
                if (numero < 10 && numero != 9) {
                    if (((contador + 1) * multiplicador) < 10) {
                        linha.append(multiplicador * contador).append("   ");
                    } else {
                        linha.append(multiplicador * contador).append("  ");
                    }
                } else if (contador == 9 && ((contador + 1) * multiplicador) < 100){
                    linha.append(multiplicador * contador).append("   ");
                } else {
                    linha.append(multiplicador * contador).append("  ");
                }
            }
            System.out.println(linha);
        }
    }
}
