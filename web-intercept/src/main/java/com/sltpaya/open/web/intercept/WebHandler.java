package com.sltpaya.open.web.intercept;

import android.content.Context;
import android.net.Uri;

import androidx.annotation.NonNull;

public interface WebHandler {

    @NonNull
    WebInterceptResult handle(WebIntercept intercept, Context context, Uri uri);

}
