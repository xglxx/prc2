package ru.mirea2419.prc2.Kruchkov;

public class testAuthor
{
    public static void main(String[] args)
    {
        Author d1 = new Author("Pushcin.A", "Pushcin99", 'm');
        Author d2 = new Author("Akhmatova.A", "Akhmatova89", 'f');
        Author d3 = new Author("Gogol.N", "Gogol09", 'm');

        d1.setEmail("like");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
