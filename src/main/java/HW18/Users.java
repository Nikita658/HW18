package HW18;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Users implements Serializable {
    private String id;
    private String firstName;
    private String lastName;
    private transient String fullName;
    private String email;

    public Users() {

    }

    public void add(Users users) {
    }
}
