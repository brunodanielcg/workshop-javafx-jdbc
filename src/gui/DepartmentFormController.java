package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Alerts;
import gui.util.Constraints;
import gui.util.Utils;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.entities.Department;
import model.services.DepartmentService;

public class DepartmentFormController implements Initializable {

	
	private Department entity;
	
	@FXML
	private TextField txtName;
	@FXML
	private TextField txtId;
	@FXML
	private Label labelErrorName;
	@FXML
	private Button btSave;
	@FXML
	private Button btCancel;
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}
	
	public void updateFormData() {
		if (entity == null) {
			throw new IllegalStateException("Entity was null");
		}		
		txtId.setText(String.valueOf(entity.getId()));
		txtName.setText(entity.getName());
	}

//	private ObservableList<Department> obsList;
	
	@FXML
	public void onBtSaveAction(ActionEvent event) {
		System.out.println("onBtSaveAction");
//		Stage parentStage = Utils.currentStage(event);
		// * Here we add a method to instantiate a new department and add it to
		// DepartmentList
	}

	@FXML
	public void onBtCancelAction(ActionEvent event) {
		System.out.println("onBtCancelAction");
//		Stage parentStage = Utils.currentStage(event);
//		closeDialogForm();
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();
	}

	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);		
		Constraints.setTextFieldMaxLength(txtName, 30);		
	}
	
//	private void closeDialogForm() {	
//
//		try {
//						
//			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
//			Pane pane = loader.load();
//			
//
//			if (loader )
//			
//			Stage dialogStage = new Stage();
//			dialogStage.setTitle("Enter Department data");
//			dialogStage.setScene(new Scene(pane));
//			dialogStage.setResizable(false);
//			dialogStage.initOwner(parentStage);
//			dialogStage.initModality(Modality.WINDOW_MODAL);
//			dialogStage.showAndWait();
//		} catch (IOException e) {
//			Alerts.showAlert("IOExcepetion", "Error loading view", e.getMessage(), AlertType.ERROR);
//		}
//	} 
	  
	
}