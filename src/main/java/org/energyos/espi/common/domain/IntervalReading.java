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

import org.energyos.espi.common.models.atom.adapters.IntervalReadingAdapter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


/**
 * Specific value measured by a meter or other asset. Each Reading is associated with a specific ReadingType.
 *
 * <p>Java class for IntervalReading complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="IntervalReading">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}Object">
 *       &lt;sequence>
 *         &lt;element name="cost" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *         &lt;element name="ReadingQuality" type="{http://naesb.org/espi}ReadingQuality" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timePeriod" type="{http://naesb.org/espi}DateTimeInterval" minOccurs="0"/>
 *         &lt;element name="value" type="{http://naesb.org/espi}Int48" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalReading", propOrder = {
        "cost",
        "readingQualities",
        "timePeriod",
        "value"
})
@Entity
@Table(name = "interval_readings")
@XmlJavaTypeAdapter(IntervalReadingAdapter.class)
@XmlRootElement(name = "IntervalReading")
public class IntervalReading {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlTransient
    protected Long id;

    protected Long cost;

    @OneToMany(mappedBy = "intervalReading", cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    @XmlElementRefs({
            @XmlElementRef(name = "ReadingQuality", namespace = "http://naesb.org/espi", type = JAXBElement.class, required = false),
    })
    @XmlAnyElement(lax = true)
    protected List<ReadingQuality> readingQualities = new ArrayList<>();

    @Embedded
    protected DateTimeInterval timePeriod;

    protected Long value;

    @XmlTransient
    @ManyToOne
    @JoinColumn(name = "interval_block_id")
    protected IntervalBlock intervalBlock;

    /**
     * Gets the value of the cost property.
     *
     * @return possible object is
     *         {@link Long }
     */
    public Long getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     *
     * @param value allowed object is
     * {@link Long }
     */
    public void setCost(Long value) {
        this.cost = value;
    }

    /**
     * Gets the value of the readingQuality property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the readingQuality property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReadingQuality().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReadingQuality }
     */
    public List<ReadingQuality> getReadingQualities() {
        return this.readingQualities;
    }

    /**
     * Gets the value of the timePeriod property.
     *
     * @return possible object is
     *         {@link DateTimeInterval }
     */
    public DateTimeInterval getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     *
     * @param value allowed object is
     * {@link DateTimeInterval }
     */
    public void setTimePeriod(DateTimeInterval value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the value property.
     *
     * @return possible object is
     *         {@link Long }
     */
    public Long getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value allowed object is
     * {@link Long }
     */
    public void setValue(Long value) {
        this.value = value;
    }

    public IntervalBlock getIntervalBlock() {
        return intervalBlock;
    }

    public void setIntervalBlock(IntervalBlock intervalBlock) {
        this.intervalBlock = intervalBlock;
    }

    public void addReadingQuality(ReadingQuality readingQuality) {
        this.readingQualities.add(readingQuality);
        readingQuality.setIntervalReading(this);
    }
}
