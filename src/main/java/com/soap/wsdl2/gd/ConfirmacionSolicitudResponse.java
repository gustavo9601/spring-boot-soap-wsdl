//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.0 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.07.20 a las 06:59:40 PM COT 
//


package com.soap.wsdl2.gd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConfirmacionSolicitudResult" type="{http://schemas.datacontract.org/2004/07/Sicov1.Core.Integracion.DTOs.runt}SalidaConfirmacionSolicitud" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "confirmacionSolicitudResult"
})
@XmlRootElement(name = "ConfirmacionSolicitudResponse")
public class ConfirmacionSolicitudResponse {

    @XmlElementRef(name = "ConfirmacionSolicitudResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<SalidaConfirmacionSolicitud> confirmacionSolicitudResult;

    /**
     * Obtiene el valor de la propiedad confirmacionSolicitudResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SalidaConfirmacionSolicitud }{@code >}
     *     
     */
    public JAXBElement<SalidaConfirmacionSolicitud> getConfirmacionSolicitudResult() {
        return confirmacionSolicitudResult;
    }

    /**
     * Define el valor de la propiedad confirmacionSolicitudResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SalidaConfirmacionSolicitud }{@code >}
     *     
     */
    public void setConfirmacionSolicitudResult(JAXBElement<SalidaConfirmacionSolicitud> value) {
        this.confirmacionSolicitudResult = value;
    }

}
