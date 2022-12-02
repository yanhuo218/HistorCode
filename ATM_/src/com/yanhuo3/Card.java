package com.yanhuo3;

public abstract  class Card {
        private String usersName;
        private double money;

        public abstract void pay(double money );

        public String getUsersName() {
                return usersName;
        }

        public void setUsersName(String usersName) {
                this.usersName = usersName;
        }

        public double getMoney() {
                return money;
        }

        public void setMoney(double money) {
                this.money = money;
        }

}
