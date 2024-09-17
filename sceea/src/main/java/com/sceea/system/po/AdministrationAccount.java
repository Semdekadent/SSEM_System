package com.sceea.system.po;

public class AdministrationAccount {
    private Integer adminAccountId;

    private String adminAccount;

    private String adminPasswd;

    public Integer getAdminAccountId() {
        return adminAccountId;
    }

    public void setAdminAccountId(Integer adminAccountId) {
        this.adminAccountId = adminAccountId;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
    }

    public String getAdminPasswd() {
        return adminPasswd;
    }

    public void setAdminPasswd(String adminPasswd) {
        this.adminPasswd = adminPasswd == null ? null : adminPasswd.trim();
    }
}