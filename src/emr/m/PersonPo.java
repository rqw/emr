/** 
 * Project Name:EMR 
 * File Name:Person.java 
 * Package Name:io.rqw.m 
 * Date:2017年9月16日下午10:53:21  
*/

package emr.m;

import java.util.Date;

/**
 * ClassName:Person <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Date: 2017年9月16日 下午10:53:21 <br/>
 * 
 * @author ren7wei
 * @version
 * @since JDK 1.6
 * @see
 */
public class PersonPo {
    private String id;
    private String name;
    private Date birthday;
    private Integer sex;
    private String phone;
    private Date lastDiagnoseTime;
    private Date createTime;
    private String remark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getLastDiagnoseTime() {
        return lastDiagnoseTime;
    }

    public void setLastDiagnoseTime(Date lastDiagnoseTime) {
        this.lastDiagnoseTime = lastDiagnoseTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
