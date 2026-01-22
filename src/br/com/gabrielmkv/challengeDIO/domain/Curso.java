package br.com.gabrielmkv.challengeDIO.domain;

public class Curso extends Conteudo {
    
    private int cargaHoraria;
    private int nivelDificuldade;

    @Override
    public double calcularXP(){
        return XP_PADRAO * (cargaHoraria * nivelDificuldade);
    }

    public Curso(String titulo, String descricao, int cargaHoraria, int nivelDificuldade) {
        super(titulo, descricao);
        setCargaHoraria(cargaHoraria);
        setNivelDificuldade(nivelDificuldade);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria > 0 && cargaHoraria < 10) {
            this.cargaHoraria = cargaHoraria;
        } 
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }
    public void setNivelDificuldade(int nivelDificuldade) {
        if (nivelDificuldade >= 1 || nivelDificuldade <= 3)
            this.nivelDificuldade = nivelDificuldade;
        else {
            System.err.println("Nível de dificuldade inválido!");
        }
    }

    @Override
    public String toString() {
        return "Curso {\n" +
            "  titulo='" + getTitulo() + "',\n" +
            "  descricao='" + getDescricao() + "',\n" +
            "  carga_horaria=" + cargaHoraria + "\n" +
            "  nivel_dificuldade=" + nivelDificuldade + "\n" +
            "}";
    }

}