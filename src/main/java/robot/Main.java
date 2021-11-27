package robot;

public class Main {
    public static void main(String[] args) {

        Robot robotJimmy = new Robot();
        robotJimmy.setName("Jimmy");
        robotJimmy.setPrice(500);
        robotJimmy.setSeriesNo(1);

        Addon goldenHelmet = new Addon(150,"golden_name");
        robotJimmy.setAddon(goldenHelmet);

        RobotFeature navigation = new RobotFeature("google_maps");
        RobotFeature spotify = new RobotFeature("spotify");
        RobotFeature tinder = new RobotFeature("tinder");
        RobotFeature[] jimmyFeatures = {navigation,spotify,tinder};
        robotJimmy.setRobotFeatures(jimmyFeatures);

        System.out.println(robotJimmy);

        Robot robotMike = new Robot();
        robotMike.setName("Mike");
        robotMike.setPrice(850);
        robotMike.setSeriesNo(2);

        Addon flexArmGrip = new Addon(350,"flex_arm_grip");
        robotMike.setAddon(flexArmGrip);

        RobotFeature hdCameras = new RobotFeature("hd_Cameras");
        RobotFeature sixWheeler = new RobotFeature("six_Wheeler");
        RobotFeature solarPowered = new RobotFeature("solar_powered");
        RobotFeature[] mikeFeatures = {hdCameras,sixWheeler,solarPowered};
        robotMike.setRobotFeatures(mikeFeatures);

        System.out.println(robotMike);

    }

}
