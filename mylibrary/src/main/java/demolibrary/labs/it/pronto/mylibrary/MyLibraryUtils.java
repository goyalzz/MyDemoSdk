package demolibrary.labs.it.pronto.mylibrary;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.PermissionChecker;

/**
 * Created by pronto on 22/7/16.
 */
public class MyLibraryUtils {

    private MyLibraryUtils() {}

    public static boolean hasPermission(Context context, String permission) {
        // For API 23+, permissions should be checked at runtime, not manifest level
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            int targetSdkVersion = 0;
            try {
                final PackageInfo info = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                targetSdkVersion = info.applicationInfo.targetSdkVersion;
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            if (targetSdkVersion >= Build.VERSION_CODES.M) {
                // targetSdkVersion >= Android M, we can use ContextCompat#checkSelfPermission
                return ContextCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED;
            } else {
                // targetSdkVersion < Android M, we have to use PermissionChecker
                return PermissionChecker.checkSelfPermission(context, permission) == PermissionChecker.PERMISSION_GRANTED;
            }
        }

        return context.checkCallingOrSelfPermission(permission) == PackageManager.PERMISSION_GRANTED;
    }

}
