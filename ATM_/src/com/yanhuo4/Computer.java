package com.yanhuo4;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(name + "电脑开机了~");
    }
    public void installUSB(USB usb){
        usb.connect();
        if (usb instanceof KeyBoard) {
            KeyBoard ke = (KeyBoard) usb;
            ke.KeyDown();
        } else if (usb instanceof  Mouse) {
            Mouse mo = (Mouse) usb;
            mo.dbClick();
        }
        usb.unConnect();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
