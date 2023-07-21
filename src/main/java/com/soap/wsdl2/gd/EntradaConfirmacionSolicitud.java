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
 * <p>Clase Java para EntradaConfirmacionSolicitud complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EntradaConfirmacionSolicitud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodigoTramite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="FechaSolicitud" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IdCrcRunt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NombreCategoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NumeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Restricciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntradaConfirmacionSolicitud", namespace = "http://schemas.datacontract.org/2004/07/Sicov1.Core.Integracion.DTOs.runt", propOrder = {
    "codigoTramite",
    "fechaSolicitud",
    "idCrcRunt",
    "nombreCategoria",
    "numeroDocumento",
    "restricciones",
    "tipoDocumento"
})
public class EntradaConfirmacionSolicitud {

    @XmlElement(name = "CodigoTramite")
    protected Integer codigoTramite;
    @XmlElement(name = "FechaSolicitud")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaSolicitud;
    @XmlElement(name = "IdCrcRunt")
    protected Long idCrcRunt;
    @XmlElementRef(name = "NombreCategoria", namespace = "http://schemas.datacontract.org/2004/07/Sicov1.Core.Integracion.DTOs.runt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreCategoria;
    @XmlElementRef(name = "NumeroDocumento", namespace = "http://schemas.datacontract.org/2004/07/Sicov1.Core.Integracion.DTOs.runt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroDocumento;
    @XmlElementRef(name = "Restricciones", namespace = "http://schemas.datacontract.org/2004/07/Sicov1.Core.Integracion.DTOs.runt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> restricciones;
    @XmlElementRef(name = "TipoDocumento", namespace = "http://schemas.datacontract.org/2004/07/Sicov1.Core.Integracion.DTOs.runt", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDocumento;

    /**
     * Obtiene el valor de la propiedad codigoTramite.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoTramite() {
        return codigoTramite;
    }

    /**
     * Define el valor de la propiedad codigoTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoTramite(Integer value) {
        this.codigoTramite = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaSolicitud.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * Define el valor de la propiedad fechaSolicitud.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaSolicitud(XMLGregorianCalendar value) {
        this.fechaSolicitud = value;
    }

    /**
     * Obtiene el valor de la propiedad idCrcRunt.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getIdCrcRunt() {
        return idCrcRunt;
    }

    /**
     * Define el valor de la propiedad idCrcRunt.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setIdCrcRunt(Long value) {
        this.idCrcRunt = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCategoria.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreCategoria() {
        return nombreCategoria;
    }

    /**
     * Define el valor de la propiedad nombreCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreCategoria(JAXBElement<String> value) {
        this.nombreCategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Define el valor de la propiedad numeroDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroDocumento(JAXBElement<String> value) {
        this.numeroDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad restricciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRestricciones() {
        return restricciones;
    }

    /**
     * Define el valor de la propiedad restricciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRestricciones(JAXBElement<String> value) {
        this.restricciones = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDocumento(JAXBElement<String> value) {
        this.tipoDocumento = value;
    }

}
