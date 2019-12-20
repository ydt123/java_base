package com.IO;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.xml.ws.spi.http.HttpContext;

import com.swetake.util.Qrcode;

public class Ewm {

	public static void main(String[] args) throws Exception {
		Qrcode ewm=new Qrcode();
		ewm.setQrcodeVersion(7);//设置版本为7
		int width=300;
		int height=300;
		BufferedImage hctu=new BufferedImage(width,height,BufferedImage.TYPE_INT_BGR);
		Graphics2D ewhb=hctu.createGraphics();
		//设置画笔背景颜色为白色
		ewhb.setBackground(Color.white);
		ewhb.setColor(Color.black);
		ewhb.clearRect(0, 0, width, height);
		String zf="老妈，我爱你";
		byte[] zjsz=zf.getBytes();
		int pianyi=2;
		if (zjsz.length>0 && zjsz.length<100) {
			boolean[][] ewsz=ewm.calQrcode(zjsz);
			for (int i = 0; i < ewsz.length; i++) {
				for (int j = 0; j < ewsz.length; j++) {
					if(ewsz[j][i]) {
						ewhb.fillRect(j*3+pianyi, i*3+pianyi, 3, 3);
					}
				}
				
			}
		}
		ewhb.dispose();
		hctu.flush();
		//生成图像
		ImageIO.write(hctu, "jpg", new File("ewm.jpg"));
		

	}

}
