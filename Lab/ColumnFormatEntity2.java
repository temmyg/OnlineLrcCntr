package com.cppib.ifrdh.entity;

import com.cppib.ifrdh.utils.DisplayFormat;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ColumnFormat")
public class ColumnFormatEntity2 {

    @Id
    //@Column(name = "FormatName")
    //@Enumerated(EnumType.STRING)
    private String formatName;

    private String formatDescription;
    private String formatValue;

    // try 1
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "CellStyle")
    private List<ForeignKeyEntity> phase2OutputColumnEntity;

    public List<ForeignKeyEntity> getPhase2OutputColumnEntity() {
        return phase2OutputColumnEntity;
    }

    public void setPhase2OutputColumnEntity(List<ForeignKeyEntity> phase2OutputColumnEntity) {
        this.phase2OutputColumnEntity = phase2OutputColumnEntity;
    }

    // existing
    public String getFormatName() {
        return formatName;
    }

    public void setFormatName(String formatName) {
        this.formatName = formatName;
    }

    public String getFormatDescription() {
        return formatDescription;
    }

    public void setFormatDescription(String formatDescription) {
        this.formatDescription = formatDescription;
    }

    public String getFormatValue() {
        return formatValue;
    }

    public void setFormatValue(String formatValue) {
        this.formatValue = formatValue;
    }
}
