package com.sltpaya.open.web.intercept;

import android.content.Context;
import android.net.Uri;


public interface WebHandler {

    WebInterceptResult handle(WebIntercept intercept, Context context, Uri uri);

}
