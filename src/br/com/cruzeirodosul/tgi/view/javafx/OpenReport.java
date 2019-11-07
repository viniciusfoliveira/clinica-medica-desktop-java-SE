/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cruzeirodosul.tgi.view.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import net.sf.jasperreports.engine.JasperPrint;
import org.jvfx.viewer.JasperViewerFX;

/**
 *
 * @author edy
 */
public class OpenReport extends Application {

    private static JasperPrint jasperPrint;    
    private static String  tituloRelatorio = "Relatorio";
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Relatorios");
        primaryStage.getIcons().add((new Image("br/com/cruzeirodosul/tgi/view/img/jaspersoftstudio.png")));
        primaryStage.setScene(scene);
      
        //primaryStage.show();
        
        // Depois de Criar todo o metodo Main eu pulo o Stage Principal,
        // para Criar a Janela do Relatorio.
        new JasperViewerFX(primaryStage).viewReport(tituloRelatorio, jasperPrint);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    // Meotodo Recebe o relatorio e Titulo para o Metodo Main chamar
    public static void openRelortFX(JasperPrint jasperPrint, String tituloRelatorio){
        OpenReport.jasperPrint = jasperPrint;
        OpenReport.tituloRelatorio = tituloRelatorio;
        main(null);
    }
}
