package location.zxdmjr.com.tracking.retrofits;

import location.zxdmjr.com.tracking.constants.Constant;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by dutchman on 2/13/18.
 */

public class GeoApiClient {

    private static Retrofit retrofit;

    public static Retrofit getClient(){

        if(retrofit == null){

            retrofit = new Retrofit.Builder()
                    .baseUrl(Constant.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }

        return retrofit;
    }

}
