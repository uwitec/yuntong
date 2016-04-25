package com.yuntong.hibernate.database.po;

import java.util.HashSet;
import java.util.Set;


/**
 * TPartner generated by MyEclipse - Hibernate Tools
 */

public class TPartner  implements java.io.Serializable {


    // Fields    

     private Integer partnerId;
     private TPartnetState TPartnetState;
     private TTruckInfo TTruckInfo;
     private TDriverInfo TDriverInfo;
     private Integer partnerType;
     private Set TRoadwaies = new HashSet(0);


    // Constructors

    /** default constructor */
    public TPartner() {
    }

	/** minimal constructor */
    public TPartner(Integer partnerId, TTruckInfo TTruckInfo, TDriverInfo TDriverInfo) {
        this.partnerId = partnerId;
        this.TTruckInfo = TTruckInfo;
        this.TDriverInfo = TDriverInfo;
    }
    
    /** full constructor */
    public TPartner(Integer partnerId, TPartnetState TPartnetState, TTruckInfo TTruckInfo, TDriverInfo TDriverInfo, Integer partnerType, Set TRoadwaies) {
        this.partnerId = partnerId;
        this.TPartnetState = TPartnetState;
        this.TTruckInfo = TTruckInfo;
        this.TDriverInfo = TDriverInfo;
        this.partnerType = partnerType;
        this.TRoadwaies = TRoadwaies;
    }

   
    // Property accessors

    public Integer getPartnerId() {
        return this.partnerId;
    }
    
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    public TPartnetState getTPartnetState() {
        return this.TPartnetState;
    }
    
    public void setTPartnetState(TPartnetState TPartnetState) {
        this.TPartnetState = TPartnetState;
    }

    public TTruckInfo getTTruckInfo() {
        return this.TTruckInfo;
    }
    
    public void setTTruckInfo(TTruckInfo TTruckInfo) {
        this.TTruckInfo = TTruckInfo;
    }

    public TDriverInfo getTDriverInfo() {
        return this.TDriverInfo;
    }
    
    public void setTDriverInfo(TDriverInfo TDriverInfo) {
        this.TDriverInfo = TDriverInfo;
    }

    public Integer getPartnerType() {
        return this.partnerType;
    }
    
    public void setPartnerType(Integer partnerType) {
        this.partnerType = partnerType;
    }

    public Set getTRoadwaies() {
        return this.TRoadwaies;
    }
    
    public void setTRoadwaies(Set TRoadwaies) {
        this.TRoadwaies = TRoadwaies;
    }
   








}