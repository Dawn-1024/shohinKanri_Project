package model.data;

import java.io.Serializable;

public class ShohinRecord implements Serializable{
	private String shohinId;
	private String shohinMei;
	private String shohinBunrui;
	private int hanbaiTanka;
	private int shiireTanka;
	
	public ShohinRecord() {
		
	}

	public ShohinRecord(String shohinId) {
		this.shohinId = shohinId;
	}
	
	public ShohinRecord(String shohinId,String shohinMei,String shohinBunrui,int hanbaiTanka,int shiireTanka) {
		this.shohinId =shohinId;
		this.shohinMei = shohinMei;
		this.shohinBunrui = shohinBunrui;
		this.hanbaiTanka = hanbaiTanka;
		this.shiireTanka = shiireTanka;
	}
	
	public String getShohinId() {
		return shohinId;
	}

	public String getShohinMei() {
		return shohinMei;
	}

	public String getShohinBunrui() {
		return shohinBunrui;
	}

	public int getHanbaiTanka() {
		return hanbaiTanka;
	}

	public int getShiireTanka() {
		return shiireTanka;
	}
	
	
}
