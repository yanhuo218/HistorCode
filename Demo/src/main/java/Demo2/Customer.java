package Demo2;

public class Customer {
    private String JaneSmith;
    private int x;

    public Customer() {
    }

    public Customer(String janeSmith, int x) {
        JaneSmith = janeSmith;
        this.x = x;
    }

    public String getJaneSmith() {
        return JaneSmith;
    }

    public void setJaneSmith(String janeSmith) {
        JaneSmith = janeSmith;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "JaneSmith='" + JaneSmith + '\'' +
                ", x=" + x +
                '}';
    }
}
