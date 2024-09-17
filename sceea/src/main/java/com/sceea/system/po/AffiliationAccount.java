package com.sceea.system.po;

public class AffiliationAccount {
    private Integer affiliationId;

    private String affiliationName;

    private String affiliationPasswd;

    private String corporateBodyName;

    private String corporateBodyId;

    private byte[] authenticationStatus;

    public Integer getAffiliationId() {
        return affiliationId;
    }

    public void setAffiliationId(Integer affiliationId) {
        this.affiliationId = affiliationId;
    }

    public String getAffiliationName() {
        return affiliationName;
    }

    public void setAffiliationName(String affiliationName) {
        this.affiliationName = affiliationName == null ? null : affiliationName.trim();
    }

    public String getAffiliationPasswd() {
        return affiliationPasswd;
    }

    public void setAffiliationPasswd(String affiliationPasswd) {
        this.affiliationPasswd = affiliationPasswd == null ? null : affiliationPasswd.trim();
    }

    public String getCorporateBodyName() {
        return corporateBodyName;
    }

    public void setCorporateBodyName(String corporateBodyName) {
        this.corporateBodyName = corporateBodyName == null ? null : corporateBodyName.trim();
    }

    public String getCorporateBodyId() {
        return corporateBodyId;
    }

    public void setCorporateBodyId(String corporateBodyId) {
        this.corporateBodyId = corporateBodyId == null ? null : corporateBodyId.trim();
    }

    public byte[] getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(byte[] authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }
}