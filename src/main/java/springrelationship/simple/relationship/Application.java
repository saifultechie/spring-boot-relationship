package springrelationship.simple.relationship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springrelationship.simple.relationship.entity.*;
import springrelationship.simple.relationship.repository.CommentRepository;
import springrelationship.simple.relationship.repository.PostRepository;
import springrelationship.simple.relationship.repository.UserProfileRepository;
import springrelationship.simple.relationship.repository.UserRepository;

import java.time.LocalDate;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserProfileRepository userProfileRepository;
	@Autowired
	private PostRepository postRepository;
	@Autowired
	private CommentRepository commentRepository;
	@Override
	public void run(String... args) throws Exception {
//		User user = new User();
//		user.setName("saiful");
//		user.setEmail("saiful123@gmail.com");
//
//		UserProfile userProfile = new UserProfile();
//		userProfile.setAddress("dhaka");
//		userProfile.setBirthofdate(LocalDate.of(2016,03,24));
//		userProfile.setPhoneNumber("123456");
//		userProfile.setGender(Gender.MALE);
//
//		user.setUserProfile(userProfile);
//		userProfile.setUser(user);
//
//		userRepository.save(user);
//		Post post = new Post("java is a good language","its also describes the main power of knoweleg");
//		Comment comment1 = new Comment("its good");
//		Comment comment2 = new Comment("its informative");
//		Comment comment3 = new Comment("its knowledgeable");
//
//		post.getComments().add(comment1);
//		post.getComments().add(comment2);
//		post.getComments().add(comment3);
//
//		postRepository.save(post);

	}
}
