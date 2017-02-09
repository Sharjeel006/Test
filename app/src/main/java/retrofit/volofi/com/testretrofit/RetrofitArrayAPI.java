package retrofit.volofi.com.testretrofit;

import java.util.List;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by sharjeelhussain on 2017-02-09.
 */

public interface RetrofitArrayAPI {

    /*
   * Retrofit get annotation with our URL
   * And our method that will return us details of student.
  */
    @GET("api/RetrofitAndroidArrayResponse")
    Call<List<Student>> getStudentDetails();
}
