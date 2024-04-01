public class RealDocument implements Document {
    private String id;
    private String content;
    private String creationDate;

    public RealDocument(String id, String content, String creationDate) {
        this.id = id;
        this.content = content;
        this.creationDate = creationDate;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        return content;
    }

    @Override
    public String getCreationDate() {
        return creationDate;
    }
}
