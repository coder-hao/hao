package com.ln.pojo;

public class AdminDept {
    private Integer id;

    private Integer parentid;

    private String parentname;

    private String name;

    private Integer isproduce;

    private Integer isemphasis;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname == null ? null : parentname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getIsproduce() {
        return isproduce;
    }

    public void setIsproduce(Integer isproduce) {
        this.isproduce = isproduce;
    }

    public Integer getIsemphasis() {
        return isemphasis;
    }

    public void setIsemphasis(Integer isemphasis) {
        this.isemphasis = isemphasis;
    }
}