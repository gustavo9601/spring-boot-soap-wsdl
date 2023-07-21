package com.soap.client;

import com.soap.interceptors.LoggingInterceptor;
import com.soap.interceptors.ValoresInterceptorRequestScope;
import com.soap.wsdl.*;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.transport.context.TransportContext;
import org.springframework.ws.transport.context.TransportContextHolder;

public class SoapClient extends WebServiceGatewaySupport {


  @Autowired
  private ValoresInterceptorRequestScope valoresInterceptorRequestScope;


  public SoapClient() {
    logger.info("Inicializando el interceptor");
    LoggingInterceptor loggingInterceptor = new LoggingInterceptor();
    getWebServiceTemplate().setInterceptors(new ClientInterceptor[]{loggingInterceptor});
  }

  /**
   * Metodo que se encarga de sumar dos numeros
   *
   * @param numberA
   * @param numberB
   * @return AddResponse
   */
  public AddResponse getAddResponse(int numberA, int numberB) {

    Add addRequest = new Add();
    addRequest.setIntA(numberA);
    addRequest.setIntB(numberB);

    logger.info("Iniciando llamada al servicio web");
    SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Add");
    AddResponse addResponse = (AddResponse) getWebServiceTemplate().marshalSendAndReceive(
        "http://www.dneonline.com/calculator.asmx", addRequest, soapActionCallback);

    logger.info("Valores del flujo de respuesta");
    logger.info(valoresInterceptorRequestScope);

    logger.info("Tiempo de ejecucion en SoapClient:\t" +
        ValoresInterceptorRequestScope.getTiempoEjecucion());

    return addResponse;
  }


  public SubtractResponse getSubtractResponse(int numberA, int numberB) {

    Subtract subtractRequest = new Subtract();
    subtractRequest.setIntA(numberA);
    subtractRequest.setIntB(numberB);

    SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Subtract");

    SubtractResponse subtractResponse = (SubtractResponse) getWebServiceTemplate().marshalSendAndReceive(
        "http://www.dneonline.com/calculator.asmx", subtractRequest, soapActionCallback);

    return subtractResponse;
  }


  public MultiplyResponse getMultiplyResponse(int numberA, int numberB) {

    Multiply multiplyRequest = new Multiply();
    multiplyRequest.setIntA(numberA);
    multiplyRequest.setIntB(numberB);

    SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Multiply");

    MultiplyResponse multiplyResponse = (MultiplyResponse) getWebServiceTemplate().marshalSendAndReceive(
        "http://www.dneonline.com/calculator.asmx", multiplyRequest, soapActionCallback);

    return multiplyResponse;
  }


  public DivideResponse getDivideResponse(int numberA, int numberB) {

    Divide divideRequest = new Divide();
    divideRequest.setIntA(numberA);
    divideRequest.setIntB(numberB);

    SoapActionCallback soapActionCallback = new SoapActionCallback("http://tempuri.org/Divide");

    DivideResponse divideResponse = (DivideResponse) getWebServiceTemplate().marshalSendAndReceive(
        "http://www.dneonline.com/calculator.asmx", divideRequest, soapActionCallback);

    return divideResponse;
  }
}
