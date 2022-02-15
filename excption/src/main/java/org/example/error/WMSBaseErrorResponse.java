/*
 * Copyright (c) 2021 CEVA Logistics, Inc. All Rights Reserved.
 */

package org.example.error;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * WMS Base Rest error response with the common attributes.
 *
 * @author Raul Garnacho
 */

@JsonInclude(Include.NON_NULL)
public class WMSBaseErrorResponse {

  private String title;
  private int status;
  private Date timestamp;
  private String uri;

  /**
   * Instantiates a new Rest exception response.
   */
  public WMSBaseErrorResponse() {}


  /**
   * Instantiates a new Rest exception response.
   *
   * @param title Title of the error. Either Validation or Functional error
   * @param timestamp The instant in the GMT timeline when the exception was created
   * @param uri The uri of the request that generated the exception
   * @param status The http status code that this response will have
   */
  public WMSBaseErrorResponse(String title, Date timestamp, String uri, int status) {
    this.title = title;
    this.uri = uri;
    this.status = status;
    this.timestamp = timestamp;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "WMSBaseErrorResponse{" + "title='" + title + '\'' + ", status=" + status
        + ", timestamp=" + timestamp + ", uri='" + uri + '\'' + '}';
  }
}
