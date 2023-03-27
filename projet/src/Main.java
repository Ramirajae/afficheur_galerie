import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main extends JPanel {
private ImageIcon image,image1,image2,image3,image4,image5,image6,image7,image8,image9,image10,image11,image12,image13,image14,image15;
private ImageIcon image16,image17,image18,image19,image20,image21;
private JLabel pic,pic1,pic2,pic3,pic4,pic5,pic6,pic7,pic8,pic9,pic10,pic11,pic12,pic13,pic14,pic15;
private JLabel pic16,pic17,pic18,pic19,pic20,pic21;

Main(){
      setLayout(new GridLayout(1,1));
        JTabbedPane album=new JTabbedPane();
        JPanel tabPanel=new JPanel();
        tabPanel.setLayout(new BorderLayout());
        JPanel panel2=new JPanel();
     panel2.setLayout(new BorderLayout());
       JPanel panel3=new JPanel();
    panel3.setLayout(new BorderLayout());
        JPanel panel4=new JPanel();
     panel4.setLayout(new BorderLayout());
        JPanel panel5=new JPanel();
     panel5.setLayout(new BorderLayout());
        JPanel panel8=new JPanel();
        panel8.setLayout(new GridLayout(3,4));
       image =new ImageIcon(this.getClass().getResource("/im6.jpeg"));
        image1 =new ImageIcon(this.getClass().getResource("/im1.jpg"));
        image2 =new ImageIcon(this.getClass().getResource("/im2.jpg"));
        image3 =new ImageIcon(this.getClass().getResource("/download.jpg"));
        image4 =new ImageIcon(this.getClass().getResource("/im4.jpeg"));
        image5 =new ImageIcon(this.getClass().getResource("/im5.jpeg"));
        image6 =new ImageIcon(this.getClass().getResource("/im8.jpg"));
        image7 =new ImageIcon(this.getClass().getResource("/im7.jpg"));
        image8 =new ImageIcon(this.getClass().getResource("/im9.jpeg"));
        image9 =new ImageIcon(this.getClass().getResource("/im10.jpeg"));
        image10 =new ImageIcon(this.getClass().getResource("/images.jpeg"));
       pic=new JLabel(image);
       pic1=new JLabel(image1);
        pic2=new JLabel(image2);
        pic3=new JLabel(image3);
        pic4=new JLabel(image4);
        pic5=new JLabel(image5);
        pic6=new JLabel(image6);
        pic7=new JLabel(image7);
        pic8=new JLabel(image8);
        pic9=new JLabel(image9);
        pic10=new JLabel(image10);
        panel8.add(pic);
        panel8.add(pic1);
        panel8.add(pic2);
        panel8.add(pic3);
        panel8.add(pic4);
        panel8.add(pic5);
        panel8.add(pic6);
        panel8.add(pic7);
        panel8.add(pic8);
        panel8.add(pic9);
        panel8.add(pic10);
        tabPanel.add(panel8,BorderLayout.CENTER);
        album.addTab("All Photos", tabPanel);
     JPanel panelCam2=new JPanel();
     panelCam2.setLayout(new GridLayout(2,3));
     image11 =new ImageIcon(this.getClass().getResource("/im1.jpg"));
     image12 =new ImageIcon(this.getClass().getResource("/im2.jpg"));
     image13 =new ImageIcon(this.getClass().getResource("/im7.jpg"));
     image14 =new ImageIcon(this.getClass().getResource("/im8.jpg"));
     image15 =new ImageIcon(this.getClass().getResource("/download.jpg"));
     pic11=new JLabel(image11);
     pic12=new JLabel(image12);
     pic13=new JLabel(image13);
     pic14=new JLabel(image14);
     pic15=new JLabel(image15);
     panelCam2.add(pic11);
     panelCam2.add(pic12);
     panelCam2.add(pic13);
     panelCam2.add(pic14);
     panelCam2.add(pic15);
     panel2.add(panelCam2,BorderLayout.CENTER);
     album.addTab("Camera", panel2);
     JPanel panelScreen2=new JPanel();
     panelScreen2.setLayout(new GridLayout(1,2));
     image19 =new ImageIcon(this.getClass().getResource("/im4.jpeg"));
     image20 =new ImageIcon(this.getClass().getResource("/im5.jpeg"));
     pic19=new JLabel(image19);
     pic20=new JLabel(image20);
     panelScreen2.add(pic19);
     panelScreen2.add(pic20);
     JPanel panelScreen3=new JPanel();
     panelScreen3.add(panelScreen2,BorderLayout.NORTH);
     panel3.add(panelScreen3,BorderLayout.WEST);
     album.addTab("ScreenShot", panel3);
     JPanel panelWhat2=new JPanel();
     panelWhat2.setLayout(new GridLayout(1,3));
     image16 =new ImageIcon(this.getClass().getResource("/im9.jpeg"));
     image17 =new ImageIcon(this.getClass().getResource("/im10.jpeg"));
     image18 =new ImageIcon(this.getClass().getResource("/images.jpeg"));
     pic16=new JLabel(image16);
     pic17=new JLabel(image17);
     pic18=new JLabel(image18);
     panelWhat2.add(pic16);
     panelWhat2.add(pic17);
     panelWhat2.add(pic18);
     panel4.add(panelWhat2,BorderLayout.NORTH);
     album.addTab("WhatsApp", panel4);
     JPanel panelFav2=new JPanel();
     panelFav2.setLayout(new GridLayout(1,1));
     image21 =new ImageIcon(this.getClass().getResource("/im10.jpeg"));
     pic21=new JLabel(image21);
     panelFav2.add(pic21);
     JPanel panelFav3=new JPanel();
     panelFav3.add(panelFav2,BorderLayout.NORTH);
     panel5.add(panelFav3,BorderLayout.WEST);
     album.addTab("Favorites", panel5);
     add(album);



    }
    public static void main(String[] args) {

        JFrame cadre=new JFrame("My Gallery");
        cadre.setVisible(true);
        cadre.setSize(700,500);
        cadre.setContentPane(new Main());
        cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);










    }

}