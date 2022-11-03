import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        System.out.println("----------");

        LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
        System.out.println(olimpiadasRio);
        System.out.println("----------");

        int anos = hoje.getYear() - olimpiadasRio.getYear();
        System.out.println(anos);
        System.out.println("----------");

        Period periodo = Period.between(olimpiadasRio, hoje);
        System.out.println(periodo);
        System.out.println(periodo.getYears());
        System.out.println(periodo.getMonths());
        System.out.println(periodo.getDays());
        System.out.println("----------");

        System.out.println(hoje.minusYears(1));
        System.out.println(hoje.minusMonths(4));
        System.out.println(hoje.minusDays(2));
        System.out.println("----------");

        System.out.println(hoje.plusYears(1));
        System.out.println(hoje.plusMonths(4));
        System.out.println(hoje.plusDays(2));
        System.out.println("----------");

        LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
        System.out.println(proximasOlimpiadas);
        System.out.println("----------");

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String valorFormatado = proximasOlimpiadas.format(formatador);
        System.out.println(valorFormatado);
        System.out.println("----------");

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));
    }
}
