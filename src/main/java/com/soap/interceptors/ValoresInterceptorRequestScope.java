package com.soap.interceptors;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@RequestScope
public class ValoresInterceptorRequestScope {

  private long tiempoInicio;
  private double tiempoEjecucion;
  private String request;
  private String response;

}
