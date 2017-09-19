/** 
 * Project Name:EMR 
 * File Name:Page.java 
 * Package Name:io.rqw.m 
 * Date:2017年9月17日下午8:30:20  
*/  
  
package emr.m;

import java.util.List;

/** 
 * ClassName:Page <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Date:     2017年9月17日 下午8:30:20 <br/> 
 * @author   ren7wei 
 * @version   
 * @since    JDK 1.6 
 * @see       
 */
public class Page<T> {
    private int index;
    private int count;
    private int size;
    private List<T> datas;
    private String order;
    private String condition;
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public List<T> getDatas() {
        return datas;
    }
    public void setDatas(List<T> datas) {
        this.datas = datas;
    }
    public String getOrder() {
        return order;
    }
    public void setOrder(String order) {
        this.order = order;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    
}
  