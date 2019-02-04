package OCA.ch05.inheritance;

class Animal1 extends Object{

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Lion extends Animal1 {

    private void roar() {
        System.out.println("The " + getAge() + " year old lion says: Roar!");
        System.out.println("The "+age+" year old lion says: Roar!");// DOES NOT COMPILE
    }
}