package com.soap.interceptors;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.soap.SoapMessage;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;

@Slf4j
public class LoggingInterceptor implements ClientInterceptor {

  private ThreadLocal<Long> time = new ThreadLocal<>();


  @Override
  public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
    try {

      time.set(System.currentTimeMillis());
      log.info("Tiempo de inicialización: " + time.get());
      ValoresInterceptorRequestScope.setTiempoInicio(time.get());



      ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
      messageContext.getRequest().writeTo(outputStream);
      String request = new String(outputStream.toByteArray());
      ValoresInterceptorRequestScope.setRequest(request);


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
      ValoresInterceptorRequestScope.setResponse(response);

      log.info("Tiempo de finalización: " + ((System.currentTimeMillis() - time.get()) / 1000.0));
      ValoresInterceptorRequestScope.setTiempoEjecucion(System.currentTimeMillis() - time.get());

      SoapMessage responseContext = (SoapMessage) messageContext.getResponse();
      if (responseContext.getSoapBody().hasFault()) {
        log.error("La peticion SOAP fallo y la razon es: " + responseContext.getSoapBody().getFault().getFaultStringOrReason());
        // Manejar el fallo como sea apropiado para tu aplicación
      } else {
        log.info("La peticion SOAP fue exitosa");
      }


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
