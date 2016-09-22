package test.bawie.com.startapp;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import test.bawie.com.startapp.R;

public class UpBar extends FrameLayout {

    private IUpBarOnClickListener Img1listener;
    private IUpBarOnClickListener Img2listener;
    private IUpBarOnClickListener Titlelistener;
    private ImageView mImg1;
    private ImageView mImg2;
    private TextView mTitle;

    public UpBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.upbar, this);

        initview();
        OnClick();
    }

    private void OnClick() {
        mImg1.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (Img1listener != null) {
                    Img1listener.OnClick(arg0);
                }
            }
        });
        mImg2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (Img2listener != null) {
                    Img2listener.OnClick(arg0);
                }
            }
        });
        mTitle.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (Titlelistener != null) {
                    Titlelistener.OnClick(arg0);
                }
            }
        });

    }

    private void initview() {
        mImg1 = (ImageView) findViewById(R.id.upbar_Img1);
        mImg2 = (ImageView) findViewById(R.id.upbar_Img2);
        mTitle = (TextView) findViewById(R.id.upbar_name);

    }
    /***
     * 设置子控件是否显示
     * @param isShow
     * @param v
     */
    public void setChildVisibility(boolean isShow, View v){
        if (isShow) {
            v.setVisibility(VISIBLE);
        }else{
            v.setVisibility(INVISIBLE);
        }
    }

    //设置监听事件
    public void setImg1Listener(IUpBarOnClickListener listener){
        Img1listener = listener;
    }
    public void setImg2Listener(IUpBarOnClickListener listener){
        Img2listener = listener;
    }
    public void setTitleListener(IUpBarOnClickListener listener){
        Titlelistener = listener;
    }

    public ImageView getmImg1() {
        return mImg1;
    }

    public void setImg1ByRes(int resId) {
        this.mImg1.setImageResource(resId);
    }

    public ImageView getmImg2() {
        return mImg2;
    }

    public void setImg2ByRes(int resId) {
        this.mImg2.setImageResource(resId);
    }

    public TextView getmTitle() {
        return mTitle;
    }

    public void setTitleText(String text) {
        this.mTitle.setText(text);
    }

    private class IUpBarOnClickListener {
    }
}