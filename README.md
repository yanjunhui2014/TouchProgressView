# TouchProgressView
Android自定义可拖动进度条

效果如图：
![image](https://github.com/yanjunhui2014/TouchProgressView/blob/master/gif/gif_0.gif)

编程思想：

1、自定义一个类，继承自View，并重写它的 onTouchEvent 事件；

2、重写 onDraw， 绘制一条直线和一个圆点；

3、根据当前的进度，及时更新圆点的位置。
