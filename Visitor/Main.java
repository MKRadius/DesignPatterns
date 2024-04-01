public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("Root");
        Directory games = new Directory("Games");
        Directory pictures = new Directory("Pictures");
        File word = new File("word.docx", 1.5);
        File game = new File("game.exe", 2.3);
        File picture = new File("picture.jpg", 1.8);

        root.addElement(games);
        root.addElement(pictures);
        root.addElement(word);
        games.addElement(game);
        pictures.addElement(picture);

        // Calculate the total size of all files
        SizeCalculatorVisitor sizeVisitor = new SizeCalculatorVisitor();
        root.accept(sizeVisitor);
        System.out.println("Total size of all files: " + sizeVisitor.getTotalSize() + " MB");

        // Search for files with '.jpg' extension
        SearchVisitor searchVisitor = new SearchVisitor("jpg");
        root.accept(searchVisitor);
        System.out.println("Files with '.jpg' extension:");

        for (File file : searchVisitor.getFoundFiles()) {
            System.out.println(file.getName());
        }
    }
}
