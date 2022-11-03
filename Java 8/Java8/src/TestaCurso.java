import java.util.*;
import java.util.stream.Collectors;

public class TestaCurso {
    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.forEach(curso -> System.out.println(curso.getNome()));
        System.out.println("----------");

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

        cursos.forEach(curso -> System.out.println(curso.getNome()));
        System.out.println("----------");

        cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .forEach(c -> System.out.println(c.getNome()));
        System.out.println("----------");

        cursos.stream()
                .map(Curso::getAlunos)
                .filter(alunos -> alunos > 100)
                .forEach(System.out::println);
        System.out.println("----------");

        cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));
        System.out.println("----------");

        Map<String, Integer> mapa = cursos
                .stream()
                .filter(c -> c.getAlunos() > 100)
                .collect(Collectors.toMap(Curso::getNome, Curso::getAlunos));

        cursos.stream()
                .filter(c -> c.getAlunos() > 50)
                .findFirst()
                .ifPresent(c -> System.out.println(c.getNome()));
        System.out.println("----------");

        cursos.stream()
                .mapToInt(Curso::getAlunos)
                .average()
                .ifPresent(c -> System.out.println("Média de alunos: " + c));
    }
}
