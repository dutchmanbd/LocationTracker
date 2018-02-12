package location.zxdmjr.com.tracking.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import location.zxdmjr.com.tracking.models.MyGeo;

/**
 * Created by dutchman on 2/13/18.
 */

public class GeoResponse {

    @SerializedName("results")
    private List<MyGeo> myGeos;

    public List<MyGeo> getMyGeos() {
        return myGeos;
    }

    public void setMyGeos(List<MyGeo> myGeos) {
        this.myGeos = myGeos;
    }

}
