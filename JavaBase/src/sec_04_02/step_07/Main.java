package sec_04_02.step_07;

public class Main {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i = 0; i < 3; i++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                i = 3;
            } catch (RobotConnectionException e) {
                if (i == 2)
                    throw new RobotConnectionException(e.getMessage(), e);
            } catch (Exception e) {
                throw e;
            }
        }
    }
}