package com.oop.childreangracesalaryupdate;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class SchoolSceneController
{
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TextField searchTextField;
    @javafx.fxml.FXML
    private TableColumn nameCol;
    @javafx.fxml.FXML
    private TextField monthTextField;
    @javafx.fxml.FXML
    private TableColumn salaryCol;
    @javafx.fxml.FXML
    private TableColumn monthCol;
    @javafx.fxml.FXML
    private ComboBox<String> salaryComboBox;


    ArrayList<Teacher>teacherArrayList=new ArrayList<>();



    @javafx.fxml.FXML
    public void initialize() {

        nameCol.setCellValueFactory(new PropertyValueFactory<Teacher,String>("name"));
        monthCol.setCellValueFactory(new PropertyValueFactory<Teacher,String>("month"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<Teacher,String>("salary"));
       // marchCol.setCellValueFactory(new PropertyValueFactory<Teacher,String>("march"));
       // aprilCol.setCellValueFactory(new PropertyValueFactory<Dummyclass,String>("april"));
        //mayCol.setCellValueFactory(new PropertyValueFactory<Dummyclass,String>("may"));
      //  juneCol.setCellValueFactory(new PropertyValueFactory<Teacher,String>("june"));
      //  julyCol.setCellValueFactory(new PropertyValueFactory<Dummyclass,String>("july"));

      //  augCol.setCellValueFactory(new PropertyValueFactory<Dummyclass,String>("august"));
      //  septCol.setCellValueFactory(new PropertyValueFactory<Teacher,String>("sept"));
     //   octoberCol.setCellValueFactory(new PropertyValueFactory<Dummyclass,String>("october"));

      //  monthComboBox.getItems().addAll("january","February","March","April","May","June","July","August","Sept","October");
       salaryComboBox.getItems().addAll("paid","unpaid");


    }



    @javafx.fxml.FXML
    public void saveOnAction(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String month = monthTextField.getText();
        String salary = salaryComboBox.getValue();

        if (!salaryComboBox.getSelectionModel().isEmpty()) {
            Teacher salaryupdate = new Teacher(name, month, salary);
            teacherArrayList.add(salaryupdate);
            tableView.getItems().clear();
            tableView.getItems().addAll(teacherArrayList);
        }
        else{
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Selection Error");
            alert.setHeaderText(null);
            alert.setContentText("Please provide paid or unpaid");
            alert.showAndWait();
        }
        nameTextField.clear();
       monthTextField.clear();
        salaryComboBox.getSelectionModel().clearSelection();
    }




    @javafx.fxml.FXML
    public void showOnAction(ActionEvent actionEvent) {

        String search= searchTextField.getText();
        tableView.getItems().clear();
        if(!search.isEmpty())
        {
            for(Teacher name : teacherArrayList)
            {
                if(name.getName().equals(search))
                {
                    tableView.getItems().add(name);
                }
                if (tableView.getItems().isEmpty())
                {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Search Error");
                    alert.setHeaderText(null);
                    alert.setContentText("No matching name found");
                    alert.showAndWait();
                }
            }

        }
        else {
            tableView.getItems().addAll(teacherArrayList);
        }

        }

    }
