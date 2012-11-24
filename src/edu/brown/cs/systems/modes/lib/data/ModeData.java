package edu.brown.cs.systems.modes.lib.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

/**
 * Information on app modes
 * 
 * @author Marcelo Martins <martins@cs.brown.edu>
 * 
 */
public class ModeData implements Parcelable {

    static private final String TAG = "ModeData";

    private int id;
    private String name;
    private int uid;
    private int power;
    private String description;

    public ModeData(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ModeData(int id, String name, int uid, int power, String description) {
        this(name, description);
        this.id = id;
        this.power = power;
        this.uid = uid;
    }

    public ModeData(Parcel source) {
        /*
         * Reconstruct from Parcel
         */
        Log.v(TAG, "AppModeMessage(Parcel source)");
        id = source.readInt();
        name = source.readString();
        uid = source.readInt();
        power = source.readInt();
        description = source.readString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        assert id > 0;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        assert uid > 0;
        this.uid = uid;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        assert power >= 0;
        this.power = power;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeInt(uid);
        dest.writeInt(power);
        dest.writeString(description);
    }

    /**
     * Require for unmarshalling data stored in Parcel
     * 
     * @author Marcelo Martins <martins@cs.brown.edu>
     * 
     */
    public static final Parcelable.Creator<ModeData> CREATOR = new Parcelable.Creator<ModeData>() {

        public ModeData createFromParcel(Parcel source) {
            return new ModeData(source);
        }

        public ModeData[] newArray(int size) {
            return new ModeData[size];
        }
    };
}
