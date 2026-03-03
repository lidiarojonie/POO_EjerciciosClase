public class Main{
    public static void main(String[] args) {
        // Crear abuelos
        //3 abuelos para 2 nietos
        Abuelo Carlos = new Abuelo("Carlos", "Garcia Perez", Genero.HOMBRE, "15/02/1935", 478596547, "Calle primera, 104 5ºG", 1, "12345678Z", "Abi", Relacion.PATERNO, 700);
        Abuelo Maria = new Abuelo("María", "Sánchez Ruiz", Genero.MUJER, "22/08/1952", 611222333, "Av. Constitución 5", 2, "87654321B", "Yaya Mari", Relacion.MATERNO, 1100);
        Abuelo Pedro = new Abuelo("Pedro", "Gómez Marín", Genero.HOMBRE, "10/01/1948", 622333444, "Plaza España 10", 3, "11223344C", "Abu Pedro", Relacion.PATERNO, 1500);

        //4 abuelos para 5 nietos
        Abuelo Carmen = new Abuelo("Carmen", "Díaz Ferrero", Genero.MUJER, "30/03/1955", 633444555, "Calle Luna 12", 4, "44332211D", "Abuela Carmen", Relacion.MATERNO, 950);
        Abuelo Antonio = new Abuelo("Antonio", "Moreno Cano", Genero.HOMBRE, "05/12/1945", 644555666, "Calle Sol 3", 5, "55667788E", "Papá Antonio", Relacion.PATERNO, 1350);
        Abuelo Josefa = new Abuelo("Josefa", "Rubio Sanz", Genero.MUJER, "14/07/1951", 655666777, "Calle Estrecha 2", 6, "99887766F", "Fina", Relacion.MATERNO, 1050);
        Abuelo Francisco = new Abuelo("Francisco", "Vázquez Rey", Genero.HOMBRE, "28/02/1949", 666777888, "Calle Nueva 45", 7, "22446688G", "Paco", Relacion.PATERNO, 1400);

        // Crear nietos
        //2 nietos para 3 abuelos
        Nieto Lucas = new Nieto("Lucas", "García Sanz", Genero.HOMBRE, "12/04/2015", 700101010, "Calle Mayor 1", 1, 10, "Fútbol");
        Nieto Sofia = new Nieto("Sofía", "García Sanz", Genero.MUJER, "25/11/2017", 700202020, "Calle Mayor 1", 2, 5, "Dibujo");

        //5 nietos para 4 abuelos
        Nieto Mateo = new Nieto("Mateo", "Pérez Díaz", Genero.HOMBRE, "03/01/2014", 700303030, "Av. Libertad 4", 3, 15, "Videojuegos");
        Nieto Valeria = new Nieto("Valeria", "Pérez Díaz", Genero.MUJER, "19/06/2019", 700404040, "Av. Libertad 4", 4, 5, "Baile");
        Nieto Leo = new Nieto("Leo", "Rodríguez Moreno", Genero.HOMBRE, "08/08/2012", 700505050, "Calle Pez 9", 5, 20, "Ajedrez");
        Nieto Martina = new Nieto("Martina", "Rodríguez Moreno", Genero.MUJER, "30/09/2016", 700606060, "Calle Pez 9", 6, 10, "Lectura");
        Nieto Hugo = new Nieto("Hugo", "López Rubio", Genero.HOMBRE, "15/02/2013", 700707070, "Calle Real 21", 7, 12, "Baloncesto");

        // Relaciones
        //Abuelo-Nieto
        Carlos.addnietos(Lucas);
        Carlos.addnietos(Sofia);
        Maria.addnietos(Lucas);
        Maria.addnietos(Sofia);
        Pedro.addnietos(Lucas);
        Pedro.addnietos(Sofia);

        Carmen.addnietos(Mateo);
        Carmen.addnietos(Valeria);
        Carmen.addnietos(Leo);
        Carmen.addnietos(Martina);
        Carmen.addnietos(Hugo);
        Antonio.addnietos(Mateo);
        Antonio.addnietos(Valeria);
        Antonio.addnietos(Leo);
        Antonio.addnietos(Martina);
        Antonio.addnietos(Hugo);
        Josefa.addnietos(Mateo);
        Josefa.addnietos(Valeria);
        Josefa.addnietos(Leo);
        Josefa.addnietos(Martina);
        Josefa.addnietos(Hugo);
        Francisco.addnietos(Mateo);
        Francisco.addnietos(Valeria);
        Francisco.addnietos(Leo);
        Francisco.addnietos(Martina);
        Francisco.addnietos(Hugo);

        // Probar si funcionan los nietos ideales y el calculo de pagas
        NietoIdeal lucasIdeal = new NietoIdeal("Lucas", "García Sanz", Genero.HOMBRE, "12/04/2015", 700101010, "Calle Mayor 1", 1, 10, "Fútbol");
        lucasIdeal.addHabilidad("Cariñoso");
        lucasIdeal.addHabilidad("Toca el piano");

        // Le asignamos abuelos (como ya hacías)
        lucasIdeal.addAbuelo(Carlos);
        lucasIdeal.addAbuelo(Maria);
        lucasIdeal.addAbuelo(Pedro);

        // Ver el cálculo
        System.out.println("Paga de Lucas: " + lucasIdeal.calculoPaga() + "€");
        // (10€ de paga * 3 abuelos) + (2 habilidades * 5€) = 40€


    }
}