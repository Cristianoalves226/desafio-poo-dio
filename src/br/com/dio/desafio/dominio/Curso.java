package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;



    public int getCargaHoraria(int i) {
        return cargaHoraria;
    }

    public void setCargaHoraria(int i) {
        this.cargaHoraria = i;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
}
