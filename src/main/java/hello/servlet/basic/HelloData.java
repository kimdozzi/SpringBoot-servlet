package hello.servlet.basic;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class HelloData {
    private String username;
    private int age;

    public HelloData(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
