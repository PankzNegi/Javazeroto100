package com.pankz.OOPS.builderdesignpattern.robot_build;

public interface RobotBuilder {
    public void buildRobotHead();
    public void buildRobotTorso();
    public void buildRobotArms();
    public void buildRobotLegs();
    public Robot build();

}
