package Projects.TODO;

import java.util.ArrayList;
import java.util.Scanner;

public class TODO_List {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> list = new ArrayList<>();

        System.out.println("THIS IS YOUR TODO LIST");

        while (true) {

            System.out.printf("You have currently " + list.size() + " tasks listed!\n");
            System.out.println("ACTIONS:\n" +
                    "1 - SHOW\n" +
                    "2 -Add\n" +
                    "3 - Update\n" +
                    "4 - Completed\n" +
                    "5 - Incompleted\n" +
                    "6 - Delete\n" +
                    "7 - exit");

            int inp = scanner.nextInt();
            scanner.nextLine();

            if (inp >= 1 && inp <= ACTIONS.values().length) {
                ACTIONS action = ACTIONS.values()[inp - 1];

                switch (action) {

                    case ACTIONS.READ -> read(list);

                    case ACTIONS.ADD -> add(scanner, list);

                    case ACTIONS.UPDATE -> update(scanner, list);

                    case ACTIONS.COMPLETE -> getCompleted(list);

                    case ACTIONS.INCOMPLETE -> getIncompleted(list);

                    case ACTIONS.DELETE -> delete(scanner, list);

                    case ACTIONS.EXIT -> System.exit(0);

                    default -> System.out.println("choose a correct option");
                }

            } else {
                System.out.println("invalid Input, Enter from the available options!");
            }
        }

    }

    static Task checkTaskExistence(int id, ArrayList<Task> list) {
        for (Task task : list) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    static void read(ArrayList<Task> list) {

        System.out.println("----------------------------------------------------------");
        System.out.println("ID | DESCRIPTION | DUE DATE | COMPLETED | PRIORITY");
        for (Task tasks : list) {
            System.out.printf("%d | %s | %s | %b | %d\n", tasks.getId(), tasks.getDescription(), tasks.getDueDate(), tasks.isCompleted(), tasks.getPriority());
        }
        System.out.println("----------------------------------------------------------");
    }

    static void add(Scanner scanner, ArrayList<Task> list) {
        System.out.println("----------------------------------------------------------");
        try {

            System.out.print("Description of task: ");
            String des = scanner.nextLine();

            System.out.print("Due Date: ");
            String dueDate = scanner.nextLine();

            boolean isCompleted = false;

            System.out.print("priority: ");
            int priority = scanner.nextInt();
            scanner.nextLine();

            Task task = new Task(des, dueDate, isCompleted, priority);
            list.add(task);

            System.out.println("SUCCESS");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Priority must be a number.");
            scanner.nextLine();

        } catch (Exception e) {
            System.out.println("FAILURE");
            System.out.println(e);
        }
        System.out.println("----------------------------------------------------------");
    }

    static void update(Scanner scanner, ArrayList<Task> list) {
        System.out.println("----------------------------------------------------------");
        //firstly showing all the available tasks.
        read(list);

        try {

            System.out.print("Enter the Id number of the task that you wanna update:");

            int inp = scanner.nextInt();
            scanner.nextLine();

            Task existenceObj = checkTaskExistence(inp, list);

            if (existenceObj == null) {
                System.out.println("Invalid Task ID - Task does not exists");
                return;
            }

            System.out.println("Enter which field you wanna update");
            System.out.println("1 - Description\n2 - Due Date\n3 - Priority");

            int inpOP = scanner.nextInt();
            scanner.nextLine();

            if (inpOP >= 0 && inpOP <= FIELDS.values().length) {

                FIELDS field = FIELDS.values()[inpOP - 1];

                switch (field) {
                    case FIELDS.DESCRIPTION -> {

                        System.out.println("Enter the new description");

                        String des = scanner.nextLine();
                        existenceObj.setDescription(des);
                    }

                    case FIELDS.DUE_DATE -> {
                        System.out.println("Enter the new Due Date");

                        String date = scanner.nextLine();
                        existenceObj.setDueDate(date);
                    }
                    case FIELDS.PRIORITY -> {
                        System.out.println("Enter the new priority");

                        int priority = scanner.nextInt();
                        scanner.nextLine();
                        existenceObj.setPriority(priority);
                    }
                }
            } else {
                System.out.println("Enter correct option!");
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("----------------------------------------------------------");
    }

    static void delete(Scanner scanner, ArrayList<Task> list) {
        System.out.println("----------------------------------------------------------");
        read(list);

        try {

            System.out.print("Enter the Id number of the task that you wanna delete:");

            int inp = scanner.nextInt();
            scanner.nextLine();

            Task existenceObj = checkTaskExistence(inp, list);

            if (existenceObj == null) {
                System.out.println("Invalid Task ID - Task does not exists");
                return;
            }

            System.out.println("Are you sure that you wanna delete this task:" + existenceObj.getDescription());

            String final_confirm = scanner.nextLine();

            switch (final_confirm) {
                case "YES" -> {

                    //FROM THE ArrayList<Task> REMOVE THE OBJ existenceObj
                    list.remove(existenceObj);
                }
                case "NO" -> {
                    System.out.println("DELETION CANCELLED");
                }
                default -> System.out.println("Enter YES/NO");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("----------------------------------------------------------");
    }

    static void getIncompleted(ArrayList<Task> list) {
        System.out.println("----------------------------------------------------------");
        System.out.println("HERE IS THE LIST OF INCOMPLETED TASKS:");
        System.out.println("ID | DESCRIPTION | DUE DATE | COMPLETED | PRIORITY");

        for (Task task : list) {
            if (!task.isCompleted()) {
                System.out.printf("%d | %s | %s | %b | %d\n", task.getId(), task.getDescription(), task.getDueDate(), task.isCompleted(), task.getPriority());
            }
        }

        System.out.println("----------------------------------------------------------");
    }

    static void getCompleted(ArrayList<Task> list) {
        System.out.println("----------------------------------------------------------");
        System.out.println("HERE IS THE LIST OF COMPLETED TASKS:");
        System.out.println("ID | DESCRIPTION | DUE DATE | COMPLETED | PRIORITY");

        for (Task task : list) {
            if (task.isCompleted()) {
                System.out.printf("%d | %s | %s | %b | %d\n", task.getId(), task.getDescription(), task.getDueDate(), task.isCompleted(), task.getPriority());
            }
        }
        System.out.println("----------------------------------------------------------");
    }

}