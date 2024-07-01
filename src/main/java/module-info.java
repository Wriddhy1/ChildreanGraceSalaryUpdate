module com.oop.childreangracesalaryupdate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.oop.childreangracesalaryupdate to javafx.fxml;
    exports com.oop.childreangracesalaryupdate;
}