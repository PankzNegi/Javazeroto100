package com.pankz.OOPS.builderdesignpattern.robot_build;


public class OldRobotBuilder implements RobotBuilder{
    private Robot robot;
    public OldRobotBuilder()

    {
        this.robot=new Robot();
    }

    @Override
    public void buildRobotHead() {
        this.robot.setRobotHead("Tin Head");

    }

    @Override
    public void buildRobotTorso() {
        this.robot.setRobotTorso("Tin Torso");

    }

    @Override
    public void buildRobotArms() {
        this.robot.setRobotArms("Blowtorch Arms");

    }

    @Override
    public void buildRobotLegs() {
        this.robot.setRobotLegs("Roller skates");

    }
    public  Robot build()
    {
        return robot;
    }
//    public Robot getRobot()
//    {
//        return this.robot;
//    }

}



