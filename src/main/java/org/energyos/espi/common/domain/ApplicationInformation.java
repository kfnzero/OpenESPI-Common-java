/*
 * Copyright 2013 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.27 at 01:43:57 PM EDT 
//


package org.energyos.espi.common.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains information about a Third Party Application requesting access to the DataCustodian services. Information requested may include items such as Organization Name, Website, Contact Info, Application Name, Description, Icon, Type, default Notification and Callback endpoints, and may also include agreement with terms of service.
 *
 * <p>Java class for ApplicationInformation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ApplicationInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}IdentifiedObject">
 *       &lt;sequence>
 *         &lt;element name="dataCustodianApplicationStatus" type="{http://naesb.org/espi}DataCustodianApplicationStatus" minOccurs="0"/>
 *         &lt;element name="dataCustodianDefaultBatchResource" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="dataCustodianDefaultSubscriptionResource" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="dataCustodianThirdPartyId" type="{http://naesb.org/espi}String32" minOccurs="0"/>
 *         &lt;element name="dataCustodianThirdPartySecret" type="{http://naesb.org/espi}String32" minOccurs="0"/>
 *         &lt;element name="thirdPartyApplicationDescription" type="{http://naesb.org/espi}String256" minOccurs="0"/>
 *         &lt;element name="thirdPartyApplicationLogo" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="thirdPartyApplicationName" type="{http://naesb.org/espi}String32" minOccurs="0"/>
 *         &lt;element name="thirdPartyApplicationStatus" type="{http://naesb.org/espi}ThirdPartyApplicatonStatus" minOccurs="0"/>
 *         &lt;element name="thirdPartyApplicationType" type="{http://naesb.org/espi}ThirdPartyApplicationType" minOccurs="0"/>
 *         &lt;element name="thirdPartyApplicationUse" type="{http://naesb.org/espi}ThirdPartyApplicationUse" minOccurs="0"/>
 *         &lt;element name="thirdPartyApplicationWebsite" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="thirdPartyDefaultBatchResource" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="thirdPartyDefaultNotifyResource" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="thirdPartyDefaultOAuthCallback" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="thirdPartyEmail" type="{http://naesb.org/espi}String64" minOccurs="0"/>
 *         &lt;element name="thirdPartyName" type="{http://naesb.org/espi}String64" minOccurs="0"/>
 *         &lt;element name="thirdPartyPhone" type="{http://naesb.org/espi}String32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationInformation", propOrder = {
        "dataCustodianApplicationStatus",
        "dataCustodianDefaultBatchResource",
        "dataCustodianDefaultSubscriptionResource",
        "dataCustodianThirdPartyId",
        "dataCustodianThirdPartySecret",
        "thirdPartyApplicationDescription",
        "thirdPartyApplicationLogo",
        "thirdPartyApplicationName",
        "thirdPartyApplicationStatus",
        "thirdPartyApplicationType",
        "thirdPartyApplicationUse",
        "thirdPartyApplicationWebsite",
        "thirdPartyDefaultBatchResource",
        "thirdPartyDefaultNotifyResource",
        "thirdPartyDefaultOAuthCallback",
        "thirdPartyEmail",
        "thirdPartyName",
        "thirdPartyPhone"
})
public class ApplicationInformation
        extends IdentifiedObject {

    protected String dataCustodianApplicationStatus;
    @XmlSchemaType(name = "anyURI")
    protected String dataCustodianDefaultBatchResource;
    @XmlSchemaType(name = "anyURI")
    protected String dataCustodianDefaultSubscriptionResource;
    protected String dataCustodianThirdPartyId;
    protected String dataCustodianThirdPartySecret;
    protected String thirdPartyApplicationDescription;
    @XmlSchemaType(name = "anyURI")
    protected String thirdPartyApplicationLogo;
    protected String thirdPartyApplicationName;
    protected String thirdPartyApplicationStatus;
    protected String thirdPartyApplicationType;
    protected String thirdPartyApplicationUse;
    @XmlSchemaType(name = "anyURI")
    protected String thirdPartyApplicationWebsite;
    @XmlSchemaType(name = "anyURI")
    protected String thirdPartyDefaultBatchResource;
    @XmlSchemaType(name = "anyURI")
    protected String thirdPartyDefaultNotifyResource;
    @XmlSchemaType(name = "anyURI")
    protected String thirdPartyDefaultOAuthCallback;
    protected String thirdPartyEmail;
    protected String thirdPartyName;
    protected String thirdPartyPhone;

    /**
     * Gets the value of the dataCustodianApplicationStatus property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDataCustodianApplicationStatus() {
        return dataCustodianApplicationStatus;
    }

    /**
     * Sets the value of the dataCustodianApplicationStatus property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setDataCustodianApplicationStatus(String value) {
        this.dataCustodianApplicationStatus = value;
    }

    /**
     * Gets the value of the dataCustodianDefaultBatchResource property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDataCustodianDefaultBatchResource() {
        return dataCustodianDefaultBatchResource;
    }

    /**
     * Sets the value of the dataCustodianDefaultBatchResource property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setDataCustodianDefaultBatchResource(String value) {
        this.dataCustodianDefaultBatchResource = value;
    }

    /**
     * Gets the value of the dataCustodianDefaultSubscriptionResource property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDataCustodianDefaultSubscriptionResource() {
        return dataCustodianDefaultSubscriptionResource;
    }

    /**
     * Sets the value of the dataCustodianDefaultSubscriptionResource property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setDataCustodianDefaultSubscriptionResource(String value) {
        this.dataCustodianDefaultSubscriptionResource = value;
    }

    /**
     * Gets the value of the dataCustodianThirdPartyId property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDataCustodianThirdPartyId() {
        return dataCustodianThirdPartyId;
    }

    /**
     * Sets the value of the dataCustodianThirdPartyId property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setDataCustodianThirdPartyId(String value) {
        this.dataCustodianThirdPartyId = value;
    }

    /**
     * Gets the value of the dataCustodianThirdPartySecret property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDataCustodianThirdPartySecret() {
        return dataCustodianThirdPartySecret;
    }

    /**
     * Sets the value of the dataCustodianThirdPartySecret property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setDataCustodianThirdPartySecret(String value) {
        this.dataCustodianThirdPartySecret = value;
    }

    /**
     * Gets the value of the thirdPartyApplicationDescription property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getThirdPartyApplicationDescription() {
        return thirdPartyApplicationDescription;
    }

    /**
     * Sets the value of the thirdPartyApplicationDescription property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setThirdPartyApplicationDescription(String value) {
        this.thirdPartyApplicationDescription = value;
    }

    /**
     * Gets the value of the thirdPartyApplicationLogo property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getThirdPartyApplicationLogo() {
        return thirdPartyApplicationLogo;
    }

    /**
     * Sets the value of the thirdPartyApplicationLogo property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setThirdPartyApplicationLogo(String value) {
        this.thirdPartyApplicationLogo = value;
    }

    /**
     * Gets the value of the thirdPartyApplicationName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getThirdPartyApplicationName() {
        return thirdPartyApplicationName;
    }

    /**
     * Sets the value of the thirdPartyApplicationName property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setThirdPartyApplicationName(String value) {
        this.thirdPartyApplicationName = value;
    }

    /**
     * Gets the value of the thirdPartyApplicationStatus property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getThirdPartyApplicationStatus() {
        return thirdPartyApplicationStatus;
    }

    /**
     * Sets the value of the thirdPartyApplicationStatus property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setThirdPartyApplicationStatus(String value) {
        this.thirdPartyApplicationStatus = value;
    }

    /**
     * Gets the value of the thirdPartyApplicationType property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getThirdPartyApplicationType() {
        return thirdPartyApplicationType;
    }

    /**
     * Sets the value of the thirdPartyApplicationType property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setThirdPartyApplicationType(String value) {
        this.thirdPartyApplicationType = value;
    }

    /**
     * Gets the value of the thirdPartyApplicationUse property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getThirdPartyApplicationUse() {
        return thirdPartyApplicationUse;
    }

    /**
     * Sets the value of the thirdPartyApplicationUse property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setThirdPartyApplicationUse(String value) {
        this.thirdPartyApplicationUse = value;
    }

    /**
     * Gets the value of the thirdPartyApplicationWebsite property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getThirdPartyApplicationWebsite() {
        return thirdPartyApplicationWebsite;
    }

    /**
     * Sets the value of the thirdPartyApplicationWebsite property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setThirdPartyApplicationWebsite(String value) {
        this.thirdPartyApplicationWebsite = value;
    }

    /**
     * Gets the value of the thirdPartyDefaultBatchResource property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getThirdPartyDefaultBatchResource() {
        return thirdPartyDefaultBatchResource;
    }

    /**
     * Sets the value of the thirdPartyDefaultBatchResource property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setThirdPartyDefaultBatchResource(String value) {
        this.thirdPartyDefaultBatchResource = value;
    }

    /**
     * Gets the value of the thirdPartyDefaultNotifyResource property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getThirdPartyDefaultNotifyResource() {
        return thirdPartyDefaultNotifyResource;
    }

    /**
     * Sets the value of the thirdPartyDefaultNotifyResource property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setThirdPartyDefaultNotifyResource(String value) {
        this.thirdPartyDefaultNotifyResource = value;
    }

    /**
     * Gets the value of the thirdPartyDefaultOAuthCallback property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getThirdPartyDefaultOAuthCallback() {
        return thirdPartyDefaultOAuthCallback;
    }

    /**
     * Sets the value of the thirdPartyDefaultOAuthCallback property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setThirdPartyDefaultOAuthCallback(String value) {
        this.thirdPartyDefaultOAuthCallback = value;
    }

    /**
     * Gets the value of the thirdPartyEmail property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getThirdPartyEmail() {
        return thirdPartyEmail;
    }

    /**
     * Sets the value of the thirdPartyEmail property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setThirdPartyEmail(String value) {
        this.thirdPartyEmail = value;
    }

    /**
     * Gets the value of the thirdPartyName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getThirdPartyName() {
        return thirdPartyName;
    }

    /**
     * Sets the value of the thirdPartyName property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setThirdPartyName(String value) {
        this.thirdPartyName = value;
    }

    /**
     * Gets the value of the thirdPartyPhone property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getThirdPartyPhone() {
        return thirdPartyPhone;
    }

    /**
     * Sets the value of the thirdPartyPhone property.
     *
     * @param value allowed object is
     * {@link String }
     */
    public void setThirdPartyPhone(String value) {
        this.thirdPartyPhone = value;
    }

}
