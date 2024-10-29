package main;

class Person {
    public static int count = 0;
    public String firstName;
    public String lastName; // 問題1: lastNameフィールドを追加
    public int age;
    public double height, weight;

    // 問題2: lastNameを引数で受け取るコンストラクタ
    Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName; // 問題3: lastNameの値をセット
        this.age = age;
        this.height = height;
        this.weight = weight;
        Person.count++; // countをインクリメント
    }

    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    public void print() {
        System.out.println("名前は" + this.fullName() + "です");
        System.out.println("年は" + this.age + "です");
    }

    public double bmi() {
        return this.weight / this.height / this.height;
    }

    public static void printCount() {
        System.out.println("合計" + Person.count + "人です");
    }
}
