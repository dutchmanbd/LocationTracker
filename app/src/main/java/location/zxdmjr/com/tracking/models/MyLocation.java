package location.zxdmjr.com.tracking.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dutchman on 1/11/18.
 */

public class MyLocation {

    @SerializedName("location")
    private MyLtnLng myLtnLng;

    public MyLtnLng getMyLtnLng() {
        return myLtnLng;
    }

    public void setMyLtnLng(MyLtnLng myLtnLng) {
        this.myLtnLng = myLtnLng;
    }
}
