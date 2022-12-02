package com.yanhuo4;

public class Mouse implements USB{
    private String name;

    public Mouse(String name){
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
    public void dbClick(){
        System.out.println(name + "双击了此电脑");
    }
}
