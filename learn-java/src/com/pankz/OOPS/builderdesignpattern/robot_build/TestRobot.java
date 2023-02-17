package com.pankz.OOPS.builderdesignpattern.robot_build;


import com.pankz.OOPS.builderdesignpattern.prepare_my_meal.VegMealBuilder;

public class TestRobot {
    public static void main(String[] args) {
        RobotBuilder robot1=new OldRobotBuilder();
        Robot robot=new RobotDirector(new OldRobotBuilder()).getRobot();
        System.out.println(robot);

    }
}
