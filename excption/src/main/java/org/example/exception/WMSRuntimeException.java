/*
 * Copyright (c) 2021 CEVA Logistics, Inc. All Rights Reserved.
 */

package org.example.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * WMSRuntimeException thrown from the controller layer to be managed by the GlobalExceptionHandler.
 *
 * @author Raul Garnacho
 */
public class WMSRuntimeException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  private static final Logger LOGGER = LoggerFactory.getLogger(WMSRuntimeException.class);

  private WMSException exception;

  /**
   * Instantiates a new Generic Rest Api exception.
   *
   * @param wmsException the exception
   */
  public WMSRuntimeException(WMSException wmsException) {
    super(wmsException.getMessage());
    this.exception = wmsException;
    LOGGER.error("WMSRuntimeException: {}", exception.toString());
  }

  public WMSException getException() {
    return exception;
  }
}
