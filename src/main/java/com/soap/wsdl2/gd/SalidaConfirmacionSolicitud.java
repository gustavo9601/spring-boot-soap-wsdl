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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para SalidaConfirmacionSolicitud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SalidaConfirmacionSolicitud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AprobacionSicov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DetalleRechazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaProcesoSicov" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdProcesoSicov" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalidaConfirmacionSolicitud", namespace = "http://schemas.datacontract.org/2004/07/Sicov1.Core.Integracion.DTOs.runt", propOrder = {
    "aprobacionSicov",
    "detalleRechazo",
    "fechaProcesoSicov",
    "idProcesoSicov"
})
public class SalidaConfirmacionSolicitud {

    @XmlElementRef(name = "AprobacionSicov", namespace = "http://schemas.datacontract.org/2004/07/Sicov1.Core.Integracion.DTOs.runt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aprobacionSicov;
    @XmlElementRef(name = "DetalleRechazo", namespace = "http://schemas.datacontract.org/2004/07/Sicov1.Core.Integracion.DTOs.runt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> detalleRechazo;
    @XmlElement(name = "FechaProcesoSicov")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaProcesoSicov;
    @XmlElement(name = "IdProcesoSicov")
    protected Long idProcesoSicov;

    /**
     * Obtiene el valor de la propiedad aprobacionSicov.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAprobacionSicov() {
        return aprobacionSicov;
    }

    /**
     * Define el valor de la propiedad aprobacionSicov.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAprobacionSicov(JAXBElement<String> value) {
        this.aprobacionSicov = value;
    }

    /**
     * Obtiene el valor de la propiedad detalleRechazo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetalleRechazo() {
        return detalleRechazo;
    }

    /**
     * Define el valor de la propiedad detalleRechazo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetalleRechazo(JAXBElement<String> value) {
        this.detalleRechazo = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaProcesoSicov.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaProcesoSicov() {
        return fechaProcesoSicov;
    }

    /**
     * Define el valor de la propiedad fechaProcesoSicov.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaProcesoSicov(XMLGregorianCalendar value) {
        this.fechaProcesoSicov = value;
    }

    /**
     * Obtiene el valor de la propiedad idProcesoSicov.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdProcesoSicov() {
        return idProcesoSicov;
    }

    /**
     * Define el valor de la propiedad idProcesoSicov.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdProcesoSicov(Long value) {
        this.idProcesoSicov = value;
    }

}
