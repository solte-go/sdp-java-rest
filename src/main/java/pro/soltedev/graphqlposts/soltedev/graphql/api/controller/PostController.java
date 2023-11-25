package pro.soltedev.graphqlposts.soltedev.graphql.api.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import pro.soltedev.graphqlposts.soltedev.graphql.api.data.Post;
import pro.soltedev.graphqlposts.soltedev.graphql.api.data.PostRepository;

@Controller
public class PostController {
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @QueryMapping
    public Iterable<Post> posts() {
        return this.postRepository.findAll();
    }

    @QueryMapping
    Post postById(@Argument long id) {
        return this.postRepository.findById(id).orElseThrow();

    }
}
