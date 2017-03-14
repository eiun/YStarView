package com.eiun.hesy.mystar;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * 类名称：MainActivity<br>
 * 内容摘要： //主页。<br>
 * 属性描述：<br>
 * 方法描述：<br>
 * 修改备注：   <br>
 * 创建时间： 2017/2/8 10:10<br>
 *
 * @author eiun<br>
 */
public class MainActivity extends AppCompatActivity {

    private YStarView star;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        star.setStarCount(5);
        star.setRating(3);
        star.setChange(true);
        star.setHalf(true);
        star.setStar(R.drawable.ic_full,R.drawable.ic_empty);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(textView, star.getRating()+"颗星", Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        star = (YStarView) findViewById(R.id.star);
        textView = (TextView) findViewById(R.id.textView);
    }
}
