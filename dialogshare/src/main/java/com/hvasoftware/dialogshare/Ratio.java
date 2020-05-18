package com.hvasoftware.dialogshare;

import android.os.Parcel;
import android.os.Parcelable;


public class Ratio implements Parcelable {
    private double x;
    private double y;


    public Ratio(double x, double y) {
        this.x = x;
        this.y = y;
    }


    protected Ratio(Parcel in) {
        x = in.readDouble();
        y = in.readDouble();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(x);
        dest.writeDouble(y);
    }

    @SuppressWarnings("unused")
    public static final Creator<Ratio> CREATOR = new Creator<Ratio>() {
        @Override
        public Ratio createFromParcel(Parcel in) {
            return new Ratio(in);
        }

        @Override
        public Ratio[] newArray(int size) {
            return new Ratio[size];
        }
    };

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
