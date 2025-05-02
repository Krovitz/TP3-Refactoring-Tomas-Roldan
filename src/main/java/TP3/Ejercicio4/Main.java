package TP3.Ejercicio4;

import org.jdbi.v3.core.Jdbi;

public class Main {
    public static void main(String[] args) {

        Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");

        new SetUpDatabase(jdbi).setUp();

        var repo = new PersonaRepository(jdbi);
        var personas = repo.buscarPorNombre("www");


        for (Persona persona : personas) {
            System.out.println(persona.nombre() + " " + persona.apellido());
        }


        var personaOpt = repo.buscarId(4L);

        personaOpt.ifPresent(persona ->
                System.out.println(persona.nombre() + " " + persona.apellido())
        );

    }
}
