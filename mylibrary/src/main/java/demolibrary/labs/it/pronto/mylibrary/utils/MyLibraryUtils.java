package demolibrary.labs.it.pronto.mylibrary.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.PermissionChecker;
import android.text.TextUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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

    public static Boolean checkValueIsNotEmpty(String value) {
        if(value == null)
            return false;

        value = value.trim();
        if(value.length() > 0)
            return true;

        return false;
    }

    /**
     * Returns true if an Internet connection is detected.
     * @param context the app context to check connectivity from
     * @return whether Internet connection exists
     */
    public static synchronized boolean isOnline(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /**
     * @param s String to MD5 hash
     * @return MD5 hashed string
     */
    public static String md5(String s) {
        if (TextUtils.isEmpty(s)) {
            return "";
        }
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(s.getBytes());
            byte[] messageDigest = digest.digest();
            return bytesToHex(messageDigest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * @param s String to SHA-1 hash
     * @return SHA-1 hashed string
     */
    public static String sha1(String s) {
        if (TextUtils.isEmpty(s)) {
            return "";
        }
        try {
            // Create SHA-1 Hash
            MessageDigest digest = java.security.MessageDigest.getInstance("SHA-1");
            digest.update(s.getBytes());
            byte[] messageDigest = digest.digest();
            return bytesToHex(messageDigest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * @param s String to SHA-256 hash
     * @return SHA-256 hashed string
     */
    public static String sha256(String s) {
        if (TextUtils.isEmpty(s)) {
            return "";
        }
        try {
            // Create SHA-256 Hash
            MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
            digest.update(s.getBytes());
            byte[] messageDigest = digest.digest();
            return bytesToHex(messageDigest);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * @param data Byte array to convert to hex
     * @return Hex string
     */
    public static String bytesToHex(byte[] data) {
        if (data == null) {
            return null;
        }

        int len = data.length;
        String str = "";
        for (int i = 0; i < len; i++) {
            if ((data[i] & 0xFF) < 16) {
                str = str + "0" + java.lang.Integer.toHexString(data[i] & 0xFF);
            } else {
                str = str + java.lang.Integer.toHexString(data[i] & 0xFF);
            }
        }
        return str;
    }

}
