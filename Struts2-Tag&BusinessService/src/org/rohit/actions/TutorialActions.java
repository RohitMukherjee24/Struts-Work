package org.rohit.actions;

import org.rohit.service.TutorialFinderService;

/**
 * Created by rohit on 1/24/2017.
 */
public class TutorialActions {

    private String bestTutorialSight;

    public String execute(){
        TutorialFinderService tutorialFinderService = new TutorialFinderService();
        System.out.println(tutorialFinderService.getBestTutorialSite());
        setBestTutorialSight(tutorialFinderService.getBestTutorialSite());
        System.out.println("Execute Method Runs!!!");
        return "success";
        //return "failure";
    }

    public String getBestTutorialSight() {
        return bestTutorialSight;
    }

    public void setBestTutorialSight(String bestTutorialSight) {
        this.bestTutorialSight = bestTutorialSight;
    }
}
