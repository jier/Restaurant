import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import java.util.ArrayList;

/**
 * Created by jier on 6-3-18.
 */
public interface Callback {
    void gotCategories(ArrayList<String> categories);
    void gotCategoriesError(String msg);
}
public class CategoriesRequest implements Callback {
    public CategoriesRequest(Context context) {
        super();
    }

    public void getCategories(Callback activity){
        RequestQueue queue = Volley.newRequestQueue();
    }


}
