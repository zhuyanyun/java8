package design.patterns.chapter_11.proxy;

public interface PersonBean {

    String getName();
    String getGender();
    String getInterests();
    String getHotOrNotRating();

    String setName(String name);
    String setGender(String gender);
    String setInterests(String interests);
    String setHotOrNotRating(int rating);
}
