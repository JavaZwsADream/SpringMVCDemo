package com.aiit.Pojo;

public class Role {

    private Integer id;

    private String realName;

    private  String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", realName='" + realName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
