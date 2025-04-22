public class Int {
  protected int value;
  public static final int INT_MAX = 1024;

  public Int() {
    this(0);
  }

  public Int(int value) {
    setValue(value);
  }

  public Int add(Int a) {
    return new Int(this.value + a.getValue());
  }

  public Int mul(Int a) {
    return new Int(this.value * a.getValue());
  }

  public void setValue(int value) {
    if (value > INT_MAX) {
      return;
    }
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  @Override
  public String toString() {
    return String.valueOf(this.value);
  }
}
