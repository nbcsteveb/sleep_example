public class App {
    private static class SleepMessages {
        public void main(String args[])
            throws InterruptedException {
            String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
            };

            for (int i = 0;
                 i < importantInfo.length;
                 i++) {
                //Pause for 4 seconds
                Thread.sleep(4000);
                //Print a message
                System.out.println(importantInfo[i]);
            }
        }
    }

    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println("Sleeping..");
        String a[] = new String[12];
        SleepMessages b = new SleepMessages();
        try {
            b.main(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Outputting Greeting..");
        System.out.println(new App().getGreeting());
    }
}
