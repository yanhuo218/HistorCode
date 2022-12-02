package com.yanhuo4;

public class KeyBoard implements USB{
    private String name;

    public KeyBoard(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "成功连接电脑~");
    }

    @Override
    public void unConnect() {
        System.out.println(name + "安全从电脑中移除");
    }
    public void KeyDown(){
        System.out.println(name + "这个键盘被敲击了");
    }
}
