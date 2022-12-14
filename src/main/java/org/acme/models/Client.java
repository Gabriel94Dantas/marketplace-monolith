package org.acme.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Client {

    private String id;
    private String name;
    private String lastname;
    private String email;
    private String password;

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Client)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Client c = (Client) o;

        // Compare the data members and return accordingly
        return id.equals(c.getId());
    }
}
