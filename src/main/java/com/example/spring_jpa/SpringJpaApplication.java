package com.example.spring_jpa;

import com.example.spring_jpa.Repo.AuthorRepository;
import com.example.spring_jpa.Repo.VideoRepository;
import com.example.spring_jpa.model.Author;
import com.example.spring_jpa.model.Video;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository , VideoRepository videoRepository){
		return args -> {
			var author = Author.builder()
					.id(1)
					.FirstName("logith")
					.LastName("vikram")
					.age(21)
					.email("logivikram@gmail.com")
					.build();

			repository.save(author);

         repository.updateAuthor(30,1);

			 author = Author.builder()
					.id(2)
					.FirstName("pranith")
					.LastName("K")
					.age(10)
					.email("pranith@gmail.com")
					.build();

			repository.save(author);

           repository.updateAllAuthorsAge(99);
//			var video = Video.builder()
//					.length(5)
//					.name("logith")
//					.build();
//
//			videoRepository.save(video);
		};
	}
}
