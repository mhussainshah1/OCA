package OCA.ch04.review.my.city;

import OCA.ch04.review.my.school.Classroom;

public class School {

    public static void main(String[] args) {
        System.out.println(Classroom.globalKey);
        Classroom room = new Classroom(101, "Mrs.Anderson");
        System.out.println(room.roomNumber);
        System.out.println(room.floor);
        System.out.println(room.teacherName);
    }
}
