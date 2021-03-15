package com.bb.server;

import android.os.Parcel;
import android.os.Parcelable;

public class State implements Parcelable {
    int code = 100;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.code);
    }

    public State() {
    }

    protected State(Parcel in) {
        this.code = in.readInt();
    }

    public static final Creator<State> CREATOR = new Creator<State>() {
        @Override
        public State createFromParcel(Parcel source) {
            return new State(source);
        }

        @Override
        public State[] newArray(int size) {
            return new State[size];
        }
    };
}
