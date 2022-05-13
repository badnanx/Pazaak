module com.team3.cs210finalprojectteam3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.team3.cs210finalprojectteam3 to javafx.fxml;
    exports com.team3.cs210finalprojectteam3;
}