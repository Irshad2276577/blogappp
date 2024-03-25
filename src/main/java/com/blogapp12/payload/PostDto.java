package com.blogapp12.payload;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min=3, message = "Title should be  atlist 3 character")
    private  String title;
    @NotEmpty
    @Size(min=3, message = "Description should be  atlist 3 character")
    private String description;
    private String content;

    @Size(min=10, max=10 , message = "Mobile should be  atlist 10 digit ")
    private  String mobile;

    public static class LoginDto {
        private String username;
        private String password;
    }
}
