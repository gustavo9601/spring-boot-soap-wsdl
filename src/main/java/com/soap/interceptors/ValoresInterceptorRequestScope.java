package com.soap.interceptors;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;


@Component
@RequestScope
public class ValoresInterceptorRequestScope {

  static long tiempoInicio;
  static double tiempoEjecucion;
  static String request;
  static String response;

  public static long getTiempoInicio() {
    return tiempoInicio;
  }

  public static void setTiempoInicio(long tiempoInicio) {
    ValoresInterceptorRequestScope.tiempoInicio = tiempoInicio;
  }

  public static double getTiempoEjecucion() {
    return tiempoEjecucion;
  }

  public static void setTiempoEjecucion(double tiempoEjecucion) {
    ValoresInterceptorRequestScope.tiempoEjecucion = tiempoEjecucion;
  }

  public static String getRequest() {
    return request;
  }

  public static void setRequest(String request) {
    ValoresInterceptorRequestScope.request = request;
  }

  public static String getResponse() {
    return response;
  }

  public static void setResponse(String response) {
    ValoresInterceptorRequestScope.response = response;
  }

  @Override
  public String toString() {
    return "ValoresInterceptorRequestScope{" + "tiempoInicio=" + tiempoInicio + ", tiempoEjecucion="
        + tiempoEjecucion + ", request=" + request + ", response=" + response + '}';
  }
}
