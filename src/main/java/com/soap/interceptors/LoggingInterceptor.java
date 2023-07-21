package com.soap.interceptors;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;

@Slf4j
public class LoggingInterceptor implements ClientInterceptor {


  @Override
  public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
    try {
      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      messageContext.getRequest().writeTo(outputStream);
      String request = new String(outputStream.toByteArray());
      log.info("SOAP Request: " + request);
    } catch (IOException e) {
      log.error("Error logging SOAP request", e);
    }
    return true; // continue processing
  }

  @Override
  public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
    try {
      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      messageContext.getResponse().writeTo(outputStream);
      String response = new String(outputStream.toByteArray());
      log.info("SOAP Response: " + response);
    } catch (IOException e) {
      log.error("Error logging SOAP response", e);
    }
    return true; // continue processing
  }

  @Override
  public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
    // handle faults
    return true; // continue processing
  }

  @Override
  public void afterCompletion(MessageContext messageContext, Exception ex) throws WebServiceClientException {
    // clean up resources
  }
}
