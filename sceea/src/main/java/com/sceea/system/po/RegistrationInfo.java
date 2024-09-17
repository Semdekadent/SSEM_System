package com.sceea.system.po;

public class RegistrationInfo {
    private Integer infoId;

    private String examineeName;

    private Integer sex;

    private String people;

    private String id;

    private String domicile;

    private String politicalStatus;

    private String registratedCollege;

    private String registraredMajor;

    private String contact;

    private String city;

    private String district;

    private String affiliation;

    private byte[] auditingStatus;

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getExamineeName() {
        return examineeName;
    }

    public void setExamineeName(String examineeName) {
        this.examineeName = examineeName == null ? null : examineeName.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDomicile() {
        return domicile;
    }

    public void setDomicile(String domicile) {
        this.domicile = domicile == null ? null : domicile.trim();
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus == null ? null : politicalStatus.trim();
    }

    public String getRegistratedCollege() {
        return registratedCollege;
    }

    public void setRegistratedCollege(String registratedCollege) {
        this.registratedCollege = registratedCollege == null ? null : registratedCollege.trim();
    }

    public String getRegistraredMajor() {
        return registraredMajor;
    }

    public void setRegistraredMajor(String registraredMajor) {
        this.registraredMajor = registraredMajor == null ? null : registraredMajor.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation == null ? null : affiliation.trim();
    }

    public byte[] getAuditingStatus() {
        return auditingStatus;
    }

    public void setAuditingStatus(byte[] auditingStatus) {
        this.auditingStatus = auditingStatus;
    }
}