package org.rohit.actions;

import org.rohit.service.TutorialFinderService;

/**
 * Created by rohit on 1/24/2017.
 */
public class TutorialActions {

    private String bestTutorialSight;
    private  String language;

    public String getTutorial(){
        TutorialFinderService tutorialFinderService = new TutorialFinderService();
        setBestTutorialSight(tutorialFinderService.getBestTutorialSite(getLanguage()));
        System.out.println("GetTutorial Method Runs!!!");
        return "success";
        //return "failure";
        //return "searchForm";
    }

    public String addTutorial(){
        TutorialFinderService tutorialFinderService = new TutorialFinderService();
        setBestTutorialSight(tutorialFinderService.getBestTutorialSite(getLanguage()));
        System.out.println("addTutorial Method Runs!!!");
        return "success";
        //return "failure";
        //return "searchForm";
    }


    public String someOtherMethod(){
        System.out.println("Some Other Method!!");
        return "success";
    }
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getBestTutorialSight() {
        return bestTutorialSight;
    }

    public void setBestTutorialSight(String bestTutorialSight) {
        this.bestTutorialSight = bestTutorialSight;
    }
}
