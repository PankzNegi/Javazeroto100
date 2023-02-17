package com.pankz.OOPS.builderdesignpattern.robot_build;

public class RobotDirector {
    private RobotBuilder robotBuilder;

    public RobotDirector(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot() {
        return this.robotBuilder.getRobot();


    }
    public void makerobot()
    {
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();
        this.robotBuilder.buildRobotTorso();
    }
}