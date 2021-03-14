package com.hltj.api.domain;

import java.util.Date;

public class TStockStrategy extends BaseEntity {
    private String id;

    private String stockCode;

    private String stockName;

    private Date startShareDate;

    private Date endShareDate;

    private Date darkDate;

    private Date listingDate;

    private String moduleName;

    private String moduleImage;

    private Byte status;

    private Date createDatetime;

    private String createdBy;

    private Date updateDatetime;

    private String updatedBy;

    private String moduleContent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public Date getStartShareDate() {
        return startShareDate;
    }

    public void setStartShareDate(Date startShareDate) {
        this.startShareDate = startShareDate;
    }

    public Date getEndShareDate() {
        return endShareDate;
    }

    public void setEndShareDate(Date endShareDate) {
        this.endShareDate = endShareDate;
    }

    public Date getDarkDate() {
        return darkDate;
    }

    public void setDarkDate(Date darkDate) {
        this.darkDate = darkDate;
    }

    public Date getListingDate() {
        return listingDate;
    }

    public void setListingDate(Date listingDate) {
        this.listingDate = listingDate;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName == null ? null : moduleName.trim();
    }

    public String getModuleImage() {
        return moduleImage;
    }

    public void setModuleImage(String moduleImage) {
        this.moduleImage = moduleImage == null ? null : moduleImage.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public String getModuleContent() {
        return moduleContent;
    }

    public void setModuleContent(String moduleContent) {
        this.moduleContent = moduleContent == null ? null : moduleContent.trim();
    }
}