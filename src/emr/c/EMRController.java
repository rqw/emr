/** 
 * Project Name:EMR 
 * File Name:EMRController.java 
 * Package Name:application 
 * Date:2017年9月14日下午9:29:24  
*/

package emr.c;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * ClassName:EMRController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date: 2017年9月14日 下午9:29:24 <br/>
 * 
 * @author ren7wei
 * @version
 * @since JDK 1.6
 * @see
 */
public class EMRController implements Initializable {
    @FXML
    private Button btn;

    @FXML
    private TextField txt;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub

    }

    public void showDateTime(ActionEvent event) {
        System.out.println("Button Clicked!");
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
        String dateTimeString = df.format(now);
        // Show in VIEW
        txt.setText(dateTimeString);

    }

}
