package test.bawie.com.startapp;

import android.content.pm.ActivityInfo;
import android.graphics.PixelFormat;
import android.media.AudioManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;



/**
 * ybb
 */
public class BaseFragmentActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setFormat(PixelFormat.TRANSLUCENT);
		requestWindowFeature(Window.FEATURE_NO_TITLE);// 取消标题栏
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); // 禁止横屏
		setVolumeControlStream(AudioManager.STREAM_MUSIC);// 使得音量键控制媒体声音


	}
	
	/**
	 * 打开进度条
	 * 
	 * @param descr
	 */
	public void progresssDialogShow(String descr) {
		Alert.customDialog(this, descr);
	}
	
	/**
	 * 关闭进度条
	 */
	public void progresssDialogHide() {
		if (Alert.dialog != null) {
			Alert.dialog.dismiss();
		}
	}
	
	
	
}
