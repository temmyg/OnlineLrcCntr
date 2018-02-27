package com.cppib.ifrdh.entity;

import javax.persistence.*;

@Entity
@Table(name="Phase2OutputColumn")
public class Phase2OutputColumn2 {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int Id;

    private String displayName;
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    //** workable version 1
//	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "CellStyle", referencedColumnName ="FormatName", updatable = false, insertable = false)
//	private ColumnFormatEntity2 cellStyle;
//
//	public ColumnFormatEntity2 getCellStyle() {
//		return cellStyle;
//	}

    //** workable 2
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinColumn(name = "CellStyle", referencedColumnName ="FormatName", updatable = false, insertable = false)
//    private PrimaryKeyEntity abc;
//
//    public PrimaryKeyEntity getCellStyle() {
//        return abc;
//    }
//
//	public void setCellStyle(PrimaryKeyEntity cellStyle) {
//		this.abc = cellStyle;
//	}

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "CellStyle", referencedColumnName ="FormatName", updatable = false, insertable = false)
	private ColumnFormatEntity2 cellStyle;

	public ColumnFormatEntity2 getCellStyle() {
		return cellStyle;
	}

    public void setCellStyle(ColumnFormatEntity2 cellStyle) {
        this.cellStyle = cellStyle;
    }
}
