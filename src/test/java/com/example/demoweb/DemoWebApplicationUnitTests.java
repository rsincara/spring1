package com.example.demoweb;

import com.example.demoweb.model.Post;
import com.example.demoweb.service.PostService;
import org.junit.Assert;
import com.example.demoweb.repository.PostRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.StreamSupport;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoWebApplicationUnitTests {
	@MockBean
	private PostRepository postRepository;

//	@Autowired
//	PostService postService;

	@Test
	public void saveTest() {
		PostService postService = new PostService(postRepository);

		String content = "testing";
		Post post = new Post(null, content, new Date());
		postService.create(content);
		Mockito.verify(postRepository, Mockito.times(1))
				.save(Mockito.argThat(x ->
						Objects.equals(x.id(), post.id())
								&& Objects.equals(x.text(), post.text()))
				);

	}

	@Test
	public void removeTest() {
		PostService postService = new PostService(postRepository);
		long id = 13;
		Post post = new Post(id, "testing", new Date());
		int postsCountBeforeAdding = postService.getPostsCount();
		postService.addPost(post);
		postService.remove(id);
		int postsCountAfterRemove = postService.getPostsCount();
		Assert.assertEquals(0, postsCountBeforeAdding - postsCountAfterRemove);
	}
}