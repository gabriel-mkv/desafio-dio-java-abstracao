package br.com.gabrielmkv.challengeDIO.app;

import java.time.LocalDate;

import br.com.gabrielmkv.challengeDIO.domain.*;

public class Main {
    
    public static void main(String[] args) {
        Bootcamp bootcamp1 = new Bootcamp("Accenture", "Bootcamp realizado em parceria com a Accenture para desenvolvimento Java & Cloud");
        Bootcamp bootcamp2 = new Bootcamp("Santander", "Bootcamp voltado ao desenvolvimento Web em parceria com o Santander");

        Curso curso1 = new Curso("Java", "Curso de Java para iniciantes", 8, 1);
        Curso curso2 = new Curso("Spring Boot", "Desenvolvimento de APIs com Spring Boot", 4, 3);
        Curso curso3 = new Curso("JavaScript", "Fundamentos de JavaScript para Web", 3, 1);

        Mentoria mentoria1 = new Mentoria(
            "Carreira em Java",
            "Mentoria sobre caminhos e oportunidades na carreira Java",
            LocalDate.parse("2026-01-22")
        );

        Mentoria mentoria2 = new Mentoria(
            "Boas práticas em Spring",
            "Mentoria focada em clean code e boas práticas com Spring Boot",
            LocalDate.parse("2026-02-10")
        );

        Mentoria mentoria3 = new Mentoria(
            "Preparação para entrevistas",
            "Mentoria com dicas técnicas e comportamentais para entrevistas",
            LocalDate.parse("2026-03-05")
        );

        bootcamp1.getConteudoBootcamp().add(curso1);
        bootcamp1.getConteudoBootcamp().add(curso2);
        bootcamp1.getConteudoBootcamp().add(mentoria1);
        bootcamp1.getConteudoBootcamp().add(mentoria2);
        bootcamp2.getConteudoBootcamp().add(curso3);
        bootcamp2.getConteudoBootcamp().add(mentoria3);

        Dev devPedro = new Dev("Pedro");
        Dev devMateus = new Dev("Mateus");

        devPedro.inscreverBootcamp(bootcamp1);
        devMateus.inscreverBootcamp(bootcamp2);

        System.out.println("Inscrições Pedro: \n\n" + devPedro.getConteudosInscritos());
        System.out.println("\nTotal de XP: "+ devPedro.calcularTotalXP());
        System.out.println("---------------------------------");
        System.out.println("Inscrições Mateus: \n\n" + devMateus.getConteudosInscritos());
        System.out.println("\nTotal de XP: "+ devMateus.calcularTotalXP());
        System.out.println("---------------------------------");
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        devMateus.progredir();
        devMateus.progredir();
        System.out.println("Inscrições Pedro: \n\n" + devPedro.getConteudosConcluidos());
        System.out.println("\nTotal de XP: "+ devPedro.calcularTotalXP());
        System.out.println("---------------------------------");
        System.out.println("Inscrições Mateus: \n\n" + devMateus.getConteudosConcluidos());
        System.out.println("\nTotal de XP: "+ devMateus.calcularTotalXP());
    }

}