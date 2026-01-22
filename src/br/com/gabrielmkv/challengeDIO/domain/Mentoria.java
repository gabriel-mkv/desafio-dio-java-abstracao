package br.com.gabrielmkv.challengeDIO.domain;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    
    private LocalDate data;

    @Override
    public double calcularXP(){
        return XP_PADRAO + 10d;
    }

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        setData(data);
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        if (data.isAfter(LocalDate.now()) || data.isEqual(LocalDate.now())) {
            this.data = data;
        } else {
            System.err.println("Data inválida!");
        }
    }

    @Override
    public String toString() {
        return "Mentoria {\n" +
            "  titulo='" + getTitulo() + "',\n" +
            "  descricao='" + getDescricao() + "',\n" +
            "  data=" + data + "\n" +
            "}";
    }
}