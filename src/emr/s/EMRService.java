/** 
 * Project Name:EMR 
 * File Name:EMRServer.java 
 * Package Name:io.rqw.s 
 * Date:2017年9月17日下午8:22:37  
*/

package emr.s;

import emr.d.EMRDao;

/**
 * ClassName:EMRServer <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date: 2017年9月17日 下午8:22:37 <br/>
 * 
 * @author ren7wei
 * @version
 * @since JDK 1.8
 * @see
 */
public class EMRService<T> {
    private EMRDao<T> emrDao;

    public EMRService(Class<T> clazz) {
        emrDao = new EMRDao<>(clazz);
    }
    

}
