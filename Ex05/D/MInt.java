public class MInt extends Int {
  public static final int MOD = 107;

  public MInt() {
    super();
  }

  public MInt(int x) {
    super(x);
  }

  @Override
  public Int add(Int a) {
    return new MInt((this.value + a.getValue()) % MOD);
  }

  @Override
  public Int mul(Int a) {
    return new MInt((this.value * a.getValue()) % MOD);
  }

  @Override
  public void setValue(int value) {
    this.value = value;
  }
}
