package collection.set.test;

public class Rectangle {

  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public int hashCode() {
    return width * height;
  }

  @Override
  public boolean equals(Object obj) {
    return hashCode() == obj.hashCode();
  }

  @Override
  public String toString() {
    return "Rectangle [width=" + width + ", height=" + height + "]";
  }
}
