package ua.qa.pft.testingweb;


public class NewLesson17 {
    public static void main(String[] args) {

    Robot Robot = new Robot(0, 0, Direction.UP);
    moveRobot(Robot, 5, 2);



    }
    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int X;
        int Y;
        Direction dir;


        public Robot(int X, int Y, Direction dir) {
            this.X = X;
            this.Y = Y;
            this.dir = dir;
        }


        public Direction getDirection() {
            // текущее направление взгляда
            return dir;
        }

        public int getX() {
            // текущая координата X
            return X;
        }

        public int getY() {
            // текущая координата Y
            return Y;
        }

        public void turnLeft() {
          if (dir == Direction.UP){
              dir = Direction.LEFT;
           }
          else if (dir == Direction.DOWN){
              dir = Direction.RIGHT;
          }
          else if (dir == Direction.LEFT){
              dir = Direction.DOWN;
          }
          else if (dir == Direction.RIGHT){
              dir = Direction.UP;
          }
            // повернуться на 90 градусов против часовой стрелки
        }

        public void turnRight() {
            if (dir == Direction.UP){
                dir = Direction.RIGHT;
            }
            else if (dir == Direction.DOWN){
                dir = Direction.LEFT;
            }
            else if (dir == Direction.LEFT){
                dir = Direction.UP;
            }
            else if (dir == Direction.RIGHT){
                dir = Direction.DOWN;
                // повернуться на 90 градусов по часовой стрелке
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                Y++;
            }
            else if (dir == Direction.RIGHT){
                X++;
            }
            else if (dir == Direction.DOWN){
                Y--;
            }
            else if (dir == Direction.LEFT){
                X--;
            }
            // шаг в направлении взгляда
            // за один шаг робот изменяет одну свою координату на единицу
        }


    }
    public static void moveRobot(Robot robot, int toX, int toY){
        if (robot.getY() < toY){
            if (robot.getDirection() == Direction.LEFT) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                   System.out.println(robot.X + ", " + robot.Y + ", " + robot.dir);
                }

            }
            else {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnLeft();
                   System.out.println(robot.X + ", " + robot.Y + ", " + robot.dir);
                }
            }
            while (robot.getY() != toY){
                robot.stepForward();
                System.out.println(robot.X + ", " + robot.Y + ", " + robot.dir);
            }
        }
        if (robot.getY() > toY){
            if (robot.getDirection() == Direction.RIGHT){
                while (robot.getDirection() != Direction.DOWN){
                    robot.turnRight();
                    System.out.println(robot.X + ", " + robot.Y + ", " + robot.dir);
                }
            }
            else {
                while (robot.getDirection() != Direction.DOWN){
                    robot.turnLeft();
                    System.out.println(robot.X + ", " + robot.Y + ", " + robot.dir);
                }
            }
            while (robot.getY() != toY) {
                robot.stepForward();
                System.out.println(robot.X + ", " + robot.Y + ", " + robot.dir);
            }
        }
        if (robot.getX() < toX) {
            if (robot.getDirection() == Direction.UP){
                while (robot.getDirection() != Direction.RIGHT){
                    robot.turnRight();
                    System.out.println(robot.X + ", " + robot.Y + ", " + robot.dir);
                }
            }
            else {
                while (robot.getDirection() != Direction.RIGHT){
                    robot.turnLeft();
                    System.out.println(robot.X + ", " + robot.Y + ", " + robot.dir);
                }
            }
            while (robot.getX() != toX) {
                robot.stepForward();
                System.out.println(robot.X + ", " + robot.Y + ", " + robot.dir);
            }
        }
        if (robot.getX() > toX){
            if (robot.getDirection() == Direction.DOWN){
                while (robot.getDirection() != Direction.LEFT){
                    robot.turnRight();
                    System.out.println(robot.X + ", " + robot.Y + ", " + robot.dir);
                }
            }
            else {
                while (robot.getDirection() != Direction.LEFT){
                    robot.turnLeft();
                    System.out.println(robot.X + ", " + robot.Y + ", " + robot.dir);
                }
            }
            while (robot.getX() != toX) {
                robot.stepForward();
               System.out.println(robot.X + ", " + robot.Y + ", " + robot.dir);
            }
            }

        if (robot.getX() != toX && robot.getY() != toY){
            moveRobot(robot, toX, toY);
        }
    }



}



