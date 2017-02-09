# YStarView


使用方法
xml的：
    <com.eiun.hesy.mystar.YStarView
        android:id="@+id/star"
        android:layout_width="60dp"
        android:layout_height="180dp" />
只要宽高，自己调就好

Activity里面找到控件后：
        star.setStarCount(5);//星星总数
        star.setRating(3);//设置星星亮的颗数
        star.setChange(true);//设置星星是否可以点击和滑动改变
        star.setStar(R.drawable.ic_ystar_t,R.drawable.ic_ystar_d);// 设置星星的样式

        star.getRating()//获取亮星星的颗数
不设置就会使用默认的
不能再简单了·····