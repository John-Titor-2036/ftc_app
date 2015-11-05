package com.qualcomm.ftcrobotcontroller.lib;

import java.io.IOException;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;

public class AudioPlayer {

    String name;
    Context context;
    MediaPlayer mp;

    public AudioPlayer(String name, Context context) {
        this.name = name;
        this.context = context;
        playAudio();
    }

    public void playAudio() {
        mp = new MediaPlayer();
        try {
            AssetFileDescriptor descriptor = context.getAssets()
                    .openFd(name);
            mp.setDataSource(descriptor.getFileDescriptor(),
                    descriptor.getStartOffset(), descriptor.getLength());
            descriptor.close();
            mp.prepare();
            mp.setLooping(true);
            mp.start();
            mp.setVolume(3, 3);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        mp.stop();
    }

    public void pause() {
        mp.pause();
    }

    public void resume() {
        mp.start();
    }

}