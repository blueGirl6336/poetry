package com.demo.pojo;

//import org.hibernate.validator.constraints.NotEmpty;

public class Poetry {
	//诗词id
	private int _id;
	//诗词名称
	private String mingcheng;
	//作者
	private String zuozhe;
	//诗评
	private int shipin;
	//诗词题材
	private String ticai;
	//诗词朝代
	private String chaodai;
	//作者国家
	private String guojia;
	//诗词分类
	private String fenlei;
	//原文所属阶段
	private String jieduan;
	//原文所属课本
	private String keben;
	//诗词综述
	private String congshu;
	//诗词摘要
	private String zhaiyao;
	//诗词出处
	private String chuchu;
	//诗词原文
	private String yuanwen;
	//原文朗读
	private int voice;

	public int get_Id() {
		return _id;
	}
	public void set_Id(int _id) {
		this._id = _id;
	}
	
	public String getMingcheng() {
		return mingcheng;
	}
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	
	public String getZuozhe() {
		return zuozhe;
	}
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	
	public int getShipin() {
		return shipin;
	}
	public void setShipin(int shipin) {
		this.shipin = shipin;
	}
	
	public String getTicai() {
		return ticai;
	}
	public void setTicai(String ticai) {
		this.ticai = ticai;
	}
	
	public String getChaodai() {
		return chaodai;
	}
	public void setChaodai(String chaodai) {
		this.chaodai = chaodai;
	}
	
	public String getGuojia() {
		return guojia;
	}
	public void setGuojia(String guojia) {
		this.guojia = guojia;
	}
	
	public String getFenlei() {
		return fenlei;
	}
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	public String getJieduan() {
		return jieduan;
	}
	public void setJieduan(String jieduan) {
		this.jieduan = jieduan;
	}
	
	public String getKeben() {
		return keben;
	}
	public void setKeben(String keben) {
		this.keben = keben;
	}
	
	public String getCongshu() {
		return congshu;
	}
	public void setCongshu(String congshu) {
		this.congshu = congshu;
	}
	
	public String getChuchu() {
		return chuchu;
	}
	public void setChuchu(String chuchu) {
		this.chuchu = chuchu;
	}
	
	public String getZhaiyao() {
		return zhaiyao;
	}
	public void setZhaiyao(String zhaiyao) {
		this.zhaiyao = zhaiyao;
	}
	
	public String getYuanwen() {
		return yuanwen;
	}
	public void setYuanwen(String yuanwen) {
		this.yuanwen = yuanwen;
	}
	
	public int getVoice() {
		return voice;
	}
	public void setVoice(int voice) {
		this.voice = voice;
	}
}