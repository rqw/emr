/** 
 * Project Name:EMR 
 * File Name:EMRDao.java 
 * Package Name:io.rqw.d 
 * Date:2017年9月17日下午8:33:08  
*/

package emr.d;

/**
 * ClassName:EMRDao <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date: 2017年9月17日 下午8:33:08 <br/>
 * 
 * @author ren7wei
 * @version
 * @since JDK 1.6
 * @see
 */
public class EMRDao<T> {
    private Class<T> clazz;

    public EMRDao(Class<T> clazz) {
        this.clazz = clazz;
    }

}
