package location.zxdmjr.com.tracking.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dutchman on 1/11/18.
 */

public class MyGeo {

    @SerializedName("geometry")
    private MyLocation mLocation;

    @SerializedName("formatted_address")
    private String formattedAddress;



    public MyGeo(MyLocation mLocation, String formattedAddress) {
        this.mLocation = mLocation;
        this.formattedAddress = formattedAddress;
    }

    public MyLocation getmLocation() {
        return mLocation;
    }

    public void setmLocation(MyLocation mLocation) {
        this.mLocation = mLocation;
    }

    public String getFormattedAddress() {
        return formattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        this.formattedAddress = formattedAddress;
    }
}
