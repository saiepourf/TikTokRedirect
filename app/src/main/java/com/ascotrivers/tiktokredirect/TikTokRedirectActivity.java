package com.ascotrivers.tiktokredirect;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class TikTokRedirectActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Uri tiktokUri = getIntent().getData();
        if (tiktokUri != null) {
            Intent grayjayIntent = new Intent(Intent.ACTION_VIEW);
            grayjayIntent.setData(Uri.parse("grayjay://plugin?url=" + tiktokUri.toString()));
            grayjayIntent.setPackage("org.futo.grayjay");
            startActivity(grayjayIntent);
        }

        finish();
    }
}
