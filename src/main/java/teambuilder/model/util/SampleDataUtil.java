package teambuilder.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import teambuilder.model.ReadOnlyTeamBuilder;
import teambuilder.model.TeamBuilder;
import teambuilder.model.person.Address;
import teambuilder.model.person.Email;
import teambuilder.model.person.Major;
import teambuilder.model.person.Name;
import teambuilder.model.person.Person;
import teambuilder.model.person.Phone;
import teambuilder.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Person[] getSamplePersons() {
        return new Person[] {
            new Person(new Name("Alex Yeoh"), Phone.of("87438807"), new Email("alexyeoh@example.com"),
                new Address("Blk 30 Geylang Street 29, #06-40"), new Major("Computer Science"),
                getTagSet("friends"), getTagSet("Team A")),
            new Person(new Name("Bernice Yu"), Phone.of("99272758"), new Email("berniceyu@example.com"),
                new Address("Blk 30 Lorong 3 Serangoon Gardens, #07-18"), new Major("Computer Science"),
                getTagSet("colleagues", "friends"), getTagSet("Team A", "CS2103T G17")),
            new Person(new Name("Charlotte Oliveiro"), Phone.of("93210283"), new Email("charlotte@example.com"),
                new Address("Blk 11 Ang Mo Kio Street 74, #11-04"), new Major("Computer Science"),
                getTagSet("neighbours"), getTagSet("Rh Rockers")),
            new Person(new Name("David Li"), Phone.of("91031282"), new Email("lidavid@example.com"),
                new Address("Blk 436 Serangoon Gardens Street 26, #16-43"), new Major("Computer Science"),
                getTagSet("family"), getTagSet("Club penguin")),
            new Person(new Name("Irfan Ibrahim"), Phone.of("92492021"), new Email("irfan@example.com"),
                new Address("Blk 47 Tampines Street 20, #17-35"), new Major("Computer Science"),
                getTagSet("classmates"), getTagSet("RuneScapers")),
            new Person(new Name("Roy Balakrishnan"), Phone.of("92624417"), new Email("royb@example.com"),
                new Address("Blk 45 Aljunied Street 85, #11-31"), new Major("Computer Science"),
                getTagSet("colleagues"), getTagSet("Coding is fun club"))
        };
    }

    public static ReadOnlyTeamBuilder getSampleAddressBook() {
        TeamBuilder sampleAb = new TeamBuilder();
        for (Person samplePerson : getSamplePersons()) {
            sampleAb.addPerson(samplePerson);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
