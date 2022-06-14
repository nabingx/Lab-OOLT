package Lab09.src.hust.soict.hedspi.gui.javafx.src.application;

// fix to display everything on GUI

import Lab09.src.hust.soict.hedspi.aims.disc.CompactDisc;
import Lab09.src.hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import Lab09.src.hust.soict.hedspi.aims.order.Order;
import Lab09.src.hust.soict.hedspi.media.Media;
import Lab09.src.hust.soict.hedspi.media.Book;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class JavaFXAims extends Application{

	private Button case_0;
	private Button case_1;
	private Button case_2;
	private Button case_2_book;
	private Button case_2_cd;
	private Button case_2_dvd;
	private Button case_3;
	private Button case_4;
	private Button submitBook;
	private Button submitCD;
	private Button submitDVD;
	private Button submitID;
	private TextField tfInput;
	
	Order anOrder = null;
	String newTitle = new String();
	int id = 0;
	int count = 0;
	
	@Override
    public void start(Stage primaryStage) {
		
		submitBook = new Button("Submit for book");
		submitCD = new Button("Submit for cd");
		submitDVD = new Button("Submit for dvd");
		submitID = new Button("Submit for id");
		
		case_0 = new Button("Exit");
		case_0.setOnAction(evt -> System.exit(0));
		
		case_1 = new Button("Create a new order");
		
		case_2 = new Button("Add item to the order");
		
		case_3 = new Button("Delete item by id");
		
		case_4 = new Button("Display the items list of order");
		
		
		// Create a scene graph of node rooted at a FlowPane, do the same with cd and dvd
	      FlowPane flow = new FlowPane();
	      flow.setPadding(new Insets(15, 12, 15, 12));  // top, right, bottom, left
	      flow.setVgap(10);  // Vertical gap between nodes in pixels
	      flow.setHgap(10);  // Horizontal gap between nodes in pixels
	      flow.setAlignment(Pos.CENTER);  // Alignment
	      flow.getChildren().addAll(new Label("Order Management Application: "), case_0, case_1, case_2, case_3, case_4);
	      
	      case_1.setOnAction(evt -> {
				anOrder = new Order();
				//System.out.println("Initialize anOrder successfully!");
				flow.getChildren().add(new Label("Initialize anOrder successfully!"));
			});
	      
	      case_4.setOnAction(evt -> {
				for(int i = 0; i < anOrder.getMediaSize(); i++) {
					//System.out.println( (i + 1) + ". " + anOrder.getItemsOrdered2(i));
					flow.getChildren().add(new Label( (i + 1) + ". " + anOrder.getItemsOrdered2(i) + " || "));
				}
				//System.out.println("------------------------------");
			});
	      
	    case_2.setOnAction(evt -> {
	    	//tfInput = new TextField("");
	    	//tfInput.setEditable(true);
	    	//flow.getChildren().add(tfInput);
	    	
			case_2_book = new Button("Book");
			case_2_book.setOnAction(evt1 -> {
				
				// remove node in order not to add to the same node
				flow.getChildren().remove(submitBook);
				tfInput = new TextField("");
		    	tfInput.setEditable(true);
		    	flow.getChildren().addAll(new Label("Book's Title"), tfInput, submitBook);
		    	
		    	submitBook.setOnAction(evt2 -> {
		    		newTitle = tfInput.getText();
		    		Book book = new Book(newTitle);
					count++;
					book.setId(count);
					anOrder.addMedia(book);
		    	});
		    	
		    	//flow.getChildren().removeAll(tfInput);
		    	//anOrder.addMedia(new Book(newTitle));
			});
			
			case_2_cd = new Button("CD");
			case_2_cd.setOnAction(evt1 -> {
				
				flow.getChildren().remove(submitCD);
				tfInput = new TextField("");
				tfInput.setEditable(true);
		    	flow.getChildren().addAll(new Label("CD's Title"), tfInput, submitCD);
		    	
		    	submitCD.setOnAction(evt2 -> {
		    		newTitle = tfInput.getText();
		    		CompactDisc cd = new CompactDisc(newTitle);
					count++;
					cd.setId(count);
					anOrder.addMedia(cd);
		    	});
		    	
			});
			
			
			case_2_dvd = new Button("DVD");
			case_2_dvd.setOnAction(evt1 -> {
				
				flow.getChildren().remove(submitDVD);
				tfInput = new TextField("");
				tfInput.setEditable(true);
		    	flow.getChildren().addAll(new Label("DVD's Title"), tfInput, submitDVD);
		    	
		    	submitDVD.setOnAction(evt2 -> {
		    		newTitle = tfInput.getText();
		    		DigitalVideoDisc dvd = new DigitalVideoDisc(newTitle);
					count++;
					dvd.setId(count);
					anOrder.addMedia(dvd);
		    	});
		    	
			});
			
			flow.getChildren().addAll(new Label("Choose type: "), case_2_book, case_2_cd, case_2_dvd);
		});
	    
	    case_3.setOnAction(evt -> {
	    	
	    	flow.getChildren().remove(submitID);
			tfInput = new TextField("");
	    	tfInput.setEditable(true);
	    	flow.getChildren().addAll(new Label("Delete id: "), tfInput, submitID);
	    	
	    	submitID.setOnAction(evt2 -> {
	    		id = Integer.parseInt(tfInput.getText());
	    		id--;
	    		anOrder.removeMedia(anOrder.getItemsOrdered2Media(id));
	    	});
	    	
		});
	 
	      // Setup scene and stage
	      primaryStage.setScene(new Scene(flow, 400, 400));
	      primaryStage.setTitle("JavaFX Aims Project");
	      primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
