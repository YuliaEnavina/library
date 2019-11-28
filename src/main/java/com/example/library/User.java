package com.example.library;

import java.util.Date;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {
    private final long id;
    private final Role role;
    private final String firstName;
    private final String lastName;
    private final String photo;
    private final Date dateOfBirth;
    private final Date creationDate;
    private final Date lastActivityDate;
    private boolean deleted;

    public static enum Role {
        READER, LIBRARIAN
    }
}
