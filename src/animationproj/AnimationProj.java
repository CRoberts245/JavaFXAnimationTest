/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animationproj;

import javafx.animation.ScaleTransition; 
import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.Circle; 
import javafx.stage.Stage; 
import javafx.util.Duration; 
import javafx.scene.image.Image;
import javafx.scene.control.ScrollBar;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Orientation;
import javafx.geometry.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.application.Application;
import javafx.scene.shape.Sphere;
import javafx.collections.ObservableList;
import javafx.scene.text.Font;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.control.Control;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.scene.Group;
import java.util.List;
import javafx.collections.ObservableList;
import javafx.collections.ListChangeListener;
import javafx.collections.FXCollections;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableColumn.CellDataFeatures;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableView;
import java.util.ArrayList;
import javafx.scene.shape.*;
import javafx.animation.TranslateTransition;  
import javafx.animation.PathTransition;     
import javafx.animation.*;
import javafx.animation.PathTransition.OrientationType;
import javafx.scene.shape.*;

public class AnimationProj extends Application {  
   @Override 
   public void start(Stage stage) {      
      Rectangle rectangle = new Rectangle(); 
      

      rectangle.setX(20.0f); 
      rectangle.setY(40.0f); 
      rectangle.setWidth(20);
      rectangle.setHeight(20);
      
       
      
      rectangle.setFill(Color.BROWN); 
      
      rectangle.setStrokeWidth(20); 
      Path path = new Path();

       MoveTo moveTo = new MoveTo();
       moveTo.setX(20.0f);
       moveTo.setY(40.0f);

       HLineTo hLineTo = new HLineTo();
       hLineTo.setX(70.0f);

       QuadCurveTo quadCurveTo = new QuadCurveTo();
       quadCurveTo.setX(120.0f);
       quadCurveTo.setY(60.0f);
       quadCurveTo.setControlX(100.0f);
       quadCurveTo.setControlY(0.0f);

       LineTo lineTo = new LineTo();
       lineTo.setX(175.0f);
       lineTo.setY(55.0f);

       ArcTo arcTo = new ArcTo();
       arcTo.setX(50.0f);
       arcTo.setY(50.0f);
       arcTo.setRadiusX(50.0f);
       arcTo.setRadiusY(50.0f);
       
       ArcTo arcTo2 = new ArcTo();
       arcTo2.setX(180.0f);
       arcTo2.setY(180.0f);
       arcTo2.setRadiusX(50.0f);
       arcTo2.setRadiusY(50.0f);

       LineTo lineTo1 = new LineTo();
       lineTo1.setX(250.0f);
       lineTo1.setY(300.0f);

       LineTo lineTo2 = new LineTo();
       lineTo2.setX(600.0f);
       lineTo2.setY(0.0f);
       
       LineTo lineTo3 = new LineTo();
       lineTo3.setX(300.0f);
       lineTo3.setY(150.0f);

       path.getElements().add(moveTo);
       path.getElements().add(hLineTo);
       path.getElements().add(quadCurveTo);
       path.getElements().add(lineTo);
       path.getElements().add(arcTo);
       path.getElements().add(lineTo1);
       path.getElements().add(lineTo2);
       path.getElements().add(lineTo3);
       path.getElements().add(arcTo2);
       

       PathTransition pathTransition = new PathTransition();
       pathTransition.setDuration(Duration.millis(6000));
       pathTransition.setNode(rectangle);
       pathTransition.setPath(path);
       pathTransition.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
       pathTransition.setCycleCount(40);
       pathTransition.setAutoReverse(true);
 
       pathTransition.play();
      Group root = new Group(rectangle); 
         
      //Creating a scene object  
      Scene scene = new Scene(root, 600, 300,Color.DARKBLUE); 
      
      //Setting title to the Stage 
      stage.setTitle("Animation Exploration"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   }      
   public static void main(String args[]){ 
      launch(args); 
   } 
}
//THIS IS TESTING CODE,LEFT IN TO SHOW ATTEMPTS AND LEARNING OF ANIMATION
//      TranslateTransition tt = new TranslateTransition(Duration.millis(2000), rectangle);
//      tt.setByX(270.0f);
//      tt.setByY(270.0f);
//      
//      tt.setCycleCount(40);
//      tt.setAutoReverse(false);
// 
//      tt.play();
//
//      TranslateTransition tt1 = new TranslateTransition(Duration.millis(2000), rectangle);
//      tt1.setByX(330.0f);
//      tt1.setByY(-290.0f);
//      
//      tt1.setCycleCount(40);
//      tt1.setAutoReverse(false);
// 
//      tt1.play();
//
//      ScaleTransition scaleTransition = new ScaleTransition(); 
//      
//      scaleTransition.setDuration(Duration.millis(1000)); 
//      
//      scaleTransition.setNode(rectangle); 
//      
//      scaleTransition.setByY(1.5); 
//      scaleTransition.setByX(1.5); 
//      
//      scaleTransition.setCycleCount(50); 
//      
//      scaleTransition.setAutoReverse(false); 
//      
//      scaleTransition.play(); 
//         
//      //Drawing a Circle 
//      Circle circle = new Circle(); 
//      
//      //Setting the position of the circle 
//      circle.setCenterX(300.0f); 
//      circle.setCenterY(135.0f); 
//      
//      //Setting the radius of the circle 
//      circle.setRadius(50.0f); 
//      
//      //Setting the color of the circle 
//      circle.setFill(Color.BROWN); 
//      
//      //Setting the stroke width of the circle 
//      circle.setStrokeWidth(20); 
//       
//      //Creating scale Transition 
//      ScaleTransition scaleTransition1 = new ScaleTransition(); 
//      
//      //Setting the duration for the transition 
//      scaleTransition1.setDuration(Duration.millis(1000)); 
//      
//      //Setting the node for the transition 
//      scaleTransition1.setNode(circle); 
//      
//      //Setting the dimensions for scaling 
//      scaleTransition1.setByY(1.5); 
//      scaleTransition1.setByX(1.5); 
//      
//      //Setting the cycle count for the translation 
//      scaleTransition1.setCycleCount(50); 
//      
//      //Setting auto reverse value to true 
//      scaleTransition1.setAutoReverse(false); 
//      
//      //Playing the animation 
//      scaleTransition1.play();