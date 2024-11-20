module application.dalem_lab_4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens application.dalem_lab_4 to javafx.fxml;
    exports application.dalem_lab_4;
}