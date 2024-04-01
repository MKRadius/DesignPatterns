import java.util.HashMap;

public class Library {
    private HashMap<String, Document> documents;

    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(String id, Document document) {
        documents.put(id, document);
    }

    public Object getDocument(String id) {
        return documents.get(id);
    }
}
