public class DocumentProxy implements Document {
    private Document document;
    private AccessControlService accessControlService;

    public DocumentProxy(Document document, AccessControlService accessControlService) {
        this.document = document;
        this.accessControlService = accessControlService;
    }

    @Override
    public String getId() {
        return document.getId();
    }

    @Override
    public String getContent(User user) throws AccessDeniedException {
        if (accessControlService.isAllowed(document.getId(), user.getUsername())) {
            return document.getContent(user);
        } else {
            throw new AccessDeniedException("Access Denied");
        }
    }

    @Override
    public String getCreationDate() {
        return document.getCreationDate();
    }
}
