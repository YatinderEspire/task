package org.example.error;

import org.example.exception.WMSErrorCode;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorDetail {

  // TODO investigate if we can just get rid of this class altogether and use WMSErrorCode instead

  private String code;
  private String message;

  /**
   * Instantiates a new Error Detail.
   */
  public ErrorDetail() {
  }

  /**
   * Instantiates a new error detail.
   *
   * @param code    the code
   */
  public ErrorDetail(String code) {
    WMSErrorCode exceptionCode = WMSErrorCode.fromCode(code);

    this.code = exceptionCode.getCode();
    this.message = exceptionCode.getMessage();
  }

  /**
   * Instantiates a new Error Detail from an exception code.
   *
   * @param exceptionCode Enum instance containing both the error code and the description
   */
  public ErrorDetail(WMSErrorCode exceptionCode) {
    this.code = exceptionCode.getCode();
    this.message = exceptionCode.getMessage();
  }

  /**
   * Gets code.
   *
   * @return the code
   */
  public String getCode() {
    return code;
  }

  /**
   * Sets code.
   *
   * @param code the code
   */
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Gets message.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Sets message.
   *
   * @param message the message
   */
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "ErrorDetail [errorCode=" + code + ", message=" + message + "]";
  }
}
