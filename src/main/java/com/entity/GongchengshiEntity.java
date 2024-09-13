package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 工程师
 *
 * @author 
 * @email
 */
@TableName("gongchengshi")
public class GongchengshiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongchengshiEntity() {

	}

	public GongchengshiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 工程师姓名
     */
    @TableField(value = "gongchengshi_name")

    private String gongchengshiName;


    /**
     * 工程师手机号
     */
    @TableField(value = "gongchengshi_phone")

    private String gongchengshiPhone;


    /**
     * 工程师身份证号
     */
    @TableField(value = "gongchengshi_id_number")

    private String gongchengshiIdNumber;


    /**
     * 工程师头像
     */
    @TableField(value = "gongchengshi_photo")

    private String gongchengshiPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    @TableField(value = "gongchengshi_email")

    private String gongchengshiEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：工程师姓名
	 */
    public String getGongchengshiName() {
        return gongchengshiName;
    }
    /**
	 * 获取：工程师姓名
	 */

    public void setGongchengshiName(String gongchengshiName) {
        this.gongchengshiName = gongchengshiName;
    }
    /**
	 * 设置：工程师手机号
	 */
    public String getGongchengshiPhone() {
        return gongchengshiPhone;
    }
    /**
	 * 获取：工程师手机号
	 */

    public void setGongchengshiPhone(String gongchengshiPhone) {
        this.gongchengshiPhone = gongchengshiPhone;
    }
    /**
	 * 设置：工程师身份证号
	 */
    public String getGongchengshiIdNumber() {
        return gongchengshiIdNumber;
    }
    /**
	 * 获取：工程师身份证号
	 */

    public void setGongchengshiIdNumber(String gongchengshiIdNumber) {
        this.gongchengshiIdNumber = gongchengshiIdNumber;
    }
    /**
	 * 设置：工程师头像
	 */
    public String getGongchengshiPhoto() {
        return gongchengshiPhoto;
    }
    /**
	 * 获取：工程师头像
	 */

    public void setGongchengshiPhoto(String gongchengshiPhoto) {
        this.gongchengshiPhoto = gongchengshiPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getGongchengshiEmail() {
        return gongchengshiEmail;
    }
    /**
	 * 获取：电子邮箱
	 */

    public void setGongchengshiEmail(String gongchengshiEmail) {
        this.gongchengshiEmail = gongchengshiEmail;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Gongchengshi{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", gongchengshiName=" + gongchengshiName +
            ", gongchengshiPhone=" + gongchengshiPhone +
            ", gongchengshiIdNumber=" + gongchengshiIdNumber +
            ", gongchengshiPhoto=" + gongchengshiPhoto +
            ", sexTypes=" + sexTypes +
            ", gongchengshiEmail=" + gongchengshiEmail +
            ", createTime=" + createTime +
        "}";
    }
}
