package com.entity.vo;

import com.entity.BaoxiuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 报修
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("baoxiu")
public class BaoxiuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 工程师
     */

    @TableField(value = "gongchengshi_id")
    private Integer gongchengshiId;


    /**
     * 报修编号
     */

    @TableField(value = "baoxiu_uuid_number")
    private String baoxiuUuidNumber;


    /**
     * 报修名称
     */

    @TableField(value = "baoxiu_name")
    private String baoxiuName;


    /**
     * 报修物品
     */

    @TableField(value = "baoxiu_wupin_name")
    private String baoxiuWupinName;


    /**
     * 报修地点
     */

    @TableField(value = "baoxiu_address")
    private String baoxiuAddress;


    /**
     * 报修类型
     */

    @TableField(value = "baoxiu_types")
    private Integer baoxiuTypes;


    /**
     * 报修时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 报修详情
     */

    @TableField(value = "baoxiu_content")
    private String baoxiuContent;


    /**
     * 报修状态
     */

    @TableField(value = "baoxiu_zhuangtai_types")
    private Integer baoxiuZhuangtaiTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：工程师
	 */
    public Integer getGongchengshiId() {
        return gongchengshiId;
    }


    /**
	 * 获取：工程师
	 */

    public void setGongchengshiId(Integer gongchengshiId) {
        this.gongchengshiId = gongchengshiId;
    }
    /**
	 * 设置：报修编号
	 */
    public String getBaoxiuUuidNumber() {
        return baoxiuUuidNumber;
    }


    /**
	 * 获取：报修编号
	 */

    public void setBaoxiuUuidNumber(String baoxiuUuidNumber) {
        this.baoxiuUuidNumber = baoxiuUuidNumber;
    }
    /**
	 * 设置：报修名称
	 */
    public String getBaoxiuName() {
        return baoxiuName;
    }


    /**
	 * 获取：报修名称
	 */

    public void setBaoxiuName(String baoxiuName) {
        this.baoxiuName = baoxiuName;
    }
    /**
	 * 设置：报修物品
	 */
    public String getBaoxiuWupinName() {
        return baoxiuWupinName;
    }


    /**
	 * 获取：报修物品
	 */

    public void setBaoxiuWupinName(String baoxiuWupinName) {
        this.baoxiuWupinName = baoxiuWupinName;
    }
    /**
	 * 设置：报修地点
	 */
    public String getBaoxiuAddress() {
        return baoxiuAddress;
    }


    /**
	 * 获取：报修地点
	 */

    public void setBaoxiuAddress(String baoxiuAddress) {
        this.baoxiuAddress = baoxiuAddress;
    }
    /**
	 * 设置：报修类型
	 */
    public Integer getBaoxiuTypes() {
        return baoxiuTypes;
    }


    /**
	 * 获取：报修类型
	 */

    public void setBaoxiuTypes(Integer baoxiuTypes) {
        this.baoxiuTypes = baoxiuTypes;
    }
    /**
	 * 设置：报修时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：报修时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：报修详情
	 */
    public String getBaoxiuContent() {
        return baoxiuContent;
    }


    /**
	 * 获取：报修详情
	 */

    public void setBaoxiuContent(String baoxiuContent) {
        this.baoxiuContent = baoxiuContent;
    }
    /**
	 * 设置：报修状态
	 */
    public Integer getBaoxiuZhuangtaiTypes() {
        return baoxiuZhuangtaiTypes;
    }


    /**
	 * 获取：报修状态
	 */

    public void setBaoxiuZhuangtaiTypes(Integer baoxiuZhuangtaiTypes) {
        this.baoxiuZhuangtaiTypes = baoxiuZhuangtaiTypes;
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

}
