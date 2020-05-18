package com.hvasoftware.dialogshare;


import android.content.pm.ResolveInfo;

public class ShareActionModel {
    private String name;
    private String icon;
    private String type;
    private ResolveInfo appInfo;

    public ShareActionModel() {
    }

    public ShareActionModel(ResolveInfo appInfo) {
        this.appInfo = appInfo;
    }

    public String getName() {
        return name;
    }

    public String getIcon() {
        return icon;
    }

    public String getType() {
        return type;
    }

    public ResolveInfo getAppInfo() {
        return appInfo;
    }
}
