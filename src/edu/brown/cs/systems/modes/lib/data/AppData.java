package edu.brown.cs.systems.modes.lib.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/**
 * Information about mode-supporting apps
 * 
 * @author Marcelo Martins <martins@cs.brown.edu>
 * 
 */
public class AppData implements Parcelable {

    static private final String TAG = "AppData";

    private int uid;
    private String name;
    private String packageName;
    private String modeProxyClassName;  // class name used for supporting mode
                                        // client
    private int currentMode;           // current mode ID

    public AppData(int uid, String name, String packageName,
            String modeProxyClassName, int currentMode) {
        this.uid = uid;
        this.name = name;
        this.packageName = packageName;
        this.modeProxyClassName = modeProxyClassName;
        this.currentMode = currentMode;
    }

    public AppData(Parcel source) {
        /*
         * Reconstruct from Parcel
         */
        Log.v(TAG, "AppData(Parcel source)");
        uid = source.readInt();
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        assert uid > 0;
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getModeProxyClassName() {
        return modeProxyClassName;
    }

    public void setModeProxyClassName(String modeProxyClassName) {
        this.modeProxyClassName = modeProxyClassName;
    }

    public int getCurrentMode() {
        return currentMode;
    }

    public void setCurrentMode(int mode) {
        assert mode > 0;
        currentMode = mode;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(uid);
        dest.writeString(name);
        dest.writeString(packageName);
        dest.writeString(modeProxyClassName);
        dest.writeInt(currentMode);
    }

    /**
     * Required for unmarshalling data stored in Parcel
     * 
     * @author Marcelo Martins <martins@cs.brown.edu>
     * 
     */
    public static final Parcelable.Creator<AppData> CREATOR = new Parcelable.Creator<AppData>() {
        public AppData createFromParcel(Parcel source) {
            return new AppData(source);
        }

        public AppData[] newArray(int size) {
            return new AppData[size];
        }
    };
}