public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author lermontov = new Author("Михаил", "Лермонтов");

        Book kapitanskayaDochka = new Book("Капитанская дочка", pushkin, 1980);
        Book kapitanskayaDochka2 = new Book("Капитанская дочка", pushkin, 1980);
        Book maskarad = new Book("Маскарад", lermontov, 1987);
        System.out.println(kapitanskayaDochka);
        System.out.println(maskarad);
        System.out.println(kapitanskayaDochka.equals(maskarad));
        System.out.println(kapitanskayaDochka.equals(kapitanskayaDochka2));

        kapitanskayaDochka.setPublishYear(2000);

        System.out.println(kapitanskayaDochka.equals(kapitanskayaDochka2));
    }
}
