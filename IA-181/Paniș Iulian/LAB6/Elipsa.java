
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.util.Duration;
import javafx.scene.transform.Rotate;

public class Elipsa extends Application {

    private static int start = 0;
    private double xf = 300, yf = 300;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Elipsa");

        //crearea obiectului elipsei
        Ellipse elipsa = new Ellipse(xf, yf, 200, 100);
        elipsa.setFill(Color.PURPLE);

        //Butonul pentru inceputul si sfarsitul miscarii
        Button buttonStart = new Button("START");
        buttonStart.setTranslateX(240);
        buttonStart.setTranslateY(20);

        //Butonul pentru restartarea miscarii
        Button buttonRestart = new Button("RESTART");
        buttonRestart.setTranslateX(300);
        buttonRestart.setTranslateY(20);

        //Crearea obiectelor pentru initializarea ferestrei
        Group root = new Group();
        Canvas canvas = new Canvas(600, 600);

        //Crearea obiectului pentru realizarea rotatiei
        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);//nr de reoetari
        timeline.setAutoReverse(true);
        timeline.getKeyFrames().addAll(new KeyFrame(Duration.millis(2), ae -> rotate(elipsa)));//frecventa crearii

        //Setarea actiunilor pentru tastarea butoanelor
        buttonStart.setOnAction(event -> {
            if (start == 0) {
                timeline.play();                //inceputul rotatiei
                buttonStart.setText(" STOP");
                start = 1;
            } else {
                timeline.stop();                //pauza rotatiei
                start = 0;
                buttonStart.setText("START");

            }

        });

        buttonRestart.setOnAction(event -> {
            start(primaryStage);                //resetarea pozitiei si finisarea rotatiei
            start=0;
        });

        //crearea ferestrei si adaugarea obiectelor
        root.getChildren().add(elipsa);             //adaugarea elipsei
        root.getChildren().add(canvas);             //adaugarea suprafetei pentru afisarrea componentelor
        root.getChildren().add(buttonStart);        //adaugarea butonului START
        root.getChildren().add(buttonRestart);      //adaugarea butonului RESTART
        primaryStage.setScene(new Scene(root));     //crearea scenei
        primaryStage.show();                        //afisarea scenei
    }

    //functia pentru rotirea figurii
    private void rotate(Ellipse shape) {

        shape.getTransforms().add(new Rotate(1, xf, yf));

    }
}
