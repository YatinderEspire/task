/*
 * Copyright (c) 2021 CEVA Logistics, Inc. All Rights Reserved.
 */

package org.example.error;

import java.util.Date;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * WMS Generic error response.
 *
 * @author Raul Garnacho
 */

@JsonInclude(Include.NON_NULL)
public class WMSRestErrorResponse extends WMSBaseErrorResponse {

  private List<ErrorDetail> errors;

  /**
   * Instantiates a new Rest exception response.
   */
  public WMSRestErrorResponse() {}

  /**
   * Instantiates a new Rest exception response.
   *
   * @param title Title.
   * @param timestamp The instant in the epoch timeline when the error occurred
   * @param errors List of errors that occurred
   * @param uri URI path of the request that caused the exception
   * @param status HTTP status code that this response has
   */
  public WMSRestErrorResponse(String title, Date timestamp, List<ErrorDetail> errors, String uri,
      int status) {
    super(title, timestamp, uri, status);
    this.errors = errors;
  }

  public List<ErrorDetail> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorDetail> errors) {
    this.errors = errors;
  }

  @Override
  public String toString() {
    return "WMSRestErrorResponse [errors=" + errors + "]";
  }
}