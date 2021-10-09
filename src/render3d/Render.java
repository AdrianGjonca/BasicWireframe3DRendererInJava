package render3d;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Render {
	static Graphics g;
	static int frameCount = 0;
	static long start;
	public static void frame(BufferedImage screen) {
		if(frameCount == 0) {
			g = screen.createGraphics();
			start = System.currentTimeMillis();
		}
		////////////
		g.clearRect(0, 0, 700, 700);
		for(float[][] line : Data.lines) {
			Coordinate.draw3DLine(
					rotatedX(line[0][0],line[0][1],((float)(System.currentTimeMillis() % 5000)/5000f) * 360f) + 18f*(float)Math.sin(getTime()*1.5),
					rotatedY(line[0][0],line[0][1],((float)(System.currentTimeMillis() % 5000)/5000f) * 360f),
					line[0][2]+3 + (float)Math.sin(((float)(System.currentTimeMillis() % 3000)/3000f) * 3.1415926535f) * 4f,
					rotatedX(line[1][0],line[1][1],((float)(System.currentTimeMillis() % 5000)/5000f) * 360f) + 18f*(float)Math.sin(getTime()*1.5),
					rotatedY(line[1][0],line[1][1],((float)(System.currentTimeMillis() % 5000)/5000f) * 360f),
					line[1][2]+3 + (float)Math.sin(((float)(System.currentTimeMillis() % 3000)/3000f) * 3.1415926535f) * 4f,
					g);
		}
		for(float[][] line : Data.lines) {
			Coordinate.draw3DLine(
					rotatedX(line[0][0]-14,line[0][1],((float)(System.currentTimeMillis() % 5000)/5000f) * 360f) + 18f*(float)Math.sin(getTime()*2.0),
					rotatedY(line[0][0]-14,line[0][1],((float)(System.currentTimeMillis() % 5000)/5000f) * 360f),
					line[0][2] + (float)Math.sin(((float)(System.currentTimeMillis() % 3900)/3900f) * 3.1415926535f) * 8f,
					rotatedX(line[1][0]-14,line[1][1],((float)(System.currentTimeMillis() % 5000)/5000f) * 360f) + 18f*(float)Math.sin(getTime()*2.0),
					rotatedY(line[1][0]-14,line[1][1],((float)(System.currentTimeMillis() % 5000)/5000f) * 360f),
					line[1][2] + (float)Math.sin(((float)(System.currentTimeMillis() % 3900)/3900f) * 3.1415926535f) * 8f,
					g);
		}
		for(float[][] line : Data.lines) {
			Coordinate.draw3DLine(
					rotatedX(line[0][0]+14,line[0][1],((float)(System.currentTimeMillis() % 5000)/5000f) * 360f) + 18f*(float)Math.sin(getTime()*3.5),
					rotatedY(line[0][0]+14,line[0][1],((float)(System.currentTimeMillis() % 5000)/5000f) * 360f),
					line[0][2]+6 + (float)Math.sin(((float)(System.currentTimeMillis() % 4000)/4000f) * 3.1415926535f) * 8f,
					rotatedX(line[1][0]+14,line[1][1],((float)(System.currentTimeMillis() % 5000)/5000f) * 360f) + 18f*(float)Math.sin(getTime()*3.5),
					rotatedY(line[1][0]+14,line[1][1],((float)(System.currentTimeMillis() % 5000)/5000f) * 360f),
					line[1][2]+6 + (float)Math.sin(((float)(System.currentTimeMillis() % 4000)/4000f) * 3.1415926535f) * 8f,
					g);
		}
		///
		for(float[][] line : Data.lines) {
			Coordinate.draw3DLine(
					rotatedX(line[0][0],line[0][1],((float)(-System.currentTimeMillis() % 5000)/5000f) * 360f) + 18f*(float)Math.sin(getTime()*3.0),
					rotatedY(line[0][0],line[0][1],((float)(-System.currentTimeMillis() % 5000)/5000f) * 360f),
					line[0][2] + 12 + (float)Math.sin(((float)(System.currentTimeMillis() % 3000)/3000f) * 3.1415926535f) * 8f,
					rotatedX(line[1][0],line[1][1],((float)(-System.currentTimeMillis() % 5000)/5000f) * 360f) + 18f*(float)Math.sin(getTime()*3.0),
					rotatedY(line[1][0],line[1][1],((float)(-System.currentTimeMillis() % 5000)/5000f) * 360f),
					line[1][2] + 12 + (float)Math.sin(((float)(System.currentTimeMillis() % 3000)/3000f) * 3.1415926535f) * 8f,
					g);
		}
		for(float[][] line : Data.lines) {
			Coordinate.draw3DLine(
					rotatedX(line[0][0]-14,line[0][1],((float)(-System.currentTimeMillis() % 5000)/5000f) * 360f) + 18f*(float)Math.sin(getTime()*4.0),
					rotatedY(line[0][0]-14,line[0][1],((float)(-System.currentTimeMillis() % 5000)/5000f) * 360f),
					line[0][2] + 9 + (float)Math.sin(((float)(System.currentTimeMillis() % 3200)/3200f) * 3.1415926535f) * 8f,
					rotatedX(line[1][0]-14,line[1][1],((float)(-System.currentTimeMillis() % 5000)/5000f) * 360f) + 18f*(float)Math.sin(getTime()*4.0),
					rotatedY(line[1][0]-14,line[1][1],((float)(-System.currentTimeMillis() % 5000)/5000f) * 360f),
					line[1][2] + 9 + (float)Math.sin(((float)(System.currentTimeMillis() % 3200)/3200f) * 3.1415926535f) * 8f,
					g);
		}
		for(float[][] line : Data.lines) {
			Coordinate.draw3DLine(
					rotatedX(line[0][0]+14,line[0][1],((float)(-System.currentTimeMillis() % 5000)/5000f) * 360f) + 18f*(float)Math.sin(getTime()*1.7),
					rotatedY(line[0][0]+14,line[0][1],((float)(-System.currentTimeMillis() % 5000)/5000f) * 360f),
					line[0][2] + 15 + (float)Math.sin(((float)(System.currentTimeMillis() % 3600)/3600f) * 3.1415926535f) * 8f,
					rotatedX(line[1][0]+14,line[1][1],((float)(-System.currentTimeMillis() % 5000)/5000f) * 360f) + 18f*(float)Math.sin(getTime()*1.7),
					rotatedY(line[1][0]+14,line[1][1],((float)(-System.currentTimeMillis() % 5000)/5000f) * 360f),
					line[1][2] + 15 + (float)Math.sin(((float)(System.currentTimeMillis() % 3600)/3600f) * 3.1415926535f) * 8f,
					g);
		}
		////////////
		frameCount++;
	}
	public static float rotatedX(float x, float y, float deg) {
		return x*(float)Math.cos(Coordinate.convertDegToRad(deg)) + y*(float)Math.sin(Coordinate.convertDegToRad(deg));
	}
	public static float rotatedY(float x, float y, float deg) {
		return -x*(float)Math.sin(Coordinate.convertDegToRad(deg)) + y*(float)Math.cos(Coordinate.convertDegToRad(deg));
	}
	public static float getTime() {
		return (float)(System.currentTimeMillis()-start)/1000f;
	}
}
