module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.example to javafx.fxml;
    exports com.example;
    exports com.example.view;
    exports com.example.controller;
    exports com.example.model.Game;
    exports com.example.model.Map;
    exports com.example.model.Tile;
}
