import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    private List<File> foundFiles = new ArrayList<>();
    private String searchCriteria;

    public SearchVisitor(String searchCriteria) {
        this.searchCriteria = searchCriteria;
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchCriteria)) {
            foundFiles.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        // Do nothing for directories
    }

    public List<File> getFoundFiles() {
        return foundFiles;
    }
}
