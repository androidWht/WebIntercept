package com.sltpaya.open;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.sltpaya.open.web.intercept.WebHandler;
import com.sltpaya.open.web.intercept.WebIntercept;
import com.sltpaya.open.web.intercept.WebInterceptResult;
import com.sltpaya.web.annoation.Intercept;
import com.sltpaya.web.annoation.PathMode;

@Intercept(
        path = "https://www.baidu.com/abc.html",
        mode = PathMode.NORMAL
)
public class AutoIntercepter implements WebHandler {
    @NonNull
    @Override
    public WebInterceptResult handle(WebIntercept intercept, Context context, Uri uri) {
        return WebInterceptResult.noAction();
    }
}
