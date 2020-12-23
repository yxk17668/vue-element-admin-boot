
package com.songlingapp.util;

import com.songlingapp.constant.CommonConstants;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;


/**
 * 响应信息主体
 *
 * @param <T>
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class R<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private boolean success;

	@Getter
	@Setter
	private String msg;


	@Getter
	@Setter
	private T result;

	public static <T> R<T> ok() {
		return restResult(null, CommonConstants.SUCCESS, null);
	}

	public static <T> R<T> ok(T result) {
		return restResult(result, CommonConstants.SUCCESS, null);
	}

	public static <T> R<T> ok(T result, String msg) {
		return restResult(result, CommonConstants.SUCCESS, msg);
	}

	public static <T> R<T> failed() {
		return restResult(null, CommonConstants.FAIL, null);
	}

	public static <T> R<T> failed(String msg) {
		return restResult(null, CommonConstants.FAIL, msg);
	}

	public static <T> R<T> failed(T result) {
		return restResult(result, CommonConstants.FAIL, null);
	}

	public static <T> R<T> failed(T result, String msg) {
		return restResult(result, CommonConstants.FAIL, msg);
	}

	private static <T> R<T> restResult(T result, boolean success, String msg) {
		R<T> apiResult = new R<>();
		apiResult.setSuccess(success);
		apiResult.setResult(result);
		apiResult.setMsg(msg);
		return apiResult;
	}
}

