package com.pankz.OOPS.builderdesignpattern.robot_build;


public class TestRobot {
    public static void main(String[] args) {
        RobotBuilder robot1=new OldRobotBuilder();
        Robot robot=new RobotDirector(new OldRobotBuilder()).makerobot();
        System.out.println(robot);

    }
}
