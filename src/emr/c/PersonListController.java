/** 
 * Project Name:EMR 
 * File Name:PersonListController.java 
 * Package Name:io.rqw.c 
 * Date:2017年9月16日下午10:22:40  
*/

package emr.c;

import java.util.Map;
import java.util.stream.Collectors;

import emr.m.PersonPo;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Pagination;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * ClassName:PersonListController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date: 2017年9月16日 下午10:22:40 <br/>
 * 
 * @author ren7wei
 * @version
 * @since JDK 1.6
 * @see
 */
public class PersonListController {
    private Stage stage;
    private Parent root;
    private TableView<PersonPo> table;
    private Pagination page;
    
    @SuppressWarnings("unchecked")
    public PersonListController(Stage stage, Parent root) {
        this.root=root;
        this.stage=stage;
        table = (TableView<PersonPo>) root.lookup("#personList");
        Map<String, TableColumn<PersonPo,?>> tcMap = table.getColumns().stream().collect(Collectors.toMap(tc-> tc.getText(), tc->tc));
        initPage(root);
    }

    private void initPage(Parent root) {
        page = (Pagination) root.lookup("#pageInfo");
        page.setPageCount(10);
        page.setCurrentPageIndex(0);
        page.setMaxPageIndicatorCount(10);
        page.setPageFactory((index)->{
            
            return table;
        });
    }
}
