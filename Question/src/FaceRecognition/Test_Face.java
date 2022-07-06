package FaceRecognition;

import org.opencv.videoio.VideoCapture;

public class Test_Face {
    public static void main(String[] args) {
        //1.加载OpenCV类库
        System.loadLibrary("opencv_java454");
        //2.打开摄像头获取视频流
        VideoCapture vc=new VideoCapture(0);//索引值，0打开默认摄像头
        //3.检查是否支持摄像头 TRUE表示支持，FALSE表示不支持
        System.out.println(vc.isOpened());
        //4.调用视频显示
        CaptureBasic.showVido(vc);
    }
}
