package location.zxdmjr.com.tracking.retrofits;

import location.zxdmjr.com.tracking.responses.GeoResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dutchman on 2/13/18.
 */

public interface GeoService {

    @GET("geocode/json")
    Call<GeoResponse> getGeoResponse(@Query("address") String address);

    @GET("geocode/json")
    Call<GeoResponse> getAddress(@Query("latlng") String latlng, @Query("sensor") boolean isActive);

}
