package map;

import java.time.LocalDate;
import java.util.Objects;

public class User implements Comparable{
    private final String name;
    private final String email;
    private final LocalDate birthDate;

    public User(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    //identyczne obiekty muszą mieć identyczny hashCode()
    //ale dwa różne obiekty mogą mieć identyczny hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return name.equals(user.name) &&
                email.equals(user.email) &&
                birthDate.equals(user.birthDate);
    }
    //w metodzie generujemy hash na podstawie tych samych pól co w metodzie equals
    @Override
    public int hashCode() {
        return Objects.hash(name, email, birthDate);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (!(o instanceof User)) return compareTo(o);
        User u = (User) o;
        if (o == null){
            return -1;
        }
        return birthDate.compareTo(u.birthDate);
    }
}
