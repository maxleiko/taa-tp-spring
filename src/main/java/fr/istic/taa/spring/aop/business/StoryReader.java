package fr.istic.taa.spring.aop.business;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class StoryReader {

    public static void main(String args[]) {
        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("story-config.xml");
        StoryList storyList = (StoryList) beanFactory.getBean("storyList");
        List myStories = storyList.getStories();
        for (Object myStory : myStories) {
            Story currentStory = (Story) myStory;
            System.out.println("\"" + currentStory.getTitle() + "\" by "
                    + currentStory.getAuthor() + ":");
            System.out.println(currentStory.getContent());
            System.out.println();

        }

        storyList.test();
    }

}