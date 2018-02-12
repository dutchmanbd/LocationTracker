package location.zxdmjr.com.tracking.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dutchman on 1/11/18.
 */

public class MyLtnLng {

    @SerializedName("lat")
    private double lat;

    @SerializedName("lng")

    private double lng;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }
}
