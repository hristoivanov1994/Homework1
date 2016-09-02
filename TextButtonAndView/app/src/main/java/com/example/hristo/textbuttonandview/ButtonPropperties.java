package com.example.hristo.textbuttonandview;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Hristo on 3.9.2016 г..
 */
public class ButtonPropperties implements Parcelable {
    private String buttonText;
    private String buttonId;

    ButtonPropperties()
    {
        this.buttonText="not selected";
        this.buttonId="not selected";
    }

    public void setButtonText(String buttonText)
    {
        this.buttonText=buttonText;
    }
    public void setButtonId(String buttonId)
    {
        this.buttonId=buttonId;
    }

    public String getButtonId() {
        return buttonId;
    }

    public String getButtonText() {
        return buttonText;
    }

    protected ButtonPropperties(Parcel in) {
        buttonText = in.readString();
        buttonId = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(buttonText);
        dest.writeString(buttonId);
    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<ButtonPropperties> CREATOR = new Parcelable.Creator<ButtonPropperties>() {
        @Override
        public ButtonPropperties createFromParcel(Parcel in) {
            return new ButtonPropperties(in);
        }

        @Override
        public ButtonPropperties[] newArray(int size) {
            return new ButtonPropperties[size];
        }
    };
}
