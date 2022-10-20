package com.vls.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name="Moderator")
public class ModeratorEntity implements Serializable {
    @Id
    @Column(name = "VENDOR_ID")
    private String vendorId;

    @Column(name = "VENDOR_NAME", nullable = false)
    private String vendorName;

    @Column(name = "VENDOR_PASSWORD", nullable = false)
    private String vendorPassword;

    @Column(name = "VENDOR_PHONE")
    private long vendorPhone;

    @Column(name = "VENDOR_EMAIL")
    private String vendorEmail;

    @Column(name = "VENDOR_SPECS")
    private String vendorSpecs;

    public ModeratorEntity(){
    }

    public ModeratorEntity(String vendorId, String vendorName, String vendorPassword){
        this.vendorId= vendorId;
        this.vendorName = vendorName;
        this.vendorPassword = vendorPassword;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorPassword() {
        return vendorPassword;
    }

    public void setVendorPassword(String vendorPassword) {
        this.vendorPassword = vendorPassword;
    }

    public long getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(long vendorPhone) {
        this.vendorPhone = vendorPhone;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getVendorSpecs() {
        return vendorSpecs;
    }

    public void setVendorSpecs(String vendorSpecs) {
        this.vendorSpecs = vendorSpecs;
    }


    @Override
    public String toString() {
        return "Vendor{" +
                "vendorId='" + vendorId + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", vendorPassword='" + vendorPassword + '\'' +
                ", vendorPhone=" + vendorPhone +
                ", vendorEmail='" + vendorEmail + '\'' +
                ", vendorSpecs='" + vendorSpecs + '\'' +
                '}';
    }
}
