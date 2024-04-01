public class Main {
    public static void main(String[] args) {
        // Create documents
        Document doc1 = new RealDocument("d1", "Content of document 1", "01-04-2024");
        Document doc2 = new RealDocument("d2", "Content of document 2", "02-04-2024");

        // Create access control service instance
        AccessControlService asc = AccessControlService.getInstance();

        // Grant access to documents
        asc.grantAccess("d1", "user1");
        asc.grantAccess("d2", "user2");

        // Create document proxies
        DocumentProxy proxy1 = new DocumentProxy(doc1, asc);
        DocumentProxy proxy2 = new DocumentProxy(doc2, asc);

        // Create library
        Library lib = new Library();
        lib.addDocument("d1", proxy1);
        lib.addDocument("d2", proxy2);

        // Attempt to access documents
        User user1 = new User("user1");
        User user2 = new User("user2");

        // User 1 can access document 1
        try {
            System.out.println("Document 1 content: " + proxy1.getContent(user1));
        } catch (AccessDeniedException e) {
            System.out.println("User 1 cannot access document 1: " + e.getMessage());
        }

        // User 2 can access document 2
        try {
            System.out.println("Document 2 content: " + proxy2.getContent(user2));
        } catch (AccessDeniedException e) {
            System.out.println("User 2 cannot access document 2: " + e.getMessage());
        }

        // Print creation date
        System.out.println("Document 1 creation date: " + proxy1.getCreationDate());
        System.out.println("Document 2 creation date: " + proxy2.getCreationDate());

        // User 1 cannot access document 2
        try {
            System.out.println("Document 2 content: " + proxy2.getContent(user1));
        } catch (AccessDeniedException e) {
            System.out.println("User 1 cannot access document 2: " + e.getMessage());
        }

        // User 2 cannot access document 1
        try {
            System.out.println("Document 1 content: " + proxy1.getContent(user2));
        } catch (AccessDeniedException e) {
            System.out.println("User 2 cannot access document 1: " + e.getMessage());
        }
    }
}
