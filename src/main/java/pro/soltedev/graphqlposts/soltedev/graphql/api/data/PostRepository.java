package pro.soltedev.graphqlposts.soltedev.graphql.api.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
