import java.util.HashMap;

public class AccessControlService {
    private static AccessControlService instance;
    private HashMap<String, String> accessMap;

    private AccessControlService() {
        accessMap = new HashMap<>();
    }

    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public void grantAccess(String documentId, String username) {
        accessMap.put(documentId, username);
    }

    public boolean isAllowed(String documentId, String username) {
        return accessMap.containsKey(documentId) && accessMap.get(documentId).equals(username);
    }
}
