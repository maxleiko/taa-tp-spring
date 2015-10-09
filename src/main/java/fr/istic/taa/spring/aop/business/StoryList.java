package fr.istic.taa.spring.aop.business;
import java.util.List;

public class StoryList {

    private List<Story> stories;

    public void setStories(List<Story> stories) {
        this.stories = stories;
    }

    public List<Story> getStories() {
        return stories;
    }

    public void test() {
        System.out.println("foo bar");
    }
}