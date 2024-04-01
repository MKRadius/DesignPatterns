public interface Document {
    String getId();
    String getContent(User user) throws AccessDeniedException;
    String getCreationDate();
}
