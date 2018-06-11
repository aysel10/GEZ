package crocusoft.com.gez.services;
import android.util.Log;

import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.List;
import java.util.Map;

class MyCookieManager extends CookieManager {
    @Override
    public void put(URI uri, Map<String, List<String>> responseHeaders) throws IOException {
        super.put(uri, responseHeaders);
        if (responseHeaders != null && responseHeaders.get("Set-Cookie") != null)
            for (String string : responseHeaders.get("Set-Cookie")) {
                if (string.contains("userid")) {
                    //save your cookie here
                    Log.e("sdf","sdfsdf");
                }
            }
    }
}