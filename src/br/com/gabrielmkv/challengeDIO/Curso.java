package br.com.gabrielmkv.challengeDIO;

public class Curso extends Conteudo {
    
    private int cargaHoraria;

    @Override
    public double calcularXP(){
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        setCargaHoraria(cargaHoraria);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria > 0 && cargaHoraria < 10) {
            this.cargaHoraria = cargaHoraria;
        } 
    }

    @Override
    public String toString() {
        return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
    }  

}