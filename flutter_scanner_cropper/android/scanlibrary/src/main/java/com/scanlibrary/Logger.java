package com.scanlibrary;
import java.util.Arrays;

public class Logger {
  private static Logger instance;

  public String detectedEdges;
  public String refinedEdges;

  public static getInstance() {
    if (instance == null) {
      instance = new Logger();
    } 
    return instance;
  }

  public String formatPoints(ImageView p1, ImageView p2, ImageView p3, ImageView p4) {
    int[] p1A = [p1.getX(), p1.getY()];
    int[] p2A = [p2.getX(), p2.getY()];
    int[] p3A = [p3.getX(), p3.getY()];
    int[] p4A = [p4.getX(), p4.getY()];
    int[][] allPoints = new int[4][2];
    allPoints[0] = 1A;
    allPoints[1] = 2A;
    allPoints[2] = 3A;
    allPoints[3] = 4A;
    return Arrays.deepToString(allPoints);
  }

}
