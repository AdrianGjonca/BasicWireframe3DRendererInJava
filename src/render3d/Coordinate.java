package render3d;

import java.awt.Graphics;

public class Coordinate {
	final static float SCREEN_SIZE = 4f; //I realised after that this mathamatically cancells out but anyway.....
	final static float SCALE_TO_PIXELS = (700f / SCREEN_SIZE) * 0.5f;
	final static float FOV = 30f;
	
	public static float getScreenPos(float realPos, float realFar, float screenSize, float fov) {
		return (screenSize * realPos) / (2 * realFar * (float)Math.tan(convertDegToRad(fov)));
	}
	
	public static float convertDegToRad(float deg) {
		return (deg / 180f) * (float)Math.PI;
	}
	
	public static void draw3DLine(float x1, float y1, float z1, float x2, float y2, float z2, Graphics g) {
		int sX1 = (int)(getScreenPos(x1, z1, SCREEN_SIZE, FOV) * SCALE_TO_PIXELS + 350f);
		int sY1 = (int)(-getScreenPos(y1, z1, SCREEN_SIZE, FOV) * SCALE_TO_PIXELS + 350f );
		int sX2 = (int)(getScreenPos(x2, z2, SCREEN_SIZE, FOV) * SCALE_TO_PIXELS + 350f);
		int sY2 = (int)(-getScreenPos(y2, z2, SCREEN_SIZE, FOV) * SCALE_TO_PIXELS + 350f);
		g.drawLine(sX1, sY1, sX2, sY2);
	}
}
