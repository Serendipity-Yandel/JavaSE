package FaceRecognition;


import org.opencv.core.Point;
import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.videoio.VideoCapture;
import org.opencv.videoio.Videoio;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CaptureBasic extends JPanel {
    private BufferedImage mImg;

    /**
     * 转换图像
     *
     * @param mat
     * @return
     */
    private BufferedImage mat2BI(Mat mat) {
        int dataSize = mat.cols() * mat.rows() * (int) mat.elemSize();
        byte[] data = new byte[dataSize];
        mat.get(0, 0, data);
        int type = mat.channels() == 1 ?
                BufferedImage.TYPE_BYTE_GRAY : BufferedImage.TYPE_3BYTE_BGR;

        if (type == BufferedImage.TYPE_3BYTE_BGR) {
            for (int i = 0; i < dataSize; i += 3) {
                byte blue = data[i + 0];
                data[i + 0] = data[i + 2];
                data[i + 2] = blue;
            }
        }
        BufferedImage image = new BufferedImage(mat.cols(), mat.rows(), type);
        image.getRaster().setDataElements(0, 0, mat.cols(), mat.rows(), data);

        return image;
    }

    public void paintComponent(Graphics g) {
        if (mImg != null) {
            g.drawImage(mImg, 0, 0, mImg.getWidth(), mImg.getHeight(), this);
        }
    }

    /**
     * 显示视频
     */
    public static void showVido(VideoCapture capture) {
        try {
            // 创建矩阵
            Mat capImg = new Mat();
            // 设置摄像头高度
            int height = (int) capture.get(Videoio.CAP_PROP_FRAME_HEIGHT);
            // 设置摄像头宽度
            int width = (int) capture.get(Videoio.CAP_PROP_FRAME_WIDTH);
            if (height == 0 || width == 0) {
                throw new Exception("camera not found!");
            }
            //使用Swing生成GUI
            JFrame frame = new JFrame("人脸识别");
            frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            CaptureBasic panel = new CaptureBasic();
            //设置中心显示
            frame.setContentPane(panel);
            frame.setVisible(true);
            frame.setSize(width + frame.getInsets().left + frame.getInsets().right,
                    height + frame.getInsets().top + frame.getInsets().bottom);
            frame.setLocationRelativeTo(null);
            int n = 0;
            // 创建一个临时矩阵
            Mat temp = new Mat();
            while (frame.isShowing() && n < 10) {//照片循环次数
                //从摄像头读取一帧数据，保存到capImg矩阵中。
                capture.read(capImg);
                //转换为彩色图
                Imgproc.cvtColor(capImg, temp, Imgproc.COLOR_RGBA2BGRA);
                //人脸识别
                capImg= detectFace(capImg);

                //转为图像显示
                panel.mImg = panel.mat2BI(capImg);
                panel.repaint();
            }
            capture.release();
            frame.dispose();
        } catch (Exception e) {
            System.out.println("例外：" + e);
        } finally {
            System.out.println("--done--");
        }
    }

    /**
     * opencv实现人脸识别
     *
     * @param img
     */
    public static Mat detectFace(Mat img) throws Exception {

        System.out.println("Running DetectFace ... ");
        // 从配置文件lbpcascade_frontalface.xml中创建一个人脸识别器，该文件位于opencv安装目录中
        CascadeClassifier faceDetector = new CascadeClassifier("D:\\Opencv\\opencv\\" +
                "sources\\data\\haarcascades\\haarcascade_frontalface_alt.xml");
        // 在图片中检测人脸
        MatOfRect faceDetections = new MatOfRect();
        faceDetector.detectMultiScale(img, faceDetections);
        Rect[] rects = faceDetections.toArray();
        if (rects != null && rects.length >= 1) {
            for (Rect rect : rects) {
                //画矩形
                Imgproc.rectangle(img, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height),
                        new Scalar(0, 0, 255), 2);
            }
        }
        return img;
    }
}
