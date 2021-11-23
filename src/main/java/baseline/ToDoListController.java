package baseline;


import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ToDoListController {

    @FXML
    private DatePicker addDate;

    @FXML
    private TextField addDescription;

    @FXML
    private Button buttonAdd;

    @FXML
    private Button buttonAll;

    @FXML
    private Button buttonCompleted;

    @FXML
    private Button buttonDelete;

    @FXML
    private Button buttonEdit;

    @FXML
    private Button buttonIncomplete;

    @FXML
    private TableColumn<?, ?> completedCol;

    @FXML
    private TableColumn<?, ?> dateCol;

    @FXML
    private TableColumn<?, ?> descriptionCol;

    @FXML
    private MenuItem open;

    @FXML
    private MenuItem saveAll;

    @FXML
    private MenuItem saveList;

    @FXML
    private TableView<?> tableView;

    @FXML
    private Tab title;

    @FXML
    private Button titleButton;

    @FXML
    private Button editTitle;

    @FXML
    private TextField addTitle;


    ObservableList<List> data;
    FilteredList<List> filteredList;

    //Initialize locations and resources
    //Start setup table column
    //Set up a Filter
    //Sort List to table


    @FXML
    void addButtonClicked(ActionEvent event) {
        //Add the list using todoList.add().add(with ListText)
        ///List should separate information by Description of list, Completion status, and Date
    }

    @FXML
    void editButtonClicked(ActionEvent event) {
        //If not in edit
        //index == -1
        //Find selected task from table to edit
        //If task is selected isn't null
        //Then set editIndex to selected row index
        //Disable add and add description set text and date add values
        //else if in edit mode find selected task from table
        //Update task details with data
        //Clear fields
        //and refresh and enable buttons
    }

    @FXML
    void removeButtonClicked(ActionEvent event) {
        //get selection and index List and remove data using .remove to getSelectionModel of tableView
    }

    public void onAll(ActionEvent actionEvent) {
        //Use filterList set predicate true
    }

    public void onCompleted(ActionEvent actionEvent) {
        //Use filterList set predicate to getCompleted to .get
    }

    public void onIncomplete(ActionEvent actionEvent) {
        //Use filterList set predicate to do not getCompleted to .get
    }

    public void onOpen(ActionEvent actionEvent) {
        //Using file Chooser to Load the todlists using showOpenDialog
        //if list isnt blank then try to scan file
        //Clear existing Lista and task
        //Read date and parse
        //Read description
        //Read title of List
        //Refresh table
        //Catch Exceptions and Print Message

    }
    public void onSaveList(ActionEvent actionEvent) {
        //Using file Chooser save the selected todolist in the user destination using showSaveDialog
        //if save isnt null then try to PrinteWriter to write files
        //Write its title then write their dates and descriptions for each List
        //Catch Exceptions and Print messsage
    }

    public void onSaveAll(ActionEvent actionEvent) {
        //Using file Chooser save the selected todolists in the user destination using showSaveDialog
        //if save isnt null then try to PrinteWriter to write files
        //write title and for each title write their date and descriptions for each List
        //And keep looping for each title
        //Catch Exceptions and print message

    }
    @FXML
    void titleButtonClicked(ActionEvent event) {
        //if title is less than 3 characters then Display error message that title has to be 3 characters long
        //addTitle get text and add to tab
        //Set title
        //add new List add tableView
    }
    @FXML
    void editTitleClicked (ActionEvent event){
        //Find selected title from tab to edit
        //If title is selected isn't null
        //Then set editIndex to selected row index
        //else if in edit mode find selected title from tabs
    }







}
