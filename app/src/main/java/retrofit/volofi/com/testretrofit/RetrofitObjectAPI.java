package retrofit.volofi.com.testretrofit;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by sharjeelhussain on 2017-02-09.
 */

public interface RetrofitObjectAPI {

    /*
    * Retrofit get annotation with our URL
    * And our method that will return us details of student.s
   */
    @GET("api/RetrofitAndroidObjectResponse")
    Call<Student> getStudentDetails();

}
