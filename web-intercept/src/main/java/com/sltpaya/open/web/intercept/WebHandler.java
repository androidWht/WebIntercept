package com.sltpaya.open.web.intercept;

import android.content.Context;
import android.net.Uri;


public interface WebHandler {

    WebInterceptResult handle(Context context,WebIntercept intercept, Uri uri);

}
