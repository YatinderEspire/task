/*
 * Copyright (c) 2021 CEVA Logistics, Inc. All Rights Reserved.
 */

package org.example.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import org.example.error.ErrorDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Common WMS exception.
 *
 * @author Raul Garnacho
 */
public class WMSException extends Exception {

  private static final long serialVersionUID = -1771088537167544111L;

  private static final Logger LOGGER = LoggerFactory.getLogger(WMSException.class);

  private WMSExceptionType wmsExceptionType;

  private List<ErrorDetail> errors;

  /**
   * Constructor.
   * 
   * @param code Code
   * @param wmsExceptionType Exception type
   * @param ex Exception
   */
  public WMSException(WMSErrorCode code, WMSExceptionType wmsExceptionType, Exception ex) {
    super(ex);
    this.errors = new ArrayList<>();
    this.errors.add(new ErrorDetail(code));
    this.wmsExceptionType = wmsExceptionType;
    LOGGER.error(toString());
  }

  /**
   * Constructor.
   * 
   * @param errors List of errors
   * @param wmsExceptionType Exception type
   * @param ex Exception
   */
  public WMSException(List<ErrorDetail> errors, WMSExceptionType wmsExceptionType, Exception ex) {
    super(ex);
    this.errors = errors;
    this.wmsExceptionType = wmsExceptionType;
    LOGGER.error(toString());
  }

  /**
   * Return the first error code from the list of errors.
   * 
   * @return
   */
  public String getFirstErrorCode() {
    String errorCode = "";
    if (!this.errors.isEmpty()) {
      errorCode = this.errors.get(0).getCode();
    }
    return errorCode;
  }

  public List<ErrorDetail> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorDetail> errors) {
    this.errors = errors;
  }

  public WMSExceptionType getWmsExceptionType() {
    return wmsExceptionType;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", WMSException.class.getSimpleName() + "[", "]")
        .add("wmsExceptionType=" + wmsExceptionType).add("errors=" + errors).toString();
  }
}
