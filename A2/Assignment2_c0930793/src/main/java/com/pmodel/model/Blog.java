package com.pmodel.model;

import lombok.Getter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;

@Getter
@ToString
@EqualsAndHashCode
public class Blog {
    private final List<BlogPostTest> posts;
    private final List<Person> contributors;

    public Blog(List<BlogPostTest> posts, List<Person> contributors) {
        this.posts = posts;
        this.contributors = contributors;
    }
}
