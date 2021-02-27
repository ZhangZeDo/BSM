package com.hltj.api.domain;

public class TSequence extends BaseEntity {
    private String sequenceName;

    private Integer sequenceValue;

    private Integer version;

    public String getSequenceName() {
        return sequenceName;
    }

    public void setSequenceName(String sequenceName) {
        this.sequenceName = sequenceName == null ? null : sequenceName.trim();
    }

    public Integer getSequenceValue() {
        return sequenceValue;
    }

    public void setSequenceValue(Integer sequenceValue) {
        this.sequenceValue = sequenceValue;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}