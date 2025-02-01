package com.example.signos.repositories;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.example.signos.entities.Signo;

public class SignoRepository {

    public static List<Signo> signos = new ArrayList<>();

    public static void iniciarSignos() {
        signos.add(new Signo(1, "Dragón", "Metal", "Lorem ipsum",
                "https://picsum.photos/480/640",
                LocalDate.of(2000, 2, 5),
                LocalDate.of(2001, 1, 23)));
        signos.add(new Signo(2, "Serpiente", "Metal", "Lorem ipsum",
                "https://picsum.photos/480/640",
                LocalDate.of(2001, 1, 25),
                LocalDate.of(2002, 2, 11)));
        signos.add(new Signo(3, "Caballo", "Agua", "Lorem ipsum",
                "https://picsum.photos/480/640",
                LocalDate.of(2002, 2, 12),
                LocalDate.of(2003, 1, 31)));
        signos.add(new Signo(4, "Cabra", "Agua", "Lorem ipsum",
                "https://picsum.photos/480/640",
                LocalDate.of(2003, 2, 2),
                LocalDate.of(2004, 1, 21)));
        signos.add(new Signo(5, "Mono", "Madera", "Lorem ipsum",
                "https://picsum.photos/480/640",
                LocalDate.of(2004, 1, 25),
                LocalDate.of(2005, 2, 8)));
        signos.add(new Signo(6, "Gallo", "Madera", "Lorem ipsum",
                "https://picsum.photos/480/640",
                LocalDate.of(2005, 2, 8),
                LocalDate.of(2006, 1, 28)));
        signos.add(new Signo(7, "Perro", "Fuego", "Lorem ipsum",
                "https://picsum.photos/480/640",
                LocalDate.of(2006, 1, 29),
                LocalDate.of(2007, 2, 17)));
        signos.add(new Signo(8, "Cerdo", "Fuego", "Lorem ipsum",
                "https://picsum.photos/480/640",
                LocalDate.of(2007, 2, 18),
                LocalDate.of(2008, 2, 6)));
        signos.add(new Signo(9, "Rata", "Tierra", "Lorem ipsum",
                "https://picsum.photos/480/640",
                LocalDate.of(2008, 2, 7),
                LocalDate.of(2009, 1, 25)));
        signos.add(new Signo(10, "Buey", "Tierra", "Lorem ipsum",
                "https://picsum.photos/480/640",
                LocalDate.of(2009, 1, 26),
                LocalDate.of(2010, 2, 13)));
    }
}
