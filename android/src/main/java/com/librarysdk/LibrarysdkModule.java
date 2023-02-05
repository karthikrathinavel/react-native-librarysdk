package com.librarysdk;

import android.content.Context;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

import io.mob.resu.reandroidsdk.MRegisterUser;
import io.mob.resu.reandroidsdk.ReAndroidSDK;

import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = LibrarysdkModule.NAME)
public class LibrarysdkModule extends ReactContextBaseJavaModule {
  public static final String NAME = "Librarysdk";
  private final ReactApplicationContext reactContext;
  public Context context = null;
  public LibrarysdkModule(ReactApplicationContext reactContext)
  {
    //super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void multiply(double a, double b) {
    System.out.println("SUPER! Results:  " + (a*b));
  }

  @ReactMethod
  public void onDeviceUserRegister(String json) throws JSONException {
    JSONObject json1 = new JSONObject(json);
    System.out.println(json1);
    MRegisterUser obj = new MRegisterUser();
    obj.setAdId(json1.getString("adid"));
    obj.setAdId(json1.getString("uid"));
    obj.setUserUniqueId(json1.getString("useruid"));
    obj.setName(json1.getString("name"));
    obj.setAge(json1.getString("age"));
    obj.setEmail(json1.getString("email"));
    obj.setPhone(json1.getString("phone"));
    obj.setGender(json1.getString("gender"));
    obj.setProfileUrl(json1.getString("profileURL"));
    obj.setDob(json1.getString("dob"));
    obj.setEducation(json1.getString("education"));
    obj.setEmployed(json1.getBoolean("employed"));
    obj.setMarried(json1.getBoolean("married"));
    obj.setDeviceToken(json1.getString("token"));
    ReAndroidSDK.getInstance(context).onDeviceUserRegister(obj);
  }
  @ReactMethod
  public void updatePushToken(){
    ReAndroidSDK.getInstance(context).updatePushToken("em3EVov-Rzy3wkLqnmGipd:APA91bGQZzMMqY1u2HOdLBe3owHUSDkG52n55T6J6Tj-DwJeUpCX4Hks25NzL18tQ2kyMxZOtXLCBy7U5aaOMQsaf8cCnNgw9b9L4mBzXzXNtOB75rp6Mz8tK6Ag66GRlZoFtKRwNznk");
  }
}
