module pack1.aboutus {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.desktop;

    opens pack1.aboutus to javafx.fxml;
    exports pack1.aboutus;
}