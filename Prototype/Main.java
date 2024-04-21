public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("T1", "A1");
        Book book2 = new Book("T2", "A2");
        Book book3 = new Book("T3", "A3");

        Recomendation rec1 = new Recomendation();
        rec1.setTargetAudience("Au1");
        rec1.addBook(book1);
        rec1.addBook(book2);
        rec1.addBook(book3);

        System.out.println("Recommendation 1: " + rec1);

        Recomendation rec2 = rec1.clone();
        rec2.setTargetAudience("Au2");
        
        Book book4 = new Book("T4", "A4");
        rec2.addBook(book4);

        System.out.println("Recommendation 2: " + rec2);
    }
}
