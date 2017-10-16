package per.freetalk.common.pojo;

import java.io.Serializable;

public class ftResult implements Serializable{
	//状态码
	private Integer status;
	//响应消息
	private String msg;
	//响应数据
	private Object data;
	
	//返回成功默认状态码 200
	public static ftResult ok(){
		return new ftResult(200,"OK");
	}
	/**
	 * 自定义错误 消息和状态码
	 * @param msg 错误消息
	 * @param status 错误状态码
	 * @return
	 */
	public static ftResult build(Integer status,String msg){
		return new ftResult(status,msg);
	}
	
	public ftResult(Integer status, String msg, Object data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public ftResult(Integer status) {
		super();
		this.status = status;
	}
	
	public ftResult(Integer status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

}
