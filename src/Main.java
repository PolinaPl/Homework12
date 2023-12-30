public class Main {
    public static void main(String[] args) {
Author pushkin = new Author("Александр", "Пушкин");
Author lermontov = new Author("Михаил", "Лермонтов");

Book kapitanskayaDochka = new Book("Капитанская дочка", pushkin, 1980);
Book maskarad = new Book("Маскарад", lermontov, 1987);
 System.out.println(kapitanskayaDochka.getTitle()+ " "+ kapitanskayaDochka.getAuthor().getFirstName()
        + " " + kapitanskayaDochka.getAuthor().getSecondName() + " " + kapitanskayaDochka.getPublishYear());
 System.out.println(maskarad.getTitle() + " "+ maskarad.getAuthor().getFirstName() + " " +
                maskarad.getAuthor().getSecondName() + " " + maskarad.getPublishYear());

kapitanskayaDochka.setPublishYear(2000);
        System.out.println(kapitanskayaDochka.getTitle()+ " "+ kapitanskayaDochka.getAuthor().getFirstName()
        + " " + kapitanskayaDochka.getAuthor().getSecondName() + " " + kapitanskayaDochka.getPublishYear());


    }
}