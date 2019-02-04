package OCA.ch05.review;

interface HasVocalCords {

    public abstract void makeSound();
}
public interface CanBark extends HasVocalCords {

    public void bark();
}