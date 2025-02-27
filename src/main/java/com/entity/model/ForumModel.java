package com.entity.model;

import com.entity.ForumEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 论坛
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-05
 */
public class ForumModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date addtime;


    /**
     * 帖子标题
     */
    private String title;


    /**
     * 帖子内容
     */
    private String content;


    /**
     * 父节点id
     */
    private Integer parentid;


    /**
     * 用户id
     */
    private Integer userid;


    /**
     * 用户名
     */
    private String username;


    /**
     * 状态
     */
    private String isdone;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getAddtime() {
        return addtime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }
    /**
	 * 获取：帖子标题
	 */
    public String getTitle() {
        return title;
    }


    /**
	 * 设置：帖子标题
	 */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
	 * 获取：帖子内容
	 */
    public String getContent() {
        return content;
    }


    /**
	 * 设置：帖子内容
	 */
    public void setContent(String content) {
        this.content = content;
    }
    /**
	 * 获取：父节点id
	 */
    public Integer getParentid() {
        return parentid;
    }


    /**
	 * 设置：父节点id
	 */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
    /**
	 * 获取：用户id
	 */
    public Integer getUserid() {
        return userid;
    }


    /**
	 * 设置：用户id
	 */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
    /**
	 * 获取：用户名
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 设置：用户名
	 */
    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：状态
	 */
    public String getIsdone() {
        return isdone;
    }


    /**
	 * 设置：状态
	 */
    public void setIsdone(String isdone) {
        this.isdone = isdone;
    }

    }
