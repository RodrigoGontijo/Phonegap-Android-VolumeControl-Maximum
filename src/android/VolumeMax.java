/*
 * Phonegap VolumeMax Plugin for Android
 * Cordova 2.2.0
 * Email: rodrigo[dot]gontijo[at]hotmail[dot]com
 * Author: Rodrigo Augusto Gontijo
 * Date: 05/23/2016
 */

package com.rodrigo.plugins.volumeMax;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.LOG;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.media.*;

public class VolumeMax extends CordovaPlugin {

    public static final String SET = "setVolumeMax";
    private static final String TAG = "VolumeMax";

    private Context context;
    private AudioManager am;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        boolean actionState = true;
        context = cordova.getActivity().getApplicationContext();
        am = (AudioManager)context.getSystemService(Context.AUDIO_SERVICE);
        if (SET.equals(action)) {
            try {
                //Set all volumes to max

                am.setStreamVolume(
                        AudioManager.STREAM_MUSIC,
                        am.getStreamMaxVolume(AudioManager.STREAM_MUSIC),
                        0);

                am.setStreamVolume(
                        AudioManager.STREAM_RING,
                        am.getStreamMaxVolume(AudioManager.STREAM_RING),
                        0);

                am.setStreamVolume(
                        AudioManager.STREAM_SYSTEM,
                        am.getStreamMaxVolume(AudioManager.STREAM_SYSTEM),
                        0);

                am.setStreamVolume(
                        AudioManager.STREAM_ALARM,
                        am.getStreamMaxVolume(AudioManager.STREAM_ALARM),
                        0);

                am.setStreamVolume(
                        AudioManager.STREAM_DTMF,
                        am.getStreamMaxVolume(AudioManager.STREAM_DTMF),
                        0);

                callbackContext.success();

            } catch (Exception e) {
                LOG.d(TAG, "Error setting volume " + e);
                actionState = false;
            }
        } else {
            actionState = false;
        }
        return actionState;
    }

}