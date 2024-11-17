package Association.nurses.Association;

import Association.nurses.Association.Entity.*;
import Association.nurses.Association.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class AssociationApplication {

	private static final Object LAPSED = null;
	private static final Object ACTIVE = null ;

	public static void main(String[] args) {
		SpringApplication.run(AssociationApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(MemberRepository memberRepo, ChapterRepository chapterRepo, GuestRepository guestRepository, ChapterRepository chapterRepository, SpeakerRepository speakerRepository, ConferenceRepository conferenceRepository, EventRepository eventRepository) {
		return args -> {
			// Create some Members
			Object MemberStatus;
			Member member1 = new Member("Alice Smith", ACTIVE, LocalDate.of(2024, 1, 15));
			Member member2 = new Member("Bob Johnson", LAPSED, LocalDate.of(2023, 12, 10));
			Member member3 = new Member("Carol White", ACTIVE, LocalDate.of(2024, 5, 20));

//			// Save Members
//			SimpleJpaRepository memberRepository;
//			memberRepository.saveAll(Arrays.asList(member1, member2, member3));

			// Create a Chapter and assign members to it
			Chapter chapter1 = new Chapter("North District Chapter", "North District", member1, Arrays.asList(member1, member2));
			Chapter chapter2 = new Chapter("South District Chapter", "South District", member3, List.of(member3));

			// Save Chapters
			chapterRepository.saveAll(Arrays.asList(chapter1, chapter2));

			// Create some Guests
			Guest guest1 = new Guest("Emily Green", GuestStatus.ATTENDING);
			Guest guest2 = new Guest("David Brown", GuestStatus.NOT_ATTENDING);
			Guest guest3 = new Guest("Sophia Blue", GuestStatus.NO_RESPONSE);

			// Save Guests
			guestRepository.saveAll(Arrays.asList(guest1, guest2, guest3));

			// Create Speakers for Conferences
			Speaker speaker1 = new Speaker("Dr. John Williams", 60);  // presentation duration in minutes
			Speaker speaker2 = new Speaker("Dr. Sarah Thomas", 45);

			// Save Speakers
			speakerRepository.saveAll(Arrays.asList(speaker1, speaker2));

			// Create Conferences with Speakers
			Conference conference1 = new Conference("Nursing Innovations Conference", LocalDate.of(2024, 3, 1), 2, "Conference Hall A", Arrays.asList(guest1, guest2), Arrays.asList(speaker1, speaker2));
			List<?> or;
			Conference conference2 = new Conference("Annual Health Expo", LocalDate.of(2024, 8, 20), 3, "Expo Center B",List.;(guest3), List.of(speaker1);)

            // Save Conferences
			conferenceRepository.saveAll(Arrays.asList(conference1, conference2));

			// Create General Events
			Event event1 = new Event("Chapter Leadership Workshop", LocalDate.of(2024, 4, 10), 1, "Chapter Headquarters", Arrays.asList(guest1, guest3));
			Event event2 = new Event("Community Health Outreach", LocalDate.of(2024, 6, 15), 1, "Community Center", List.of(guest2));

			// Save Events
			eventRepository.saveAll(Arrays.asList(event1, event2));

			System.out.println("Sample data initialized");
		};
	}
}
