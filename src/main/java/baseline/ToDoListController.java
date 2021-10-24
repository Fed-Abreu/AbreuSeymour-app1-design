package baseline;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ToDoListController {

    @FXML
    private Button AddListButton;

    @FXML
    private Button EditListButton;

    @FXML
    private TextField ListText;

    @FXML
    private Button RemoveListButton;

    @FXML
    private ListView<String> todoList;
    //

    @FXML
    void addButtonClicked(ActionEvent event) {
        //Add the list using todoList.add().add(with ListText)
        ///List should separate information by title, Description of list, Completion status, and Date
    }

    @FXML
    void editButtonClicked(ActionEvent event) {
        //Make list editable by using list.setEditable(true) double-clicking it
        //And list.setCellFactory
    }

    @FXML
    void removeButtonClicked(ActionEvent event) {
        //initialize int selection using todoList.getSelectionModel.getSelectedIndex()
        //Remove selected List using todoList.getItems().remove(selection)

    }
    //initialize file chooser using setInitialDirectory(new File("C:\\temp")

    //Using file Chooser save the selected todolist in the user destination Window stage = saveMenu getWindow
    //Make filechooser.getExtentionFilters().add(new ExtensionFilter( text file, *.txt )
    //try the saveDialog and catch Exception

    //Using file Choose Load the todlist
    //Make filechooser.getExtentionFilters().add(new ExtensionFilter( text file, *.txt,*.docx,.*doc )
    //try the openDialog and catch Exception


}
