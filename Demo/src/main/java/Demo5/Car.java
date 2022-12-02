package Demo5;

public class Car {
    private String type;
    private String num;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void start(){
        System.out.println("车牌为:" + num +"的车启动了");
    }
    public void stop(){
        System.out.println("车牌为:" + num +"的车停止了");
    }
}
