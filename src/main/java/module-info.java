module com.example.loginuijavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.loginuijavafx to javafx.fxml;
    exports com.example.loginuijavafx;
}