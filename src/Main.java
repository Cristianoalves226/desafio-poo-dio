import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("curso java");
        curso.setDescricao("descrição do curso java");
        curso.getCargaHoraria(0);

        Curso curso1 = new Curso();
        curso1.setTitulo("curso javascript");
        curso1.setDescricao("descrição do curso javascript");
        curso1.setCargaHoraria(10);


        System.out.println(curso);
        System.out.println(curso1);


        Mentoria mentoria  = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição de java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);
    }
}
