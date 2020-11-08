package springbootjpa.common;
import java.io.Serializable;

public class Result<T> implements Serializable{
	
	    private Integer code;
	    private String  message;
	    private T       data;

	    public Result(Integer code, String message){
	        this(code, message, null);
	    }

		public Integer getCode() {
			return code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Result(Integer code, String message, T data) {
			super();
			this.code = code;
			this.message = message;
			this.data = data;
		}

		public Result() {
			super();
			// TODO Auto-generated constructor stub
		}


	
}
